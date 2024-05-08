-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: May 08, 2024 at 03:11 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `panchikawaththa`
--

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `id` int(7) NOT NULL,
  `name` varchar(100) NOT NULL,
  `brand_id` int(3) NOT NULL,
  `category_id` int(4) NOT NULL,
  `model` varchar(100) NOT NULL,
  `itemCondition` varchar(100) NOT NULL,
  `description` varchar(5000) DEFAULT NULL,
  `image` varchar(150) NOT NULL,
  `dateTime` varchar(25) NOT NULL,
  `year` int(4) NOT NULL,
  `price` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`id`, `name`, `brand_id`, `category_id`, `model`, `itemCondition`, `description`, `image`, `dateTime`, `year`, `price`) VALUES
(1, 'Brake liners Brembo break', 45, 34, 'Breamboo', 'Good Product 74% condition', 'This is item description', 'vehical.jpeg', '2024-05-05 23:12', 2024, '25,000');

-- --------------------------------------------------------

--
-- Table structure for table `products_additional`
--

CREATE TABLE `products_additional` (
  `id` int(7) NOT NULL,
  `item_id` int(7) NOT NULL,
  `address` varchar(200) NOT NULL,
  `telephone` varchar(15) NOT NULL,
  `city` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `product_brand`
--

CREATE TABLE `product_brand` (
  `id` int(7) NOT NULL,
  `name` varchar(30) NOT NULL,
  `image` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `product_category`
--

CREATE TABLE `product_category` (
  `id` int(7) NOT NULL,
  `name` varchar(50) NOT NULL,
  `image` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `product_category`
--

INSERT INTO `product_category` (`id`, `name`, `image`) VALUES
(1, 'Wheels & Tires', 'categories-product6.webp'),
(2, 'Engine Compartment', 'categories-product8.webp'),
(3, 'Brake System', 'categories-product3.webp'),
(4, 'Gearbox', 'y.png'),
(5, 'Exhaust System', 'categories-product5.webp'),
(6, 'Body Parts & Accessories', 'ol.png'),
(7, 'Electrical System', 'u.png'),
(8, 'Suspension & Steering', 'categories-product2.webp'),
(9, 'Cooling System', 'categories-product4.webp'),
(10, 'Interior Parts & Accessories', 'R.png');

-- --------------------------------------------------------

--
-- Table structure for table `product_order`
--

CREATE TABLE `product_order` (
  `id` int(7) NOT NULL,
  `user_id` int(7) NOT NULL,
  `dateTime` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `product_order_item`
--

CREATE TABLE `product_order_item` (
  `id` int(7) NOT NULL,
  `order_id` int(7) NOT NULL,
  `item_id` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `product_review`
--

CREATE TABLE `product_review` (
  `id` int(10) NOT NULL,
  `item_id` int(7) NOT NULL,
  `user_id` int(7) NOT NULL,
  `comment` varchar(500) NOT NULL,
  `rate` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(7) NOT NULL,
  `username` varchar(50) NOT NULL,
  `email` varchar(320) NOT NULL,
  `password` varchar(50) NOT NULL,
  `mobile` varchar(20) NOT NULL,
  `image` varchar(100) NOT NULL,
  `address` varchar(1500) NOT NULL,
  `city_id` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `username`, `email`, `password`, `mobile`, `image`, `address`, `city_id`) VALUES
(1, 'Binod Perera', 'yasindubinod7@gmail.com', 'binod1234', '0712832957', 'user.lpg', 'No 5/A, NAWAGAMUGODA ROAD,\r\nKUBUKA, GONAPALA JUNCTION', 5),
(2, 'Janith Chamuditha', 'janith@gmail.com', 'janith123', '0712833254', 'user.lpg', 'No 51/A, Kandy road,\r\nPadiyapalella, Hanguranketha', 5),
(3, 'binodperera', 'yasindubinod7@gmail.com', 'yasi', '0712832957', 'user.lpg', 'No 5/A, NAWAGAMUGODA ROAD,\r\nKUBUKA, GONAPALA JUNCTION', 5),
(4, 'binodperera', 'yasindubinod7@gmail.com', 'yasi', '0712832957', 'user.lpg', 'No 5/A, NAWAGAMUGODA ROAD,\r\nKUBUKA, GONAPALA JUNCTION', 5),
(5, '', '', '', '', 'user.lpg', '', 5),
(6, 'user', 'user@gmail.com', 'root', '0718327753', 'user.lpg', 'No 5/A, NAWAGAMUGODA ROAD,\r\nKUBUKA, GONAPALA JUNCTION', 5),
(7, 'Binod07', 'yasindubinod7@gmail.com', 'root', '0712832957', 'user.lpg', 'No 5/A, NAWAGAMUGODA ROAD,\r\nKUBUKA, GONAPALA JUNCTION', 5),
(8, 'Nilanthi123', 'yasindubinod7@gmail.com', 'nila', '0712832957', 'user.lpg', 'No 5/A, NAWAGAMUGODA ROAD,\r\nKUBUKA, GONAPALA JUNCTION', 5);

-- --------------------------------------------------------

--
-- Table structure for table `wishlist`
--

CREATE TABLE `wishlist` (
  `id` int(5) NOT NULL,
  `user_id` int(5) NOT NULL,
  `product_id` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `products_additional`
--
ALTER TABLE `products_additional`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `product_brand`
--
ALTER TABLE `product_brand`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `product_category`
--
ALTER TABLE `product_category`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `product_order`
--
ALTER TABLE `product_order`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `product_order_item`
--
ALTER TABLE `product_order_item`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `product_review`
--
ALTER TABLE `product_review`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `wishlist`
--
ALTER TABLE `wishlist`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `products`
--
ALTER TABLE `products`
  MODIFY `id` int(7) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `products_additional`
--
ALTER TABLE `products_additional`
  MODIFY `id` int(7) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `product_brand`
--
ALTER TABLE `product_brand`
  MODIFY `id` int(7) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `product_category`
--
ALTER TABLE `product_category`
  MODIFY `id` int(7) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `product_order`
--
ALTER TABLE `product_order`
  MODIFY `id` int(7) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `product_order_item`
--
ALTER TABLE `product_order_item`
  MODIFY `id` int(7) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `product_review`
--
ALTER TABLE `product_review`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(7) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `wishlist`
--
ALTER TABLE `wishlist`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
