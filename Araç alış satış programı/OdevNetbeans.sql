-- phpMyAdmin SQL Dump
-- version 4.8.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: May 10, 2018 at 01:10 PM
-- Server version: 10.1.32-MariaDB
-- PHP Version: 7.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `OdevNetbeans`
--

-- --------------------------------------------------------

--
-- Table structure for table `Tbl_Araba`
--

CREATE TABLE `Tbl_Araba` (
  `ArabaID` int(11) NOT NULL,
  `Araba_Marka` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Araba_Model` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Araba_VitesTuruID` int(11) NOT NULL,
  `Araba_YakitTuruID` int(11) NOT NULL,
  `Araba_RenkID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `Tbl_Ilan`
--

CREATE TABLE `Tbl_Ilan` (
  `IlanID` int(11) NOT NULL,
  `Ilan_Adi` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Ilan_Fiyat` float NOT NULL,
  `Ilan_Km` int(11) NOT NULL,
  `Ilan_Tarih` date NOT NULL,
  `Ilan_ArabaID` int(11) NOT NULL,
  `Ilan_SehirID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `Tbl_Renk`
--

CREATE TABLE `Tbl_Renk` (
  `RenkID` int(11) NOT NULL,
  `Renk` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `Tbl_Sehir`
--

CREATE TABLE `Tbl_Sehir` (
  `SehirID` int(11) NOT NULL,
  `Sehir` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `Tbl_VitesTuru`
--

CREATE TABLE `Tbl_VitesTuru` (
  `VitesTuruID` int(11) NOT NULL,
  `Vites_Turu` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `Tbl_YakitTuru`
--

CREATE TABLE `Tbl_YakitTuru` (
  `YakitTuruID` int(11) NOT NULL,
  `Yakit_Turu` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Tbl_Araba`
--
ALTER TABLE `Tbl_Araba`
  ADD PRIMARY KEY (`ArabaID`);

--
-- Indexes for table `Tbl_Ilan`
--
ALTER TABLE `Tbl_Ilan`
  ADD PRIMARY KEY (`IlanID`);

--
-- Indexes for table `Tbl_Renk`
--
ALTER TABLE `Tbl_Renk`
  ADD PRIMARY KEY (`RenkID`);

--
-- Indexes for table `Tbl_Sehir`
--
ALTER TABLE `Tbl_Sehir`
  ADD PRIMARY KEY (`SehirID`);

--
-- Indexes for table `Tbl_VitesTuru`
--
ALTER TABLE `Tbl_VitesTuru`
  ADD PRIMARY KEY (`VitesTuruID`);

--
-- Indexes for table `Tbl_YakitTuru`
--
ALTER TABLE `Tbl_YakitTuru`
  ADD PRIMARY KEY (`YakitTuruID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Tbl_Araba`
--
ALTER TABLE `Tbl_Araba`
  MODIFY `ArabaID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Tbl_Ilan`
--
ALTER TABLE `Tbl_Ilan`
  MODIFY `IlanID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Tbl_Renk`
--
ALTER TABLE `Tbl_Renk`
  MODIFY `RenkID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Tbl_Sehir`
--
ALTER TABLE `Tbl_Sehir`
  MODIFY `SehirID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Tbl_VitesTuru`
--
ALTER TABLE `Tbl_VitesTuru`
  MODIFY `VitesTuruID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Tbl_YakitTuru`
--
ALTER TABLE `Tbl_YakitTuru`
  MODIFY `YakitTuruID` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
