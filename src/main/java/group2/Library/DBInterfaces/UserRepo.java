/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group2.Library.DBInterfaces;
import group2.Library.Services.Model.UserProfile;
import java.util.ArrayList;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
//import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Ben Xu
 */
@RepositoryRestResource
public interface UserRepo extends MongoRepository<UserProfile, String>{
    
    UserProfile findByID(int d);
    UserProfile findByusername(String name);
    @Override
    List<UserProfile> findAll();

    //public void save(UserProfile u2, String user);
    
}
