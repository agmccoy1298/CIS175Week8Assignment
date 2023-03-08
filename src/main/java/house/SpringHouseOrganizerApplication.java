package house;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import house.beans.*;
import house.controller.*;
import house.repository.*;

@SpringBootApplication
public class SpringHouseOrganizerApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringHouseOrganizerApplication.class, args);
		
	}

	@Autowired
	HouseRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		House mh = appContext.getBean("house", House.class);
		mh.setHouseName("McCoy House");
		repo.save(mh);
		
		House jh = new House("Jones House", "Urbandale", "Aurora Ave", false);
		jh.setHasGarage(true);
		repo.save(jh);
		
		
		List<House> allMyHouses = repo.findAll();
		for(House house: allMyHouses) {
			System.out.println(house.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	}	
	
}
