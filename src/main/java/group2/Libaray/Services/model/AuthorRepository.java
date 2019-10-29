package group2.Libaray.Services.model;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 * FlightRepository
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
    List<Author> findByName(String name); 
    
    @Override
    List<Author> findAll();
}