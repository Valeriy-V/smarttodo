FROM java:8-jre
MAINTAINER JV-demo <jv@demo.com>

ADD ./target/login-0.1-SNAPSHOT.jar /app/
CMD ["java", "-Dspring.data.mongodb.uri=mongodb://mongodb/login_service", "-jar", "/app/login-0.1-SNAPSHOT.jar"]

EXPOSE 8077