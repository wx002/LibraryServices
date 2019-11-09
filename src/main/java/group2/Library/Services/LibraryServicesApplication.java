package group2.Library.Services;

import group2.Library.DBInterfaces.UserRepo;
import group2.Library.DBInterfaces.TransactionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages={"group2.Library.Services.Controller"})
@EnableJpaRepositories("group2.Library.DBInterfaces")
//@EntityScan("group2.Library.DBInterfaces")
public class LibraryServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryServicesApplication.class, args);
	}
        
        private static final Logger log = LoggerFactory.getLogger(LibraryServicesApplication.class);
        
        @Bean
        public CommandLineRunner demo(TransactionRepository repository) {
            return new CommandLineRunner() {
            @Override
            public void run(String[] args) throws Exception {
                // fetch all customers
                
                log.info("Authors found with findAll():");
                log.info("-------------------------------");
                    
                
                //log.info(repository.findByuserid(rep2.findBylastname("Rejuso").get(0)).toString());
                
                repository.findAll().forEach((authName) -> {
                log.info(authName.toString());
                });
                
                log.info("");
                
            }
        };
    }
}


