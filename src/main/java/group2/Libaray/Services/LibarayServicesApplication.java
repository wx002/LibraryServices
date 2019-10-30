package group2.Libaray.Services;

import group2.Libaray.Services.model.AuthorRepository;
import group2.Libaray.Services.model.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LibarayServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibarayServicesApplication.class, args);
	}
        
        private static final Logger log = LoggerFactory.getLogger(LibarayServicesApplication.class);
        
        @Bean
    public CommandLineRunner demo(BookRepository repository) {
        return (args) -> {
            // fetch all customers
            log.info("auth found with findAll():");
            log.info("-------------------------------");
            repository.findAll().forEach((authName) -> {
                log.info(authName.toString());
            });
            log.info("");
        };
    }

}
