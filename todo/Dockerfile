FROM java:8-jre
MAINTAINER JV-demo <jv@demo.com>

ADD ./target/todo-0.1-SNAPSHOT.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/todo-0.1-SNAPSHOT.jar"]

EXPOSE 8099