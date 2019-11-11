/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group2.Library.DBInterfaces;

import group2.Library.Services.Model.LoggingMangement;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author Ben Xu
 */
public interface LoggingRepo extends CrudRepository<LoggingMangement, String>{

}
