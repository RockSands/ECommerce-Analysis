package com.ckw.eca.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:/config/kafka.properties")
public class KafkaProperties {
	
	@Value("${kafka.metadata.broker.list}")
	private List<String> metadataBrokerList;
	
	@Value("${kafka.topics}")
	private String topics;
}
