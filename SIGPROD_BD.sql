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


CREATE TABLE potencia (
    id INT PRIMARY KEY,
    potencia INT
) ENGINE = innodb;

CREATE TABLE kv (
    id INT PRIMARY KEY,
    kv DOUBLE
) ENGINE = innodb;

CREATE TABLE elotransformador ( 
	potenciaId INT,
    kvId INT,
    tipo VARCHAR(1),
    corrente INT,
	monofasico BOOLEAN,
    id int AUTO_INCREMENT PRIMARY KEY,
    FOREIGN KEY (potenciaId) REFERENCES potencia(id),
    FOREIGN KEY (kvId) REFERENCES kv(id)
) ENGINE = innodb;

