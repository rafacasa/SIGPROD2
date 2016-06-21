DROP DATABASE IF EXISTS sigprod2;

CREATE DATABASE sigprod2;

use sigprod2;

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