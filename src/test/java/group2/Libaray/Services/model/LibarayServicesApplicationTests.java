package group2.Libaray.Services.model;

import group2.Libaray.Services.model.Author;
import group2.Libaray.Services.model.AuthorRepository;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class LibarayServicesApplicationTests {

        @Autowired
        private AuthorRepository repository;
        
        @Autowired
        private TestEntityManager entityManager;
        
	@Test
	public void testAdd() {
            final String AUTHNAME = "George R. R. Martin";
            Author gotAuthor = new Author();
            gotAuthor.setAuthname(AUTHNAME);
            entityManager.persist(gotAuthor);
            entityManager.flush();
            
            Author found = repository.findByauthname(AUTHNAME).get(0);
            
            Assertions.assertThat(found.getAuthname()).isEqualTo(gotAuthor.getAuthname());
	}

}
