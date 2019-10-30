/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group2.Library.DBInterfaces;
import group2.Library.Services.Model.UserProfile;
import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Ben Xu
 */
public interface UserRepo extends CrudRepository<UserProfile, String>{
    public void create(UserProfile m);
    public void update(UserProfile m);
    @Override
    public void delete(UserProfile m);
    @Override
    public void deleteAll();
    public ArrayList<UserProfile> findByLibraryID(int d);
    public ArrayList<UserProfile> findByName(String name);
}
