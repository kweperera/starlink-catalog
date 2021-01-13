FROM openjdk:8
ADD target/catalog-user.jar catalog-user.jar
EXPOSE 8089
ENTRYPOINT ["java", "-jar", "catalog-user.jar"]
