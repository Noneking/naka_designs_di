-- phpMyAdmin SQL Dump
-- version 4.3.11
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 17-01-2016 a las 11:07:53
-- Versión del servidor: 5.6.24
-- Versión de PHP: 5.5.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `naka_database`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `basket`
--

CREATE TABLE IF NOT EXISTS `basket` (
  `cod` int(11) NOT NULL,
  `amount` int(11) NOT NULL,
  `user` int(11) NOT NULL,
  `product` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bookmark`
--

CREATE TABLE IF NOT EXISTS `bookmark` (
  `cod` int(11) NOT NULL,
  `description` varchar(200) NOT NULL,
  `date` varchar(50) NOT NULL,
  `crew` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `category`
--

CREATE TABLE IF NOT EXISTS `category` (
  `cod` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `description` varchar(200) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `category`
--

INSERT INTO `category` (`cod`, `name`, `description`) VALUES
(28, 'nom', 'desc'),
(29, 'nom2', 'desc2');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `crew`
--

CREATE TABLE IF NOT EXISTS `crew` (
  `email` varchar(100) NOT NULL,
  `nickname` varchar(20) NOT NULL,
  `password` varchar(30) NOT NULL,
  `name` varchar(50) NOT NULL,
  `surname` varchar(50) NOT NULL,
  `phone_number` varchar(12) NOT NULL,
  `role` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `material`
--

CREATE TABLE IF NOT EXISTS `material` (
  `cod` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `amount` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `material`
--

INSERT INTO `material` (`cod`, `name`, `amount`) VALUES
(1, 'a', 0),
(2, 'b', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `product`
--

CREATE TABLE IF NOT EXISTS `product` (
  `cod` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `price` double NOT NULL,
  `category` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `product_material`
--

CREATE TABLE IF NOT EXISTS `product_material` (
  `cod` int(11) NOT NULL,
  `amount` int(11) NOT NULL,
  `product` int(11) NOT NULL,
  `material` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `product_record`
--

CREATE TABLE IF NOT EXISTS `product_record` (
  `cod` int(11) NOT NULL,
  `amount` int(11) NOT NULL,
  `record` int(11) NOT NULL,
  `product` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `record`
--

CREATE TABLE IF NOT EXISTS `record` (
  `cod` int(11) NOT NULL,
  `date` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `record_user`
--

CREATE TABLE IF NOT EXISTS `record_user` (
  `cod` int(11) NOT NULL,
  `user` int(11) NOT NULL,
  `record` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `turnover`
--

CREATE TABLE IF NOT EXISTS `turnover` (
  `cod` int(11) NOT NULL,
  `amount` int(11) NOT NULL,
  `price` double NOT NULL,
  `product_record` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `cod` int(11) NOT NULL,
  `nickname` varchar(20) NOT NULL,
  `name` varchar(50) NOT NULL,
  `surname` varchar(50) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `user`
--

INSERT INTO `user` (`cod`, `nickname`, `name`, `surname`, `email`, `password`) VALUES
(1, 'Noneking', 'Alejandro', 'Noriega Vega', 'aanoriega.vega@gmail.com', '111');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `basket`
--
ALTER TABLE `basket`
  ADD PRIMARY KEY (`cod`), ADD UNIQUE KEY `basket_user_unique` (`user`), ADD KEY `basket_product_fk` (`product`);

--
-- Indices de la tabla `bookmark`
--
ALTER TABLE `bookmark`
  ADD PRIMARY KEY (`cod`), ADD KEY `crew` (`crew`);

--
-- Indices de la tabla `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`cod`), ADD UNIQUE KEY `category_name_unique` (`name`);

--
-- Indices de la tabla `crew`
--
ALTER TABLE `crew`
  ADD PRIMARY KEY (`email`);

--
-- Indices de la tabla `material`
--
ALTER TABLE `material`
  ADD PRIMARY KEY (`cod`), ADD UNIQUE KEY `material_name_unique` (`name`);

--
-- Indices de la tabla `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`cod`), ADD UNIQUE KEY `product_name_unique` (`name`), ADD KEY `product_name_fk` (`category`);

--
-- Indices de la tabla `product_material`
--
ALTER TABLE `product_material`
  ADD PRIMARY KEY (`cod`), ADD KEY `product_material_product_fk` (`product`), ADD KEY `product_material_material_fk` (`material`);

--
-- Indices de la tabla `product_record`
--
ALTER TABLE `product_record`
  ADD PRIMARY KEY (`cod`), ADD KEY `products_record_fk` (`record`), ADD KEY `products_product_fk` (`product`);

--
-- Indices de la tabla `record`
--
ALTER TABLE `record`
  ADD PRIMARY KEY (`cod`);

--
-- Indices de la tabla `record_user`
--
ALTER TABLE `record_user`
  ADD PRIMARY KEY (`cod`), ADD KEY `records_user_fk` (`user`), ADD KEY `records_record_fk` (`record`);

--
-- Indices de la tabla `turnover`
--
ALTER TABLE `turnover`
  ADD PRIMARY KEY (`cod`), ADD KEY `turnover_product_record_fk` (`product_record`);

--
-- Indices de la tabla `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`cod`), ADD UNIQUE KEY `user_nickname_unique` (`nickname`), ADD UNIQUE KEY `user_email_unique` (`email`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `basket`
--
ALTER TABLE `basket`
  MODIFY `cod` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `bookmark`
--
ALTER TABLE `bookmark`
  MODIFY `cod` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `category`
--
ALTER TABLE `category`
  MODIFY `cod` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=30;
--
-- AUTO_INCREMENT de la tabla `material`
--
ALTER TABLE `material`
  MODIFY `cod` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `product`
--
ALTER TABLE `product`
  MODIFY `cod` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `product_material`
--
ALTER TABLE `product_material`
  MODIFY `cod` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `product_record`
--
ALTER TABLE `product_record`
  MODIFY `cod` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `record`
--
ALTER TABLE `record`
  MODIFY `cod` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `record_user`
--
ALTER TABLE `record_user`
  MODIFY `cod` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `turnover`
--
ALTER TABLE `turnover`
  MODIFY `cod` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `user`
--
ALTER TABLE `user`
  MODIFY `cod` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `basket`
--
ALTER TABLE `basket`
ADD CONSTRAINT `basket_product_fk` FOREIGN KEY (`product`) REFERENCES `product` (`cod`) ON DELETE CASCADE ON UPDATE CASCADE,
ADD CONSTRAINT `basket_user_fk` FOREIGN KEY (`user`) REFERENCES `user` (`cod`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `bookmark`
--
ALTER TABLE `bookmark`
ADD CONSTRAINT `bookmark_ibfk_1` FOREIGN KEY (`crew`) REFERENCES `crew` (`email`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Filtros para la tabla `product`
--
ALTER TABLE `product`
ADD CONSTRAINT `product_name_fk` FOREIGN KEY (`category`) REFERENCES `category` (`cod`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `product_material`
--
ALTER TABLE `product_material`
ADD CONSTRAINT `product_material_material_fk` FOREIGN KEY (`material`) REFERENCES `material` (`cod`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `product_material_product_fk` FOREIGN KEY (`product`) REFERENCES `product` (`cod`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Filtros para la tabla `product_record`
--
ALTER TABLE `product_record`
ADD CONSTRAINT `products_product_fk` FOREIGN KEY (`product`) REFERENCES `product` (`cod`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `products_record_fk` FOREIGN KEY (`record`) REFERENCES `record` (`cod`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Filtros para la tabla `record_user`
--
ALTER TABLE `record_user`
ADD CONSTRAINT `records_record_fk` FOREIGN KEY (`record`) REFERENCES `record` (`cod`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `records_user_fk` FOREIGN KEY (`user`) REFERENCES `user` (`cod`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Filtros para la tabla `turnover`
--
ALTER TABLE `turnover`
ADD CONSTRAINT `turnover_product_record_fk` FOREIGN KEY (`product_record`) REFERENCES `product_record` (`cod`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
