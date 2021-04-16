 DROP DATABASE IF EXISTS springcloud_db02;

 CREATE DATABASE springcloud_db02 CHARACTER SET UTF8;

 USE springcloud_db02;

 CREATE TABLE product
 (

 pid BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,

 product_name VARCHAR(50),

 db_source
 VARCHAR(50)

 );


 INSERT INTO product(product_name,db_source) VALUES('格力空调2',DATABASE());

 INSERT INTO product(product_name,db_source) VALUES('海尔冰箱2',DATABASE());

 INSERT INTO product(product_name,db_source) VALUES('小短裙2',DATABASE());

 INSERT INTO product(product_name,db_source) VALUES('羽绒服2',DATABASE());

 INSERT INTO product(product_name,db_source) VALUES('韩版休闲鞋2',DATABASE());

 INSERT INTO product(product_name,db_source) VALUES('高贵鞋2',DATABASE());


 SELECT * FROM product;
