-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 25, 2024 at 06:30 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `a_r_travels`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_booking`
--

CREATE TABLE `tbl_booking` (
  `Booking_ID` int(11) NOT NULL,
  `Custmers_ID` int(11) NOT NULL,
  `Month_ID` int(11) NOT NULL,
  `Package_id` int(11) NOT NULL,
  `TourType_Id` int(11) NOT NULL,
  `Operator_ID` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci PACK_KEYS=0;

--
-- Dumping data for table `tbl_booking`
--

INSERT INTO `tbl_booking` (`Booking_ID`, `Custmers_ID`, `Month_ID`, `Package_id`, `TourType_Id`, `Operator_ID`) VALUES
(3, 8, 1, 6, 6, 1),
(4, 9, 1, 6, 5, 1),
(5, 10, 1, 8, 1, 1),
(6, 8, 1, 24, 2, 1),
(7, 8, 1, 6, 6, 8);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_country`
--

CREATE TABLE `tbl_country` (
  `Country_ID` int(11) NOT NULL,
  `Country_Name` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci PACK_KEYS=0;

--
-- Dumping data for table `tbl_country`
--

INSERT INTO `tbl_country` (`Country_ID`, `Country_Name`) VALUES
(1, 'Northern Europe'),
(2, 'India'),
(3, 'Thailand'),
(4, 'Azerbaijan'),
(5, 'Dubai'),
(6, 'Fiji'),
(7, 'France'),
(8, 'Greece'),
(9, 'China'),
(10, 'Iceland'),
(11, 'Ireland'),
(12, 'Italy'),
(13, 'Jordan'),
(14, 'UK'),
(15, 'Maldives'),
(16, 'Poland'),
(17, 'Spain'),
(18, 'Hungary'),
(19, 'Singapore');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_customers`
--

CREATE TABLE `tbl_customers` (
  `Custmers_ID` int(11) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Gender` varchar(20) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Email_ID` varchar(50) NOT NULL,
  `Adhar_no` varchar(15) NOT NULL,
  `Contact_no` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_destination`
--

CREATE TABLE `tbl_destination` (
  `Destination_ID` int(11) NOT NULL,
  `Destination_Name` varchar(100) NOT NULL,
  `Country_ID` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `tbl_destination`
--

INSERT INTO `tbl_destination` (`Destination_ID`, `Destination_Name`, `Country_ID`) VALUES
(1, 'NORWAY', 1),
(2, 'KERALA', 2),
(4, 'GOA', 2),
(5, 'THAILAND', 3),
(6, 'AJERBAIJAN', 4),
(7, 'ALLEPPEY', 2),
(8, 'BANGKOK', 3),
(9, 'DARJEELIN', 2),
(10, 'DUBAI', 5),
(11, 'FIJI', 6),
(12, 'FRANCE', 7),
(13, 'GREECE', 8),
(14, 'Gulmarg', 2),
(15, 'HIMACHAL', 2),
(16, 'HONGKONG', 9),
(17, 'Hungary', 18),
(18, 'ICELAND', 10),
(19, 'IRELAND', 11),
(20, 'ITALY', 12),
(21, 'JORDDAN', 13),
(22, 'Kumarakom', 2),
(23, 'LADAKH', 2),
(24, 'LONDON', 14),
(25, 'MALDIVES', 15),
(26, 'ODISHA', 2),
(27, 'POLAND', 16),
(28, 'SCOTLAND', 14),
(29, 'SIKKIM', 2),
(30, 'SINGAPORE', 19),
(31, 'SPAIN', 17);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_month`
--

CREATE TABLE `tbl_month` (
  `Month_ID` int(11) NOT NULL,
  `Month_Name` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `tbl_month`
--

INSERT INTO `tbl_month` (`Month_ID`, `Month_Name`) VALUES
(1, 'January'),
(2, 'February'),
(3, 'March'),
(4, 'April'),
(5, 'May'),
(6, 'June'),
(7, 'July'),
(8, 'August'),
(9, 'September'),
(10, 'October'),
(11, 'November'),
(12, 'December');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_operator`
--

CREATE TABLE `tbl_operator` (
  `Operator_ID` int(11) NOT NULL,
  `Operator_Name` varchar(500) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `tbl_operator`
--

INSERT INTO `tbl_operator` (`Operator_ID`, `Operator_Name`) VALUES
(1, 'Cox and Kings'),
(2, 'Thomas Cook'),
(3, ' SOTC'),
(4, 'Club Mahindra Holidays.'),
(5, 'Expedia'),
(6, 'Goibibo'),
(7, 'Kesari Tours.'),
(8, 'MakeMyTrip'),
(9, 'Yatra'),
(10, 'Goibibio');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_packages`
--

CREATE TABLE `tbl_packages` (
  `Package_ID` int(11) NOT NULL,
  `Destination` varchar(100) NOT NULL,
  `Destination_ID` int(11) DEFAULT NULL,
  `Amount_RS` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `tbl_packages`
--

INSERT INTO `tbl_packages` (`Package_ID`, `Destination`, `Destination_ID`, `Amount_RS`) VALUES
(0, '-----Select-----', 0, '0'),
(1, 'NORWAY', 1, '164927'),
(2, 'KERALA', 2, '14000'),
(3, 'GOA', 4, '16000'),
(4, 'THAILAND', 5, '40000'),
(5, 'AJERBAIJAN', 6, '40000'),
(6, 'ALLEPPEY', 7, '7000'),
(7, 'BANGKOK', 8, '35000'),
(8, 'DARJEELING', 9, '20000'),
(9, 'DUBAI', 10, '50000'),
(10, 'FIJI', 11, '40000'),
(11, 'FRANCE', 12, '120000'),
(12, 'GREECE', 13, '70000'),
(13, 'Gulmarg', 14, '16000'),
(14, 'HIMACHAL', 15, '18000'),
(15, 'HONGKONG', 16, '40000'),
(16, 'Hungary', 17, '85000'),
(17, 'ICELAND', 18, '129150'),
(18, 'IRELAND', 19, '120749'),
(19, 'ITALY', 20, '78000'),
(20, 'JORDDAN', 21, '69000'),
(21, 'Kumarakom', 22, '15000'),
(22, 'LADAKH', 23, '19000'),
(23, 'LONDON', 24, '95000'),
(24, 'MALDIVES', 25, '38000'),
(25, 'ODISHA', 26, '8000'),
(26, 'POLAND', 27, '40000'),
(27, 'SCOTLAND', 28, '55000'),
(28, 'SIKKIM', 29, '25000'),
(29, 'SINGAPORE', 30, '45000'),
(30, 'SPAIN', 31, '45000');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_payment`
--

CREATE TABLE `tbl_payment` (
  `Payment_ID` int(11) NOT NULL,
  `Package_ID` int(11) NOT NULL,
  `Custmers_ID` int(11) NOT NULL,
  `Booking_ID` int(11) NOT NULL,
  `Payment_Amount` varchar(1000) NOT NULL,
  `Payment_Method` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `tbl_payment`
--

INSERT INTO `tbl_payment` (`Payment_ID`, `Package_ID`, `Custmers_ID`, `Booking_ID`, `Payment_Amount`, `Payment_Method`) VALUES
(1, 6, 8, 3, '7000', 'Cash'),
(2, 6, 9, 4, '7000', 'Cash'),
(3, 8, 10, 5, '20000', 'Cash'),
(4, 24, 8, 6, '38000', 'Cash'),
(5, 6, 8, 7, '7000', 'Cash');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_tourtype`
--

CREATE TABLE `tbl_tourtype` (
  `TourType_ID` int(50) NOT NULL,
  `TourType_Name` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `tbl_tourtype`
--

INSERT INTO `tbl_tourtype` (`TourType_ID`, `TourType_Name`) VALUES
(1, 'Nature'),
(2, 'Family'),
(3, 'Friends'),
(4, 'HoneyMoon'),
(5, 'Adventure'),
(6, 'Solo');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_userlogin`
--

CREATE TABLE `tbl_userlogin` (
  `User_ID` int(11) NOT NULL,
  `User_Name` varchar(100) NOT NULL,
  `Password` varchar(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `tbl_userlogin`
--

INSERT INTO `tbl_userlogin` (`User_ID`, `User_Name`, `Password`) VALUES
(1, 'artravels', 'artravels'),
(2, 'ARTRAVELS', 'ARTravels');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_booking`
--
ALTER TABLE `tbl_booking`
  ADD PRIMARY KEY (`Booking_ID`),
  ADD KEY `Month_ID` (`Month_ID`),
  ADD KEY `Package_id` (`Package_id`),
  ADD KEY `TourType_Id` (`TourType_Id`),
  ADD KEY `Operator_ID` (`Operator_ID`),
  ADD KEY `Custmers_ID` (`Custmers_ID`);

--
-- Indexes for table `tbl_country`
--
ALTER TABLE `tbl_country`
  ADD PRIMARY KEY (`Country_ID`);

--
-- Indexes for table `tbl_customers`
--
ALTER TABLE `tbl_customers`
  ADD PRIMARY KEY (`Custmers_ID`),
  ADD UNIQUE KEY `Adhar_no` (`Adhar_no`);

--
-- Indexes for table `tbl_destination`
--
ALTER TABLE `tbl_destination`
  ADD PRIMARY KEY (`Destination_ID`),
  ADD KEY `Country_ID` (`Country_ID`);

--
-- Indexes for table `tbl_month`
--
ALTER TABLE `tbl_month`
  ADD PRIMARY KEY (`Month_ID`);

--
-- Indexes for table `tbl_operator`
--
ALTER TABLE `tbl_operator`
  ADD PRIMARY KEY (`Operator_ID`);

--
-- Indexes for table `tbl_packages`
--
ALTER TABLE `tbl_packages`
  ADD PRIMARY KEY (`Package_ID`),
  ADD KEY `Destination_ID` (`Destination_ID`);

--
-- Indexes for table `tbl_payment`
--
ALTER TABLE `tbl_payment`
  ADD PRIMARY KEY (`Payment_ID`),
  ADD KEY `tbl_payment` (`Package_ID`);

--
-- Indexes for table `tbl_tourtype`
--
ALTER TABLE `tbl_tourtype`
  ADD PRIMARY KEY (`TourType_ID`);

--
-- Indexes for table `tbl_userlogin`
--
ALTER TABLE `tbl_userlogin`
  ADD PRIMARY KEY (`User_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_booking`
--
ALTER TABLE `tbl_booking`
  MODIFY `Booking_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `tbl_country`
--
ALTER TABLE `tbl_country`
  MODIFY `Country_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT for table `tbl_customers`
--
ALTER TABLE `tbl_customers`
  MODIFY `Custmers_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `tbl_destination`
--
ALTER TABLE `tbl_destination`
  MODIFY `Destination_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- AUTO_INCREMENT for table `tbl_month`
--
ALTER TABLE `tbl_month`
  MODIFY `Month_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `tbl_operator`
--
ALTER TABLE `tbl_operator`
  MODIFY `Operator_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `tbl_payment`
--
ALTER TABLE `tbl_payment`
  MODIFY `Payment_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `tbl_tourtype`
--
ALTER TABLE `tbl_tourtype`
  MODIFY `TourType_ID` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `tbl_userlogin`
--
ALTER TABLE `tbl_userlogin`
  MODIFY `User_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
