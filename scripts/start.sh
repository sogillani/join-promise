#!/bin/bash

set -x

if ! docker ps
then
  open -a Docker
  while (! docker stats --no-stream ); do
    # Docker takes a few seconds to initialize
    echo "Waiting for Docker to launch..."
    sleep 5
  done
fi

# Run Postgres DB in docker
docker run --name postgres \
  -p 5432:5432 \
  -e POSTGRES_PASSWORD=password \
  -d postgres

# Run pgadmin in docker
docker run --name pgadmin \
  -p 8181:80 \
  -e PGADMIN_DEFAULT_EMAIL=admin@admin.com \
  -e PGADMIN_DEFAULT_PASSWORD=password \
  -d dpage/pgadmin4