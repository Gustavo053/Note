FROM openjdk:11
MAINTAINER https://github.com/Gustavo053
COPY target/note-0.0.1-SNAPSHOT.jar note-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "note-0.0.1-SNAPSHOT.jar"]