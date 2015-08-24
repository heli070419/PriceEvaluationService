CREATE TABLE `paa`.`Product` (
  `product_id` INT NOT NULL,
  `product_name` VARCHAR(45) NOT NULL,
  `original_price` DECIMAL(3,1) NOT NULL,
  `mail_price` DECIMAL(3,1) NOT NULL,
  `list_price` DECIMAL(3,1) NOT NULL,
  `second_sale_price` DECIMAL(3,1) NOT NULL,
  `product_weight` DECIMAL(3,1) NOT NULL,
  `product_desc` TEXT NOT NULL,
  PRIMARY KEY (`product_id`));
  
  
  CREATE TABLE `paa`.`TableKey` (
  `table_name` INT NOT NULL,
  `primary_key` INT NOT NULL,
  PRIMARY KEY (`table_name`));
