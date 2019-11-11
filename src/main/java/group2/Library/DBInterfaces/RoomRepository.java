/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group2.Library.DBInterfaces;

import group2.Library.Services.Model.RoomReserve;
import java.sql.Timestamp;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author RR
 */
@RepositoryRestResource
public interface RoomRepository extends CrudRepository<RoomReserve, Long>  {
    List<RoomReserve> findByroomid(int roomid);
    
    List<RoomReserve> findByreserveStart(Timestamp reserveStart);
    
    @Override
    List<RoomReserve> findAll();
    
}