#FROM initializes a new build stage in our case we're
#Using java version 17 alpine(slimmed down)
FROM openjdk:17-jdk-alpine

# ADD a volume pointing to /tmp to store persistent data
VOLUME /tmp

# The application's jar file store in an ARG build time variable this is only
#accesable while the image is being built
ARG JAR_FILE=target/passengerspring-0.0.1-SNAPSHOT.jar

# ADD copys the application's jar to the container from the args directory
ADD ${JAR_FILE} passengerspring-0.0.1-SNAPSHOT.jar

# The ENTRYPOINT will set executable that will run when container is initiated
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/passengerspring-0.0.1-SNAPSHOT.jar"]