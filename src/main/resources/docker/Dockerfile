FROM java:8
VOLUME /tmp
ADD goshare-comment-services-0.0.1.jar services.jar
EXPOSE 8081
RUN sh -c 'touch /goshare-comment-services-0.0.1.jar'
ENTRYPOINT ["java", "-Dspring.data.mongodb.uri=mongodb://mongodb/geoshare", "-Djava.security.egd=file:/dev/./urandom","-jar","/services.jar"]