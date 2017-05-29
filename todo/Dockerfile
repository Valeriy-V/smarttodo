FROM java:8-jre
MAINTAINER JV-demo <jv@demo.com>

ADD ./target/todo-0.1-SNAPSHOT.jar /app/
CMD ["java", "-Dspring.data.mongodb.uri=mongodb://mongodb/login_service", "-Deureka.client.serviceUrl.defaultZone=" "-jar", "/app/todo-0.1-SNAPSHOT.jar"]

EXPOSE 8099