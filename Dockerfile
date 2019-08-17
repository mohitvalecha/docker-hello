FROM openjdk:8
ADD target/docker-springboot-hello.jar docker-springboot-hello.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "docker-springboot-hello.jar"]
