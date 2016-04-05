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
	id INT AUTO_INCREMENT PRIMARY KEY
) ENGINE = innodb;

CREATE TABLE PontoCurvaElo (
    idPontoCurva INT,
    correnteElo INT,
    ehCurvaDeMaxima BOOLEAN,
    FOREIGN KEY (correnteElo) REFERENCES Elo(correnteNominal),
    FOREIGN KEY (idPontoCurva) REFERENCES PontoCurva(id),
    PRIMARY KEY (idPontoCurva, correnteElo)
) ENGINE = innodb;

CREATE TABLE PotenciaMono (
    id INT PRIMARY KEY,
    potencia VARCHAR(6)
) ENGINE = innodb;

CREATE TABLE KvMono (
    id INT PRIMARY KEY,
    kv VARCHAR(5)
) ENGINE = innodb;

CREATE TABLE ElotransformadorMono ( 
	potenciaId INT,
    kvId INT,
    tipo VARCHAR(1),
    corrente VARCHAR(5),
    id int AUTO_INCREMENT PRIMARY KEY,
    FOREIGN KEY (potenciaId) REFERENCES potenciaMono(id),
    FOREIGN KEY (kvId) REFERENCES kvMono(id)
) ENGINE = innodb;


CREATE TABLE PotenciaTri (
    id INT PRIMARY KEY,
    potencia VARCHAR(10)
) ENGINE = innodb;

CREATE TABLE KvTri (
    id INT PRIMARY KEY,
    kv VARCHAR(10)
) ENGINE = innodb;

CREATE TABLE ElotransformadorTri ( 
    potenciaId INT,
    kvId INT,
    tipo VARCHAR(1),
    corrente INT,
    id int AUTO_INCREMENT PRIMARY KEY,
    FOREIGN KEY (potenciaId) REFERENCES potenciaTri(id),
    FOREIGN KEY (kvId) REFERENCES kvTri(id)
) ENGINE = innodb;

CREATE TABLE Rele (
	codigo INT AUTO_INCREMENT PRIMARY KEY,
	fabricante VARCHAR(50),
	modelo VARCHAR(50),
	isDigital BOOLEAN,
	fatorInicioInvFase DOUBLE,
	fatorInicioInvNeutro DOUBLE,
	fatorInicioDefFase DOUBLE,
	fatorInicioDefNeutro DOUBLE
) ENGINE = innodb;

CREATE TABLE CorrentePickupDefinido (
	codigoRele INT,
	correntePickup DOUBLE,
	isFase BOOLEAN,
	PRIMARY KEY (codigoRele, correntePickup, isFase),
	FOREIGN KEY (codigoRele) REFERENCES Rele(codigo)
) ENGINE = innodb;

CREATE TABLE DialTempoMecanico (
	codigoRele INT,
	correntePickup DOUBLE,
	isFase BOOLEAN,
	dial DOUBLE,
	codigo INT AUTO_INCREMENT PRIMARY KEY,
	FOREIGN KEY (codigoRele) REFERENCES Rele(codigo)
) ENGINE = innodb;

CREATE TABLE PontoCurvaDialMecanico (
    idPontoCurva INT,
    codDialMecanico INT,
    FOREIGN KEY (codDialMecanico) REFERENCES DialTempoMecanico(codigo),
    FOREIGN KEY (idPontoCurva) REFERENCES PontoCurva(id),
    PRIMARY KEY (idPontoCurva, correnteElo)
) ENGINE = innodb;
