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
    public CommandLineRunner demo(AuthorRepository repository) {
        return new CommandLineRunner() {
            @Override
            public void run(String[] args) throws Exception {
                // fetch all customers
                log.info("Authors found with findAll():");
                log.info("-------------------------------");
                
                repository.findByauthname("Patrick Rothfuss").forEach(
                        (author) -> 
                        {author.getBooks().forEach((book) ->
                            {log.info(book.toString());});
                         }
                        );
                       
                /*
                repository.findAll().forEach((authName) -> {
                log.info(authName.toString());
                });
                log.info("");
                */
            }
        };
    }

}
