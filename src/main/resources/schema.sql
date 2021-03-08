CREATE TABLE IF NOT EXISTS users(
  user_id SERIAL
  ,full_name VARCHAR(128) NOT NULL
  ,first_name VARCHAR(128) NOT NULL
  ,last_name VARCHAR(128) NOT NULL
  ,password text NOT NULL
  ,email VARCHAR(256) NOT NULL
  ,admin_flag CHAR(1)
  ,PRIMARY KEY (user_id)
  ,UNIQUE KEY (email)
);

CREATE TABLE IF NOT EXISTS tasks(
  task_id SERIAL
  ,category_id integer NOT NULL
  ,subject VARCHAR(128) NOT NULL
  ,status_Id integer NOT NULL
  ,dead_line date
  ,PRIMARY KEY (task_id)
);

CREATE TABLE IF NOT EXISTS categories(
  category_id SERIAL
  ,category_name VARCHAR(128) NOT NULL
  ,color VARCHAR(128) NOT NULL
  ,PRIMARY KEY(category_id)
);

CREATE TABLE IF NOT EXISTS status(
  status_id SERIAL
  ,status_name VARCHAR(128) NOT NULL
  ,color VARCHAR(128) NOT NULL
  ,PRIMARY KEY(status_id)
);