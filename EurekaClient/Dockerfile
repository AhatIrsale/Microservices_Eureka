# Stage 1: Build with Maven
FROM maven:3.8.4-openjdk-17 AS builder
WORKDIR /app
COPY ./src ./src
COPY ./pom.xml .
RUN mvn clean package

# Stage 2: Create the final image

FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} ServiceClient.jar
EXPOSE 8088
ENTRYPOINT ["java", "-jar", "/ServiceClient.jar"]