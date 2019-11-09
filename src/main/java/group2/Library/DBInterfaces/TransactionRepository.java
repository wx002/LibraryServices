/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group2.Library.DBInterfaces;

import group2.Library.Services.Model.Transaction;
import group2.Library.Services.Model.User;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author RR
 */
@RepositoryRestResource
public interface TransactionRepository extends CrudRepository<Transaction, Long>  {
    List<Transaction> findByitemstatus(String itemstatus);
    
    List<Transaction> findByuserid(User userid);
    
    List<Transaction> findBybookID(User bookID);
    
    @Override
    List<Transaction> findAll();
    
}