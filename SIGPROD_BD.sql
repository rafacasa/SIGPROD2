DROP DATABASE sigProdBd;

CREATE DATABASE sigProdBd;

use sigProdBd;


CREATE TABLE Elo (	
	correnteNominal INT PRIMARY KEY,
    preferencial BOOLEAN
) ENGINE = innodb;

CREATE TABLE PontoCurva (
    corrente DOUBLE,
	tempo DOUBLE,
	ehCurvaDeMaxima BOOLEAN,
	correnteElo INT,
	Id INT AUTO_INCREMENT PRIMARY KEY,
	FOREIGN KEY (correnteElo) REFERENCES Elo(correnteNominal)
) ENGINE = innodb;


CREATE TABLE potenciaMono (
    id INT PRIMARY KEY,
    potencia VARCHAR(6)
) ENGINE = innodb;

CREATE TABLE kvMono (
    id INT PRIMARY KEY,
    kv VARCHAR(5)
) ENGINE = innodb;

CREATE TABLE elotransformadorMono ( 
	potenciaId INT,
    kvId INT,
    tipo VARCHAR(1),
    corrente VARCHAR(5),
    id int AUTO_INCREMENT PRIMARY KEY,
    FOREIGN KEY (potenciaId) REFERENCES potenciaMono(id),
    FOREIGN KEY (kvId) REFERENCES kvMono(id)
) ENGINE = innodb;


CREATE TABLE potenciaTri (
    id INT PRIMARY KEY,
    potencia VARCHAR(10)
) ENGINE = innodb;

CREATE TABLE kvTri (
    id INT PRIMARY KEY,
    kv VARCHAR(10)
) ENGINE = innodb;

CREATE TABLE elotransformadorTri ( 
    potenciaId INT,
    kvId INT,
    tipo VARCHAR(1),
    corrente INT,
    id int AUTO_INCREMENT PRIMARY KEY,
    FOREIGN KEY (potenciaId) REFERENCES potenciaTri(id),
    FOREIGN KEY (kvId) REFERENCES kvTri(id)
) ENGINE = innodb;