FROM maven:3.8.5-openjdk-11 AS build 

COPY /src /app/src

COPY /pom.xml /app

RUN mvn -f /app/pom.xml clean package -Dmaven.test.skip

FROM openjdk:11

LABEL key="core.ics.token"

WORKDIR /usr/src/app

COPY --from=build /app/target/*.jar token.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "token.jar"]