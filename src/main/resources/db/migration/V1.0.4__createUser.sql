/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  RR
 * Created: Nov 1, 2019
 */
CREATE TABLE user(
    user_id         int primary key auto_increment,
    firstname       varChar(20),
    lastname        varChar(20),
    username        varChar(40),
    email           varChar(40),
    pass            varChar(255),
    age         int,
    address     varChar(50),
    usertype        varChar(5)

);

insert into user(firstname, lastname, username, email, pass, age, address, usertype) 
    values('Rafael', 'Rejuso', 'testUserName','testing@email.com' , 'testPassHash',
             01, '1 East Jackson', 'STDNT');

insert into user(firstname, lastname, username, email, pass, age, address, usertype) 
    values('Foo', 'Bar', 'UserName','test@gmail.com' , 'passhashtest',
             23, '2 East Jackson', 'FCLTY');


