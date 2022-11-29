package com.app.topdoc.config;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.rest_client.RestClientTransport;
import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.topdoc.controllers.ClinicSetupController;

@Configuration
public class ElasticSearchConfiguration {

	public static final Logger LOGGER = LoggerFactory.getLogger(ClinicSetupController.class);

	@Bean
	public RestClient getRestClient() {
		RestClient restClient = RestClient.builder(new HttpHost("localhost", 9200)).build();
		return restClient;
	}

	@Bean
	public ElasticsearchTransport getElasticsearchTransport() {
		return new RestClientTransport(getRestClient(), new JacksonJsonpMapper());
	}

	@Bean
	public ElasticsearchClient getElasticsearchClient() {
		ElasticsearchClient client = new ElasticsearchClient(getElasticsearchTransport());
		LOGGER.info("Elasticsearch is up and running");
		return client;
	}

	/*
	 * ElasticsearchClient client = getElasticsearchClient();
	 * 
	 * private ElasticsearchClient getElasticsearchClient() { RestClient builder =
	 * RestClient.builder(new HttpHost("localhost", 9200)).build();
	 * 
	 * ElasticsearchTransport transport = new RestClientTransport(builder, new
	 * JacksonJsonpMapper());
	 * 
	 * return new ElasticsearchClient(transport); }
	 */

}
