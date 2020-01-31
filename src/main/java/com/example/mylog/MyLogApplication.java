package com.example.mylog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
@EnableConfigurationProperties({ MyLogProperties.class, MyLogOtherProperties.class,
		CdcStreamProperties.class, CdcCommonProperties.class })
@EnableBinding(Sink.class)
public class MyLogApplication {

	private static final Logger logger = LoggerFactory.getLogger(MyLogApplication.class);

	private final MyLogProperties properties;

	private final MyLogOtherProperties otherProperties;

	@Autowired
	public MyLogApplication(MyLogProperties properties, MyLogOtherProperties otherProperties) {
		this.properties = properties;
		this.otherProperties = otherProperties;
	}

	@StreamListener(Sink.INPUT)
	public void handler(byte[] payload) {
		logger.info("Hello World: " + properties.getDugong() + " Other: " + otherProperties.getOrca());
	}

	public static void main(String[] args) {
		SpringApplication.run(MyLogApplication.class, args);
	}
}
