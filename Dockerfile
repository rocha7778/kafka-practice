FROM maven:3.6.0-jdk-11-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package


FROM adoptopenjdk/openjdk11:alpine-jre
COPY --from=build /home/app/target/usersignup-0.0.1-SNAPSHOT.jar /usr/local/lib/demo.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/demo.jar"]



# mysql

# docker create -p 3307:3306 --name mysql-product-query --network cqrs  -e MYSQL_ROOT_PASSWORD=123456 -e MYSQL_DATABASE=product mysql 
# docker start mysql-product-query 