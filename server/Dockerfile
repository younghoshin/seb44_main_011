FROM adoptopenjdk/openjdk11

# COPY ./build/libs/<프로젝트명>-<버전>-SNAPSHOT.jar app.jar
ARG JAR_FILE=builds/libs/server-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
#COPY --chown=appuser:appuser target/**.jar /home/appuser/app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
