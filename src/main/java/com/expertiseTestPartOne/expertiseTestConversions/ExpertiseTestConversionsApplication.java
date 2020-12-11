package com.expertiseTestPartOne.expertiseTestConversions;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.filter.OrderedFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.util.StopWatch;
import org.springframework.web.filter.OncePerRequestFilter;

import jdk.internal.org.jline.utils.Log;

@SpringBootApplication
public class ExpertiseTestConversionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpertiseTestConversionsApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean<OncePerRequestFilter> executionTimeLoggingFilter() {
		return new FilterRegistrationBean<OncePerRequestFilter>() {{
			setOrder(OrderedFilter.REQUEST_WRAPPER_FILTER_MAX_ORDER);
			setFilter(new OncePerRequestFilter() {
				
				@SuppressWarnings("restriction")
				@Override
				protected void doFilterInternal(HttpServletRequest req, HttpServletResponse res, FilterChain chain)
					throws ServletException, IOException {
					StopWatch watch = new StopWatch();
					watch.start();
					try {
						chain.doFilter(req, res);
					} finally {
						watch.stop();
						Log.info("REQUEST: {} completed within {} ms", req.getRequestURI(), watch.getTotalTimeMillis());
					}
					
				}
			});
		}};
		
	}
}
