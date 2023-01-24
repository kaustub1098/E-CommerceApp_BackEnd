
CREATE TABLE USERS(
 user_id INT PRIMARY KEY NOT NULL,
 user_firstName VARCHAR  NOT NULL,
 user_lastName VARCHAR NOT NULL,
 user_address VARCHAR NOT NULL,
 user_emailId VARCHAR NOT NULL,
 user_password VARCHAR NOT NULL,
 user_phoneNo INT NOT NULL
);

CREATE TABLE shipping_address(
 address_id INT PRIMARY KEY NOT NULL,
 firstName VARCHAR NOT NULL,
 lastName VARCHAR NOT NULL,
 phoneNo VARCHAR NOT NULL,
 country VARCHAR NOT NULL,
 state VARCHAR NOT NULL,
 city VARCHAR NOT NULL,
 pincode int not null,
 street_name VARCHAR NOT NULL,
 houseNo int NOT NULL,
 FOREIGN KEY (address_id)REFERENCES USERS(user_id)
);

CREATE TABLE product_info(
   product_id INT PRIMARY KEY NOT NULL,
   product_Name VARCHAR NOT NULL,
   product_description	VARCHAR NOT NULL,
   product_price INT NOT NULL,
   product_stock_Quantity INT NOT NULL,
   category_id INT NOT NULL,
   discount_id INT not null
 );

CREATE TABLE orders(
   order_id INT PRIMARY KEY NOT NULL,
   product_id INT NOT NULL,
   user_id	INT NOT NULL,
   order_date  TIMESTAMP   NOT NULL,
   order_time  TIMESTAMP NOT NULL,
   order_totalPrice INT NOT NULL,
   order_items VARCHAR NOT NULL,
   payment_type VARCHAR not null,
   FOREIGN KEY (product_id)REFERENCES product_info(product_id)
);

CREATE TABLE product_category(
   category_id INT PRIMARY KEY NOT NULL,
   category_Name VARCHAR NOT NULL,
   category_type VARCHAR NOT NULL,
   FOREIGN KEY (category_id)REFERENCES product_info(category_id)
);
 
ALTER TABLE product_info
ADD CONSTRAINT category_id_unq UNIQUE(category_id);
 
CREATE TABLE discounts(
   discount_id INT PRIMARY KEY NOT NULL,
   discount_price VARCHAR NOT NULL,
   discount_description VARCHAR NOT NULL,
   FOREIGN KEY (discount_id)REFERENCES product_info(discount_id)
);
 
ALTER TABLE product_info
ADD CONSTRAINT discount_id_unq UNIQUE(discount_id);

select* from discounts
select* from orders
select* from product_category
select* from product_info
select* from shipping_address
select*from users

INSERT INTO users (user_id, user_firstname,user_lastname,user_address,user_emailid,user_password,user_phoneno)
VALUES('1','Paul','Walker','Los Angeles','paulWalker@gmail.com','Supra2JZ','43783');
 
 
 
 
 

