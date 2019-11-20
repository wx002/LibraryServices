INSERT INTO books(isbn, title, copies, maxcopies)
VALUES('9780316787536', 'Our Band Could Be Your Life', 2, 3);

INSERT INTO books(isbn, title, copies, maxcopies)
VALUES('9780345391803', 'The Hitchhikers Guide to the Galaxy', 2, 4);

INSERT INTO books(isbn, title, copies, maxcopies)
VALUES('9780393324815', 'Moneyball', 3, 4);

INSERT INTO books(isbn, title, copies, maxcopies)
VALUES('9781451667066', 'Do Not Sell At Any Price', 1, 2);

INSERT INTO books(isbn, title, copies, maxcopies)
VALUES('9781416553649', 'Born Standing Up', 2, 4);

INSERT INTO books(isbn, title, copies, maxcopies)
VALUES('9780143039839', 'The New York Trilogy', 1, 3);

INSERT INTO books(isbn, title, copies, maxcopies)
VALUES('9780441013593', 'Dune', 1, 4);

INSERT INTO books(isbn, title, copies, maxcopies)
VALUES('9780375726057', 'Sputnik Sweetheart', 2, 4);

INSERT INTO books(isbn, title, copies, maxcopies)
VALUES('9781573225519', 'High Fidelity', 2, 3);

INSERT INTO books(isbn, title, copies, maxcopies)
VALUES('9780812988529', 'Slaughterhouse-Five', 2, 3);

INSERT INTO author(authname)
VALUES('Michael Azerrad');

INSERT INTO author(authname)
VALUES('Douglas Adams');

INSERT INTO author(authname)
VALUES('Michael Lewis');

INSERT INTO author(authname)
VALUES('Amanda Petrusich');

INSERT INTO author(authname)
VALUES('Steve Martin');

INSERT INTO author(authname)
VALUES('Paul Auster');

INSERT INTO author(authname)
VALUES('Frank Herbert');

INSERT INTO author(authname)
VALUES('Haruki Murakami');

INSERT INTO author(authname)
VALUES('Nick Hornby');

INSERT INTO author(authname)
VALUES('Kurt Vonnegut');

UPDATE books
SET author_id = (SELECT authorID FROM author WHERE authname = 'Michael Azerrad')
WHERE title = 'Our Band Could Be Your Life';

UPDATE books
SET author_id = (SELECT authorID FROM author WHERE authname = 'Douglas Adams')
WHERE title = 'The Hitchhikers Guide to the Galaxy';

UPDATE books
SET author_id = (SELECT authorID FROM author WHERE authname = 'Michael Lewis')
WHERE title = 'Moneyball';

UPDATE books
SET author_id = (SELECT authorID FROM author WHERE authname = 'Amanda Petrusich')
WHERE title = 'Do Not Sell At Any Price';

UPDATE books
SET author_id = (SELECT authorID FROM author WHERE authname = 'Steve Martin')
WHERE title = 'Born Standing Up';

UPDATE books
SET author_id = (SELECT authorID FROM author WHERE authname = 'Paul Auster')
WHERE title = 'The New York Trilogy';

UPDATE books
SET author_id = (SELECT authorID FROM author WHERE authname = 'Frank Herbert')
WHERE title = 'Dune';

UPDATE books
SET author_id = (SELECT authorID FROM author WHERE authname = 'Haruki Murakami')
WHERE title = 'Sputnik Sweetheart';

UPDATE books
SET author_id = (SELECT authorID FROM author WHERE authname = 'Nick Hornby')
WHERE title = 'High Fidelity';

UPDATE books
SET author_id = (SELECT authorID FROM author WHERE authname = 'Kurt Vonnegut')
WHERE title = 'Slaughterhouse-Five';




