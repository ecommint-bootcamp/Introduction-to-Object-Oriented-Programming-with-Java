package org.javaturk.rest.greet.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;


@Configuration
@ComponentScan({ "org.javaturk.rest.greet.resource", "org.javaturk.rest.greet.repo" })
public class AppConfig {

	@Bean
	public MappingJackson2HttpMessageConverter jsonMessageConverter() {
		return new MappingJackson2HttpMessageConverter();
	}
	
	@Bean
	public MappingJackson2XmlHttpMessageConverter xmlMessageConverter() {
		return new MappingJackson2XmlHttpMessageConverter();
	}
	
	@Bean
	public RequestMappingHandlerAdapter requestMappingHandlerAdapter() {
		RequestMappingHandlerAdapter adapter = new RequestMappingHandlerAdapter();
		List list = new ArrayList();
		list.add(jsonMessageConverter());
		list.add(xmlMessageConverter());
		adapter.setMessageConverters(list);
		return adapter;
	}

}
