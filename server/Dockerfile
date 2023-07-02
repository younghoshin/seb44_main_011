#FROM adoptopenjdk/openjdk11
#
#COPY server/build/libs/server-0.0.1-SNAPSHOT.jar app.jar
#
#ENTRYPOINT ["java", "-jar", "app.jar"]
# 이미지 빌드 단계
FROM adoptopenjdk/openjdk11:jre-11.0.11_9-alpine AS build

WORKDIR /app

# 종속성 설치를 위해 build.gradle 및 build.gradle.kts 복사
COPY server/build.gradle server/build.gradle.kts ./

# 종속성 설치를 위해 gradle 래퍼 파일 복사
COPY server/gradlew server/gradlew.bat ./
COPY server/gradle/ ./gradle/

# 종속성 설치
RUN ./gradlew dependencies

# 소스 코드 복사
COPY server/src ./src/

# 빌드 수행
RUN ./gradlew build

# 최종 이미지 구성 단계
FROM adoptopenjdk/openjdk11:jre-11.0.11_9-alpine

WORKDIR /app

# 빌드 단계에서 생성된 JAR 파일을 최종 이미지로 복사
COPY --from=build /app/server/build/libs/server-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
