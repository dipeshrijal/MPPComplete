--Create Table Address

CREATE TABLE ADDRESS(
id INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1001, INCREMENT BY 1),
    street CHAR(30) NOT NULL,
    city CHAR(30),
    state CHAR(10),
    zip VARCHAR(5) CONSTRAINT min_len CHECK (LENGTH(zip)=5)
);

-- Create Table Author

CREATE TABLE AUTHOR(
	id INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1001, INCREMENT BY 1),
	addressID INTEGER CONSTRAINT address_fk  REFERENCES ADDRESS(id),
	telephone CHAR(12),
	firstname CHAR(45) NOT NULL,
	lastname CHAR(45),
	bio VARCHAR(254) CONSTRAINT minlen CHECK (LENGTH(bio)>=10)
);


-- Create Table Publication

CREATE TABLE PUBLICATION(
	id INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1001, INCREMENT BY 1),	
	pubtype CHAR(10) NOT NULL CONSTRAINT pub_type CHECK (pubtype in ('book','periodical')), 
	title VARCHAR(255) NOT NULL,
	isbn_issuenum CHAR(45) NOT NULL,
	maxcheckoutlength INTEGER NOT NULL
);


--Create Table PublicationAuthor

CREATE TABLE PUBLICATIONAUTHOR(
		authorid INTEGER NOT NULL CONSTRAINT authorId_fk  REFERENCES AUTHOR(id),
		pubid INTEGER NOT NULL CONSTRAINT pubId_fk  REFERENCES PUBLICATION(id),
		PRIMARY KEY(authorid, pubid)
);

--Create table PubCopy

CREATE TABLE PUBCOPY(
	id INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1001, INCREMENT BY 1),
	pubId INTEGER CONSTRAINT publi_fk  REFERENCES PUBLICATION(id),
	copynumber INTEGER NOT NULL,
	status BOOLEAN NOT NULL DEFAULT FALSE
);


--Create table LibraryMember

CREATE TABLE LIBRARYMEMBER(
	id INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1001, INCREMENT BY 1),
	memberid CHAR(10) NOT NULL,
	addressid INTEGER CONSTRAINT addressm_fk  REFERENCES ADDRESS(id),
	firstname CHAR(30) NOT NULL,
	lastname CHAR(30) NOT NULL,
	telephone CHAR(12)
);


--Create table CheckoutRecord

CREATE TABLE CHECKOUTRECORD(
	id INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1001, INCREMENT BY 1),
	idmem INTEGER NOT NULL CONSTRAINT member_fk  REFERENCES LIBRARYMEMBER(id),
	copyid INTEGER NOT NULL CONSTRAINT copynum_fk  REFERENCES PUBCOPY(id),
	checkoutdate DATE NOT NULL,
	duedate DATE NOT NULL
);



