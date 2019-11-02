/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group2.Libaray.Services.model;

import group2.Libaray.Services.model.Fee.ChargeType;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author RR
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class FeeTest {
    @Autowired
    private FeeRepository feeRep;
    
    @Autowired
    private UserRepository usrRep;
    
    @Autowired
    private TestEntityManager entityManager;
    
    private static final Logger log = LoggerFactory.getLogger(FeeTest.class);
    
    @Test
    public void testAdd(){
        final double COST = 12.00;
        final String DESC = "test description";
        final ChargeType  TYPE = ChargeType.BUY;
        Fee newFee = new Fee();
        newFee.setFee(COST);
        newFee.setFeedesc(DESC);
        newFee.setFeetype(TYPE);
        
        
        
        User testUser = new User();
        testUser.setAddress("a");
        testUser.setEmail("b");
        testUser.setFirstName("c");
        testUser.setLastname("d");
        testUser.setPasswordHash("e");
        testUser.setUserAge(20);
        testUser.setUsername("f");
        testUser.setUsertype(User.UserType.STDNT);
        
        System.out.println(testUser.toString());
        entityManager.persistAndFlush(testUser);
        newFee.setUserid(testUser);
        entityManager.persistAndFlush(newFee);
        
        List<Fee> found = feeRep.findAll();
        
        Assertions.assertThat(found.size()).isEqualTo(3);
        
    }
    
}
