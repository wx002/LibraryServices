/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group2.Libaray.Services.model;

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
    
    List<RoomReserve> findByreserveDate(Timestamp reserveDate);
    
    @Override
    List<RoomReserve> findAll();
    
}