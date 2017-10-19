#Create a new database, if it not exists
CREATE DATABASE IF NOT EXISTS  Rubrica
	DEFAULT CHARACTER SET latin1
	DEFAULT COLLATE latin1_general_ci;

USE Rubrica;


DROP DATABASE IF EXISTS Rubrica;

CREATE DATABASE Rubrica
	DEFAULT CHARACTER SET latin1
    DEFAULT COLLATE latin1_general_ci;
    
USE Rubrica;

#Modified character set to default
ALTER DATABASE Rubrica
	DEFAULT CHARACTER SET utf8
    DEFAULT COLLATE utf8_unicode_ci;
    
    CREATE TABLE IF NOT EXISTS country(
code VARCHAR (2) NOT NULL,
name VARCHAR (32) NOT NULL,
PRIMARY KEY (code)
);

    
#define table schema and create empty istance with data type    
CREATE TABLE IF NOT EXISTS brand (
	id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR (32) NOT NULL,
    country VARCHAR(2) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (country) REFERENCES country (code)
    );
    




CREATE TABLE IF NOT EXISTS opsys(
id INT NOT NULL AUTO_INCREMENT,
description VARCHAR (64) NOT NULL,
company VARCHAR (64) NOT NULL,
opensource TINYINT (1) NOT NULL,
PRIMARY KEY (id)
);
CREATE TABLE IF NOT EXISTS utente(
codicefiscale varchar (15) NOT NULL,
nome varchar (20) not null,
cognome varchar (20) not null,
indirizzo varchar(20) not null,
email varchar (20),

primary key (codicefiscale)
);


CREATE TABLE IF NOT EXISTS smartphone(
id INT NOT NULL AUTO_INCREMENT,
name VARCHAR (64) NOT NULL,
ram VARCHAR(5) NOT NULL,
cpu VARCHAR(64) NOT NULL,
displayPpi INT (11),
displaySize VARCHAR (64),
displayResolution VARCHAR (14) NOT NULL,
size VARCHAR(64) NOT NULL,
weight INT(4) NOT NULL,
notes VARCHAR(1024) NOT NULL,
brand INT (11) NOT NULL,
opSys INT (11) NOT NULL,
contatto varchar (15) not null,
numero varchar (10) not null,
PRIMARY KEY (id),
FOREIGN KEY (brand) REFERENCES Brand(id),
FOREIGN KEY (opSys) REFERENCES opSys(id),
foreign key (contatto) references utente (codicefiscale)
);













    