INSERT INTO `customer` (`id`, `name`) VALUES ('1', 'Tomasz'), ('2', 'Bob');
INSERT INTO `book` (`id`, `title`, `customer_id`) VALUES (NULL, 'First Book', '1'), (NULL, 'Java Book', '1');
INSERT INTO `book` (`id`, `title`, `customer_id`) VALUES (NULL, 'Last Book', '2'), (NULL, 'PHP Book', '2');