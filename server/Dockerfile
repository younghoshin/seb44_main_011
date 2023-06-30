FROM adoptopenjdk/openjdk11

#ARG JAR_FILE=builds/libs/server-0.0.1-SNAPSHOT.jar
#COPY ${JAR_FILE} app.jar
#COPY --chown=appuser:appuser target/**.jar /home/appuser/app.jar

COPY server/build/libs/server-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
