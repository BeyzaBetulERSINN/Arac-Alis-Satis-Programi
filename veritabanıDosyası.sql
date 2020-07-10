-- phpMyAdmin SQL Dump
-- version 4.8.0
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 14 May 2018, 16:55:32
-- Sunucu sürümü: 10.1.31-MariaDB
-- PHP Sürümü: 7.0.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `sonn`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `tbl_araba`
--

CREATE TABLE `tbl_araba` (
  `ArabaID` int(11) NOT NULL,
  `Araba_Marka` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Araba_Model` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Araba_VitesTuruID` int(11) NOT NULL,
  `Araba_YakitTuruID` int(11) NOT NULL,
  `Araba_RenkID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Tablo döküm verisi `tbl_araba`
--

INSERT INTO `tbl_araba` (`ArabaID`, `Araba_Marka`, `Araba_Model`, `Araba_VitesTuruID`, `Araba_YakitTuruID`, `Araba_RenkID`) VALUES
(1, 'Renault', 'Megane', 1, 1, 2),
(2, 'Volkswagen', 'Passat', 1, 2, 4),
(3, 'Fıat', 'Doblo', 1, 3, 1),
(4, 'Volkswagen', 'Caddy', 1, 1, 6),
(5, 'Seat', 'Leon', 1, 1, 7),
(6, 'Dacia', 'Sandero', 1, 2, 4),
(7, 'Mercedes', 'Vito', 1, 3, 5),
(8, 'Tata', 'Indicia', 2, 1, 8),
(9, 'Tofas', 'Albea', 1, 3, 5),
(10, 'Renault', 'MeganeCoune', 2, 2, 1),
(11, 'Hyundai', 'AccentEra', 1, 1, 4),
(12, 'Opel', 'Astra', 1, 3, 9),
(13, 'Honda', 'Jazz', 1, 2, 5),
(15, 'Ford', 'Focus', 1, 2, 3),
(16, 'Opel', 'Astra', 1, 3, 6),
(17, 'Ford', 'Transit', 2, 3, 7),
(18, 'Opel', 'Astra', 1, 2, 6),
(19, 'Ford', 'TourneoConnect', 2, 1, 1),
(20, 'Renaolut', 'Fluence', 1, 1, 7),
(21, 'Fiat', 'Ducato', 2, 2, 2),
(22, 'Ford', 'Fiesta', 1, 3, 9),
(23, 'Lada', 'Kalina', 2, 1, 4),
(24, 'Lada', 'Kalina', 1, 3, 5),
(25, 'Dacia', 'Sandero', 2, 1, 3),
(26, 'Dacia', 'Sandero', 1, 1, 7),
(27, 'Hyundai', 'Getz', 2, 2, 1),
(28, 'Opel', 'Astra', 2, 2, 3),
(29, 'Ford', 'Transit', 1, 3, 5),
(30, 'Lada', 'Kalina', 1, 2, 4),
(31, 'Opel', 'Astra', 2, 3, 3);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `tbl_ilan`
--

CREATE TABLE `tbl_ilan` (
  `IlanID` int(11) NOT NULL,
  `Ilan_Adi` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Ilan_Fiyat` float NOT NULL,
  `Ilan_Km` int(11) NOT NULL,
  `Ilan_Tarih` date NOT NULL,
  `Ilan_ArabaID` int(11) NOT NULL,
  `Ilan_SehirID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Tablo döküm verisi `tbl_ilan`
--

INSERT INTO `tbl_ilan` (`IlanID`, `Ilan_Adi`, `Ilan_Fiyat`, `Ilan_Km`, `Ilan_Tarih`, `Ilan_ArabaID`, `Ilan_SehirID`) VALUES
(1, 'Deneme', 230000, 4534, '2018-05-11', 25, 2),
(2, 'Umrandan', 150000, 75, '2018-05-11', 30, 10),
(3, 'Deneme', 720000, 74444, '2018-05-13', 29, 1),
(4, 'Murattan', 53000, 0, '2018-05-12', 4, 4),
(5, 'Halitten', 74000, 20000, '2018-04-15', 5, 5),
(6, 'Meteden', 90000, 10000, '2016-05-03', 6, 6),
(7, 'Ahmetten', 10000, 0, '1960-02-02', 7, 7),
(8, 'Yunustan', 54000, 80000, '2016-06-01', 8, 8),
(9, 'Halitten', 84000, 32000, '1997-04-06', 9, 9),
(10, 'Mahmuttan', 98000, 35000, '1999-07-06', 10, 10),
(11, 'Aliden', 20000, 70000, '1980-09-04', 11, 1),
(12, 'Sevdadan', 79000, 20000, '2014-08-09', 12, 2),
(13, 'bernada', 33, 0, '2018-05-14', 8, 4),
(14, 'Gozdeden', 80000, 150000, '2015-03-04', 14, 4),
(15, 'Leyladan', 70500, 50000, '2013-01-09', 15, 5),
(16, 'Serenden', 150000, 0, '2017-01-01', 16, 6),
(17, 'Gulsumden', 70500, 50000, '2013-01-09', 15, 5),
(18, 'Zelihadan', 150000, 0, '2013-03-03', 18, 8),
(19, 'Sakineden', 74000, 85000, '2017-03-02', 19, 9),
(20, 'Ervadan', 175000, 0, '2015-07-03', 20, 10),
(21, 'Berradan', 110000, 90000, '2000-07-04', 21, 1),
(22, 'Osmandan', 95000, 80000, '1990-03-05', 22, 2),
(23, 'Erdogandan', 120000, 95000, '2018-05-14', 23, 4),
(24, 'FirdevsHanımdan', 140000, 100000, '1999-08-03', 24, 4),
(25, 'Gulsumden', 200000, 0, '1960-01-01', 25, 5),
(26, 'Burcudan', 16000, 50000, '2013-07-06', 26, 6),
(27, 'acil', 23456, 12345, '2018-05-11', 23, 2),
(28, 'Halimden', 130000, 70450, '2016-11-19', 2, 8),
(29, 'Vedattan', 250000, 0, '2017-04-23', 29, 9),
(30, 'Faruktan', 10000, 500000, '2018-05-11', 29, 9);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `tbl_renk`
--

CREATE TABLE `tbl_renk` (
  `RenkID` int(11) NOT NULL,
  `Renk` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Tablo döküm verisi `tbl_renk`
--

INSERT INTO `tbl_renk` (`RenkID`, `Renk`) VALUES
(1, 'Beyaz'),
(2, 'Siyah'),
(3, 'Gri'),
(4, 'Kirmizi'),
(5, 'Mor'),
(6, 'Mavi'),
(7, 'Bordo'),
(8, 'Turuncu'),
(9, 'Yesil'),
(10, 'Pembe');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `tbl_sehir`
--

CREATE TABLE `tbl_sehir` (
  `SehirID` int(11) NOT NULL,
  `Sehir` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Tablo döküm verisi `tbl_sehir`
--

INSERT INTO `tbl_sehir` (`SehirID`, `Sehir`) VALUES
(1, 'Istanbul'),
(2, 'Trabzon'),
(3, 'İzmir'),
(4, 'Balikesir'),
(5, 'Mersin'),
(6, 'Bursa'),
(7, 'Ordu'),
(8, 'Ankara'),
(9, 'Konya'),
(10, 'Manisa');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `tbl_vitesturu`
--

CREATE TABLE `tbl_vitesturu` (
  `VitesTuruID` int(11) NOT NULL,
  `Vites_Turu` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Tablo döküm verisi `tbl_vitesturu`
--

INSERT INTO `tbl_vitesturu` (`VitesTuruID`, `Vites_Turu`) VALUES
(1, 'Manuel'),
(2, 'otomatik');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `tbl_yakitturu`
--

CREATE TABLE `tbl_yakitturu` (
  `YakitTuruID` int(11) NOT NULL,
  `Yakit_Turu` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Tablo döküm verisi `tbl_yakitturu`
--

INSERT INTO `tbl_yakitturu` (`YakitTuruID`, `Yakit_Turu`) VALUES
(1, 'Gaz'),
(2, 'Benzin'),
(3, 'Dizel');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `tbl_araba`
--
ALTER TABLE `tbl_araba`
  ADD PRIMARY KEY (`ArabaID`);

--
-- Tablo için indeksler `tbl_ilan`
--
ALTER TABLE `tbl_ilan`
  ADD PRIMARY KEY (`IlanID`);

--
-- Tablo için indeksler `tbl_renk`
--
ALTER TABLE `tbl_renk`
  ADD PRIMARY KEY (`RenkID`);

--
-- Tablo için indeksler `tbl_sehir`
--
ALTER TABLE `tbl_sehir`
  ADD PRIMARY KEY (`SehirID`);

--
-- Tablo için indeksler `tbl_vitesturu`
--
ALTER TABLE `tbl_vitesturu`
  ADD PRIMARY KEY (`VitesTuruID`);

--
-- Tablo için indeksler `tbl_yakitturu`
--
ALTER TABLE `tbl_yakitturu`
  ADD PRIMARY KEY (`YakitTuruID`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `tbl_araba`
--
ALTER TABLE `tbl_araba`
  MODIFY `ArabaID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=46;

--
-- Tablo için AUTO_INCREMENT değeri `tbl_ilan`
--
ALTER TABLE `tbl_ilan`
  MODIFY `IlanID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=179;

--
-- Tablo için AUTO_INCREMENT değeri `tbl_renk`
--
ALTER TABLE `tbl_renk`
  MODIFY `RenkID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=89;

--
-- Tablo için AUTO_INCREMENT değeri `tbl_sehir`
--
ALTER TABLE `tbl_sehir`
  MODIFY `SehirID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=77;

--
-- Tablo için AUTO_INCREMENT değeri `tbl_vitesturu`
--
ALTER TABLE `tbl_vitesturu`
  MODIFY `VitesTuruID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Tablo için AUTO_INCREMENT değeri `tbl_yakitturu`
--
ALTER TABLE `tbl_yakitturu`
  MODIFY `YakitTuruID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
