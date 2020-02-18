CREATE TABLE IF NOT EXISTS users(
  id SERIAL,
  full_name VARCHAR(128) NOT NULL,
  first_name VARCHAR(128) NOT NULL,
  last_name VARCHAR(128) NOT NULL,
  password text NOT NULL,
  email VARCHAR(256) NOT NULL,
  admin_flag CHAR(1),
  PRIMARY KEY (id),
  UNIQUE KEY (email)
);