--create database

CREATE TABLE Jaegers (
    id SERIAL PRIMARY KEY,
    modelName TEXT,
    mark TEXT,
    height DOUBLE PRECISION,
    weight INTEGER,
    status TEXT,
    origin TEXT,
    launch DATE,
    kaijuKill INTEGER
);