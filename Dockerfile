FROM java:8
VOLUME /tmp
ADD target/simple-web-docker-0.0.1-SNAPSHOT.jar swd.jar
RUN sh -c 'touch /swd.jar'
ENTRYPOINT ["java","-jar","/swd.jar"]
