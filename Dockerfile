FROM eclipse-temurin:21-jre
WORKDIR /app
COPY target/user-module-*.jar app.jar
EXPOSE 6565
ENTRYPOINT ["java", "-jar", "app.jar"]