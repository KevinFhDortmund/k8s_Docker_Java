FROM openjdk:21-jdk

ARG JAR_FILE=target/k8s_Docker_Java-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} k8s_Docker_Java-0.0.1-SNAPSHOT.jar
CMD ["java", "-classpath" ,  "k8s_Docker_Java-0.0.1-SNAPSHOT.jar" ,  "koester.k8s_docker_java.K8sDockerJavaApplication"]


