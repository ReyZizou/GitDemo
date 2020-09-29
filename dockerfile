FROM maven:3.6.0-jdk-11-slim AS build
COPY DEMO2 /home/app/src
RUN mvn -f /home/app/src/pom.xml clean package

#
# Package stage
#
FROM openjdk:11-jre-slim
COPY --from=build /home/app/src/target/DEMO2-0.0.1-SNAPSHOT.jar /usr/local/lib/demo.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/demo.jar"]
