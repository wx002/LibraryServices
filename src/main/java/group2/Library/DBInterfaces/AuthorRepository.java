package group2.Library.DBInterfaces;

import group2.Library.Services.Model.Author;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 * FlightRepository
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
    List<Author> findByauthname(String authname); 
    
    @Override
    List<Author> findAll();
}