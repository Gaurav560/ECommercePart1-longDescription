DROP TABLE IF EXISTS product;

CREATE TABLE product (
                         id INT AUTO_INCREMENT PRIMARY KEY,
                         name VARCHAR(255) NOT NULL,
                         description VARCHAR(1000),
                         brand VARCHAR(255),
                         price DECIMAL(10, 2) NOT NULL,
                         category VARCHAR(255),
                         release_date DATE,
                         product_available BOOLEAN,
                         stock_quantity INT
);
