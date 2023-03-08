package house.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import house.beans.House;
/**
 * @author andrewmccoy - agmccoy
 * CIS175 - Fall 2021
 * Mar 7, 2023
 */
@Configuration
public class BeanConfiguration {

	@Bean
	House house() {
		House bean = new House("Murphy Home", "Washington", "Deleware Ave", true);
		return bean;
	}
	
}
