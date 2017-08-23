--DROP TABLE users IF EXISTS;

CREATE TABLE quests (
  id         INTEGER PRIMARY KEY,
  name VARCHAR(30),
  description  VARCHAR(50)
);