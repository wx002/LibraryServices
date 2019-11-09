/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group2.Library.DBInterfaces;


import group2.Library.Services.Model.Fee;
import group2.Library.Services.Model.User;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


/**
 * BookRepository
 */
@RepositoryRestResource
public interface FeeRepository extends CrudRepository<Fee, Long>  {
    List<Fee> findByfeetype(String feetype);
    
    List<Fee> findByuserid(User userid);
    
    @Override
    List<Fee> findAll();
    
}
