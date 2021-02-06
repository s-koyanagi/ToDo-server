CREATE TABLE IF NOT EXISTS users(
  id SERIAL
  ,full_name VARCHAR(128) NOT NULL
  ,first_name VARCHAR(128) NOT NULL
  ,last_name VARCHAR(128) NOT NULL
  ,password text NOT NULL
  ,email VARCHAR(256) NOT NULL
  ,admin_flag CHAR(1)
  ,PRIMARY KEY (id)
  ,UNIQUE KEY (email)
);

CREATE TABLE IF NOT EXISTS tasks(
  id SERIAL
  ,project_id integer NOT NULL
  ,subject VARCHAR(128) NOT NULL
  ,status_Id integer NOT NULL
  ,dead_line date
)