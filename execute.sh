#!/bin/bash
mvn clean package

docker build -t tuerme-von-hanoi:local .

docker save tuerme-von-hanoi > tuerme-von-hanoi.tar

microk8s ctr image import tuerme-von-hanoi.tar

microk8s kubectl apply -f deployment.yaml

microk8s kubectl rollout restart deploy demo