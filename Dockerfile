FROM Openjdk:17
COPY "./target/spring-boot-data-jpa-gestion-0.0.1-SNAPSHOT.jar" "app.jar"
EXPOSE 5012
ENTRYPOINT [ "java", "-jar", "app.jar" ]