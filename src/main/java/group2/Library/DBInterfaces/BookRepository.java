/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group2.Library.DBInterfaces;


import group2.Library.Services.Model.Book;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


/**
 * BookRepository
 */
@RepositoryRestResource
public interface BookRepository extends CrudRepository<Book, Long>  {
    List<Book> findByisbn(String isbn);
    
    @Override
    List<Book> findAll();
    
}
