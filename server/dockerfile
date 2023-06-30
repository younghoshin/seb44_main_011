FROM adoptopenjdk/openjdk11

# COPY ./build/libs/<프로젝트명>-<버전>-SNAPSHOT.jar app.jar
ARG JAR_FILE=builds/libs/*.jar
COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
