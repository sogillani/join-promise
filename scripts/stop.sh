#!/bin/bash

set -x

docker stop postgres
docker stop pgadmin

docker rm postgres
docker rm pgadmin

