FROM openjdk:17-oracle

EXPOSE 8080

ARG JAR_FILE=build/libs/springbootgke-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE}  gkeapp.jar
ENTRYPOINT ["java","-jar","gkeapp.jar"]