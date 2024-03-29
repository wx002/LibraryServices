/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group2.Library.DBInterfaces;


import group2.Library.Services.Model.User;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


/**
 * BookRepository
 */
@RepositoryRestResource
public interface UserRepository extends CrudRepository<User, Long>  {
    List<User> findBylastname(String lastName);
    List<User> findByusername(String username);
    User findByemail(String email);
    
    @Override
    List<User> findAll();
    
}
