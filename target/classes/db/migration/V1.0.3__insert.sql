INSERT INTO author(authname) VALUES (
    'JK Rowling'
);

insert into author(authname) values (
    'Patrick Rothfuss'
);

update books set author_id = (select authorID from author where authname = 'Patrick Rothfuss')