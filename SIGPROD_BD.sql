DROP DATABASE sigProdBd;

CREATE DATABASE sigProdBd;

use sigProdBd;

CREATE TABLE Elo (	
	correnteNominal INT PRIMARY KEY,
    preferencial BOOLEAN
) ENGINE = innodb;

CREATE TABLE PontoCurvaElo (
    id INT AUTO_INCREMENT PRIMARY KEY,
    corrente DOUBLE,
	tempo DOUBLE,
	correnteElo INT,
    ehCurvaDeMaxima BOOLEAN,
    FOREIGN KEY (correnteElo) REFERENCES Elo(correnteNominal)
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
    FOREIGN KEY (potenciaId) REFERENCES PotenciaMono(id),
    FOREIGN KEY (kvId) REFERENCES KvMono(id)
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
    FOREIGN KEY (potenciaId) REFERENCES PotenciaTri(id),
    FOREIGN KEY (kvId) REFERENCES KvTri(id)
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
	tempoAtuacao DOUBLE,
	PRIMARY KEY (codigoRele, correntePickup, isFase, tempoAtuacao),
	FOREIGN KEY (codigoRele) REFERENCES Rele(codigo)
) ENGINE = innodb;

CREATE TABLE PontoCurvaRele (
	id INT AUTO_INCREMENT PRIMARY KEY,
    corrente DOUBLE,
	tempo DOUBLE,
	correntePickup DOUBLE,
	isFase BOOLEAN,
	dial DOUBLE,
	codigoRele INT,
	FOREIGN KEY (codigoRele) REFERENCES Rele(codigo)
) ENGINE = innodb;

CREATE TABLE TempoCorrenteDigital (
	codigoRele INT PRIMARY KEY,
	correnteMinino DOUBLE,
	correnteMaximo DOUBLE,
	correntePasso DOUBLE,
	tempoMinimo DOUBLE,
	tempoMaximo DOUBLE,
	tempoPasso DOUBLE
) ENGINE = innodb;

CREATE TABLE CaracteristicasCurva (
	codigoRele INT,
	nome VARCHAR(50),
	a DOUBLE,
	b DOUBLE,
	p DOUBLE,
	id INT AUTO_INCREMENT PRIMARY KEY,
	FOREIGN KEY (codigoRele) REFERENCES Rele(codigo)
) ENGINE = innodb;
