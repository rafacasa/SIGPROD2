DROP DATABASE sigProdBd;

CREATE DATABASE sigProdBd;

use sigProdBd;


CREATE TABLE Elo (	
	correnteNominal INT PRIMARY KEY,
    preferencial BOOLEAN
);

CREATE TABLE PontoCurva (
    corrente DOUBLE,
	tempo DOUBLE,
	ehCurvaDeMaxima BOOLEAN,
	correnteElo INT,
	Id INT AUTO_INCREMENT PRIMARY KEY,
	FOREIGN KEY (correnteElo) REFERENCES Elo(correnteNominal)
);