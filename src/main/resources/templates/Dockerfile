FROM springcloud/openjdk:2.0.1.RELEASE
ENV LANG=C.UTF-8
ARG JAR_FILE
ADD target/${JAR_FILE} my-log-sink.jar
LABEL spring.configuration.metadata=@spring.configuration.metadata.encoded@
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/my-log-sink.jar"]
