FROM openjdk:8-jdk-alpine

ARG JAR_FILE=target/k8s_Docker_Java-0.0.1-SNAPSHOT.jar
#Vermutlich Path nicht richig!!
COPY ${JAR_FILE} k8s_Docker_Java-0.0.1-SNAPSHOT.jar
CMD ["tuerme-von.hanoi", "main"]


