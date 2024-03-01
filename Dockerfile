FROM openjdk:17
ADD target/dockerjava-0.0.1-SNAPSHOT.jar creditscore-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "creditscore-0.0.1-SNAPSHOT.jar"]
