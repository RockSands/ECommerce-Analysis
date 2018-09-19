package com.ckw.eca.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:/config/spark.properties")
public class SparkProperties {
	
	@Value("${spark.local}")
	private boolean isLocal;
	
	@Value("${spark.local.taskid.session}")
	private String taskidSession;
	
	@Value("${spark.local.taskid.page}")
	private String taskidPage;
}
