FROM openjdk:10
WORKDIR usr/src
ADD ./target/kafkaconsumerdemo-0.0.1-SNAPSHOT.jar /usr/src/kafkaconsumerdemo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar", "/usr/src/kafkaconsumerdemo-0.0.1-SNAPSHOT.jar"]
