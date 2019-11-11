package group2.Library.Services;



import group2.Library.DBInterfaces.AuthorRepository;
import group2.Library.DBInterfaces.RoomRepo;
import group2.Library.DBInterfaces.RoomRepository;
import group2.Library.Services.Model.Author;
import group2.Library.Services.Model.RoomSchedule;
import java.util.ArrayList;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class LibraryServicesApplicationTests {

        @Autowired
        private AuthorRepository repository;
        
        @Autowired RoomRepository   rrepo;
        
        @Autowired
        private TestEntityManager entityManager;
        
        private static final Logger log = LoggerFactory.getLogger(LibraryServicesApplication.class);
        
        
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
        
        @Test
        public void testRoom(){
            
            
        }

}
