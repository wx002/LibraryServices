INSERT INTO author(authname) VALUES (
    'JK Rowling'
);

insert into author(authname) values (
    'Patrick Rothfuss'
);

update books set author_id = (select authorID from author where authname = 'Patrick Rothfuss');
update books set author_id = 
(select authorID from author where authname = 'JK Rowling') where title = 'Harry Potter and the Philosophers Stone';