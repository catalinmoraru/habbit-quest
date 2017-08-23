--DROP TABLE users IF EXISTS;

CREATE TABLE quests (
  id INTEGER PRIMARY KEY,
  name VARCHAR(30),
  description  VARCHAR(50)
);

create TABLE questsboss(
    id INTEGER PRIMARY KEY,
    questid INTEGER references quests(id),
    name VARCHAR(30)
);