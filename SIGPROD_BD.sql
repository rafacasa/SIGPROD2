DROP DATABASE IF EXISTS sigProdBd;

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
	codigo INT PRIMARY KEY,
	fabricante VARCHAR(50),
	modelo VARCHAR(50),
	isDigital BOOLEAN,
	existeDefinidaFase BOOLEAN NOT NULL,
	existeDefinidaNeutro BOOLEAN NOT NULL,
	existeInversaFase BOOLEAN NOT NULL,
	existeInversaNeutro BOOLEAN NOT NULL,
	fatorInicioInvFase DOUBLE,
	fatorInicioInvNeutro DOUBLE,
	fatorInicioDefFase DOUBLE,
	fatorInicioDefNeutro DOUBLE
) ENGINE = innodb;

CREATE TABLE CorrentePickupDefinidoEletromecanicoRele (
	codigoRele INT,
	correntePickup DOUBLE,
	isFase BOOLEAN,
	PRIMARY KEY (codigoRele, isFase, correntePickup),
	FOREIGN KEY (codigoRele) REFERENCES Rele(codigo)
) ENGINE = innodb;

CREATE TABLE TempoAtuacaoDefinidoEletromecanicoRele (
	codigoRele INT,
	tempoAtuacao DOUBLE,
	isFase BOOLEAN,
	PRIMARY KEY (codigoRele, isFase, tempoAtuacao),
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

CREATE TABLE CorrenteTempoDigitalRele (
	codigoRele INT,
	tipo INT,
	correnteMinino DOUBLE,
	correnteMaximo DOUBLE,
	correntePasso DOUBLE,
	tempoMaximo DOUBLE, 
	tempoMinimo DOUBLE,
	tempoPasso DOUBLE,
	PRIMARY KEY (codigoRele, tipo),
	FOREIGN KEY (codigoRele) REFERENCES Rele(codigo)
) ENGINE = innodb;

CREATE TABLE CaracteristicasCurvaRele (
	codigoRele INT,
	isFase BOOLEAN,
	nome VARCHAR(50),
	a DOUBLE,
	b DOUBLE,
	p DOUBLE,
	id INT AUTO_INCREMENT PRIMARY KEY,
	FOREIGN KEY (codigoRele) REFERENCES Rele(codigo)
) ENGINE = innodb;

CREATE TABLE Religador (
	codigo INT PRIMARY KEY,
	fabricante VARCHAR(50),
	modelo VARCHAR(50),
	isDigital BOOLEAN,
	existeDefinidaFase BOOLEAN NOT NULL,
	existeDefinidaNeutro BOOLEAN NOT NULL,
	existeInversaFase BOOLEAN NOT NULL,
	existeInversaNeutro BOOLEAN NOT NULL,
	fatorInicioInvFase DOUBLE,
	fatorInicioInvNeutro DOUBLE,
	fatorInicioDefFase DOUBLE,
	fatorInicioDefNeutro DOUBLE
) ENGINE = innodb;

CREATE TABLE CorrentePickupDefinidoEletromecanicoReligador (
	codigoReligador INT,
	correntePickup DOUBLE,
	isFase BOOLEAN,
	PRIMARY KEY (codigoReligador, isFase, correntePickup),
	FOREIGN KEY (codigoReligador) REFERENCES Religador(codigo)
) ENGINE = innodb;

CREATE TABLE TempoAtuacaoDefinidoEletromecanicoReligador (
	codigoReligador INT,
	tempoAtuacao DOUBLE,
	isFase BOOLEAN,
	isRapida BOOLEAN,
	PRIMARY KEY (codigoReligador, isFase, tempoAtuacao, isRapida),
	FOREIGN KEY (codigoReligador) REFERENCES Religador(codigo)
) ENGINE = innodb;

CREATE TABLE PontoCurvaReligador (
	id INT AUTO_INCREMENT PRIMARY KEY,
    corrente DOUBLE,
	tempo DOUBLE,
	correntePickup DOUBLE,
	isFase BOOLEAN,
	isRapida BOOLEAN,
	dial DOUBLE,
	codigoReligador INT,
	FOREIGN KEY (codigoReligador) REFERENCES Religador(codigo)
) ENGINE = innodb;

CREATE TABLE CorrenteTempoDigitalReligador (
	codigoReligador INT,
	tipo INT,
	correnteMinino DOUBLE,
	correnteMaximo DOUBLE,
	correntePasso DOUBLE,
	tempoMaximoRapido DOUBLE, 
	tempoMinimoRapido DOUBLE,
	tempoPassoRapido DOUBLE,
	tempoMaximoLento DOUBLE, 
	tempoMinimoLento DOUBLE,
	tempoPassoLento DOUBLE,
	PRIMARY KEY (codigoReligador, tipo),
	FOREIGN KEY (codigoReligador) REFERENCES Religador(codigo)
) ENGINE = innodb;

CREATE TABLE CaracteristicasCurvaReligador (
	codigoReligador INT,
	isFase BOOLEAN,
	isRapida BOOLEAN,
	nome VARCHAR(50),
	a DOUBLE,
	b DOUBLE,
	p DOUBLE,
	id INT AUTO_INCREMENT PRIMARY KEY,
	FOREIGN KEY (codigoReligador) REFERENCES Religador(codigo)
) ENGINE = innodb;