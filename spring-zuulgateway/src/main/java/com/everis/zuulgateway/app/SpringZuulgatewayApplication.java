package com.everis.zuulgateway.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class SpringZuulgatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringZuulgatewayApplication.class, args);
	}
	
	@Bean
	public PreFilter preFilter() {
	  return new PreFilter();
	}
	
	@Bean PostFilter postFilter() {
	  return new PostFilter();
	}
	
	@Bean
	public ErrorFilter errorFilter() {
	  return new ErrorFilter();
	}
	
	@Bean
	public RouteFilter routeFilter() {
	  return new RouteFilter();
	}

}
