CREATE ROLE mypivot LOGIN
  ENCRYPTED PASSWORD 'md58758ee92f566a03e85db1bc217159616'
  SUPERUSER INHERIT CREATEDB CREATEROLE REPLICATION;
  
  
CREATE DATABASE "mypivot"
  WITH OWNER = "mypivot"
       ENCODING = 'UTF8'
       CONNECTION LIMIT = -1;