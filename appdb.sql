-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Feb 28, 2016 at 12:17 PM
-- Server version: 5.5.8
-- PHP Version: 5.3.5



/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `appdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `book_data`
--

CREATE TABLE IF NOT EXISTS "book_data" (
  "id" int(11) NOT NULL,
  "name" tinytext,
  "auth" tinytext,
  "regd" tinytext,
  "cat" tinytext,
  "pub" tinytext,
  "ppub" tinytext,
  "copy" tinytext,
  "edi" tinytext,
  "isbn" tinytext,
  "doner" tinytext,
  "avbl" varchar(20) DEFAULT '',
  "mid" varchar(50) DEFAULT NULL,
  "gd" varchar(20) DEFAULT NULL,
  "rd" varchar(20) DEFAULT NULL
);

--
-- Dumping data for table `book_data`
--

UPDATE `book_data` SET `id` = 1,`name` = 'JAVA',`auth` = 'Mr. Author name',`regd` = '2016-01-29',`cat` = 'Science',`pub` = 'World Pub',`ppub` = 'Sri Lanka',`copy` = '2016',`edi` = '3',`isbn` = '1122564558',`doner` = 'Free',`avbl` = 'No',`mid` = '1',`gd` = '2/27/16',`rd` = '2/28/16' WHERE `book_data`.`id` = 1 AND `book_data`.`name` = 'JAVA' AND `book_data`.`auth` = 'Mr. Author name' AND `book_data`.`regd` = '2016-01-29' AND `book_data`.`cat` = 'Science' AND `book_data`.`pub` = 'World Pub' AND `book_data`.`ppub` = 'Sri Lanka' AND `book_data`.`copy` = '2016' AND `book_data`.`edi` = '3' AND `book_data`.`isbn` = '1122564558' AND `book_data`.`doner` = 'Free' AND `book_data`.`avbl` = 'No' AND `book_data`.`mid` = '1' AND `book_data`.`gd` = '2/27/16' AND `book_data`.`rd` = '2/28/16';
UPDATE `book_data` SET `id` = 2,`name` = 'C#',`auth` = 'Author2',`regd` = '2014-02-22',`cat` = 'Science Fiction',`pub` = 'Abc publication',`ppub` = 'Sri Lanka',`copy` = '2014',`edi` = '5',`isbn` = '3245782',`doner` = '2014',`avbl` = 'No',`mid` = '2',`gd` = '2/16/16',`rd` = '2/24/16' WHERE `book_data`.`id` = 2 AND `book_data`.`name` = 'C#' AND `book_data`.`auth` = 'Author2' AND `book_data`.`regd` = '2014-02-22' AND `book_data`.`cat` = 'Science Fiction' AND `book_data`.`pub` = 'Abc publication' AND `book_data`.`ppub` = 'Sri Lanka' AND `book_data`.`copy` = '2014' AND `book_data`.`edi` = '5' AND `book_data`.`isbn` = '3245782' AND `book_data`.`doner` = '2014' AND `book_data`.`avbl` = 'No' AND `book_data`.`mid` = '2' AND `book_data`.`gd` = '2/16/16' AND `book_data`.`rd` = '2/24/16';
UPDATE `book_data` SET `id` = 3,`name` = 'C++',`auth` = 'None',`regd` = '2012-01-21',`cat` = 'Computers',`pub` = '-',`ppub` = '-',`copy` = '-',`edi` = '-',`isbn` = '-',`doner` = '-',`avbl` = 'Yes',`mid` = '-',`gd` = '-',`rd` = '-' WHERE `book_data`.`id` = 3 AND `book_data`.`name` = 'C++' AND `book_data`.`auth` = 'None' AND `book_data`.`regd` = '2012-01-21' AND `book_data`.`cat` = 'Computers' AND `book_data`.`pub` = '-' AND `book_data`.`ppub` = '-' AND `book_data`.`copy` = '-' AND `book_data`.`edi` = '-' AND `book_data`.`isbn` = '-' AND `book_data`.`doner` = '-' AND `book_data`.`avbl` = 'Yes' AND `book_data`.`mid` = '-' AND `book_data`.`gd` = '-' AND `book_data`.`rd` = '-';
UPDATE `book_data` SET `id` = 4,`name` = 'Madol Doowa',`auth` = 'Martin Wikramasinhe',`regd` = '-',`cat` = 'Adventure',`pub` = 'Malpiyali',`ppub` = 'Sri Lanka',`copy` = '2014',`edi` = '1',`isbn` = '124578',`doner` = '-',`avbl` = 'Yes',`mid` = '-',`gd` = '-',`rd` = '-' WHERE `book_data`.`id` = 4 AND `book_data`.`name` = 'Madol Doowa' AND `book_data`.`auth` = 'Martin Wikramasinhe' AND `book_data`.`regd` = '-' AND `book_data`.`cat` = 'Adventure' AND `book_data`.`pub` = 'Malpiyali' AND `book_data`.`ppub` = 'Sri Lanka' AND `book_data`.`copy` = '2014' AND `book_data`.`edi` = '1' AND `book_data`.`isbn` = '124578' AND `book_data`.`doner` = '-' AND `book_data`.`avbl` = 'Yes' AND `book_data`.`mid` = '-' AND `book_data`.`gd` = '-' AND `book_data`.`rd` = '-';
UPDATE `book_data` SET `id` = 5,`name` = 'Grade 11 Science',`auth` = '-',`regd` = '-',`cat` = 'Science',`pub` = 'Government ',`ppub` = '-',`copy` = '-',`edi` = '-',`isbn` = '2662232',`doner` = '-',`avbl` = 'Yes',`mid` = '-',`gd` = '-',`rd` = '-' WHERE `book_data`.`id` = 5 AND `book_data`.`name` = 'Grade 11 Science' AND `book_data`.`auth` = '-' AND `book_data`.`regd` = '-' AND `book_data`.`cat` = 'Science' AND `book_data`.`pub` = 'Government ' AND `book_data`.`ppub` = '-' AND `book_data`.`copy` = '-' AND `book_data`.`edi` = '-' AND `book_data`.`isbn` = '2662232' AND `book_data`.`doner` = '-' AND `book_data`.`avbl` = 'Yes' AND `book_data`.`mid` = '-' AND `book_data`.`gd` = '-' AND `book_data`.`rd` = '-';
UPDATE `book_data` SET `id` = 6,`name` = 'Grade 7 Maths',`auth` = '--',`regd` = '2012',`cat` = 'Mathematics',`pub` = 'Master Guide',`ppub` = 'Sri Lanka',`copy` = '2015',`edi` = '3',`isbn` = '212-332-12221',`doner` = '-',`avbl` = 'Yes',`mid` = '-',`gd` = '-',`rd` = '-' WHERE `book_data`.`id` = 6 AND `book_data`.`name` = 'Grade 7 Maths' AND `book_data`.`auth` = '--' AND `book_data`.`regd` = '2012' AND `book_data`.`cat` = 'Mathematics' AND `book_data`.`pub` = 'Master Guide' AND `book_data`.`ppub` = 'Sri Lanka' AND `book_data`.`copy` = '2015' AND `book_data`.`edi` = '3' AND `book_data`.`isbn` = '212-332-12221' AND `book_data`.`doner` = '-' AND `book_data`.`avbl` = 'Yes' AND `book_data`.`mid` = '-' AND `book_data`.`gd` = '-' AND `book_data`.`rd` = '-';

-- --------------------------------------------------------

--
-- Table structure for table `logdta`
--

CREATE TABLE IF NOT EXISTS "logdta" (
  "uname" varchar(20) NOT NULL DEFAULT '',
  "pword" varchar(50) DEFAULT NULL,
  PRIMARY KEY ("uname")
);

--
-- Dumping data for table `logdta`
--

UPDATE `logdta` SET `uname` = 'admin',`pword` = '123' WHERE `logdta`.`uname` = 'admin';

-- --------------------------------------------------------

--
-- Table structure for table `studata`
--

CREATE TABLE IF NOT EXISTS "studata" (
  "id" int(11) DEFAULT NULL,
  "inm" varchar(50) DEFAULT '(None)',
  "nm" varchar(70) DEFAULT '(None)',
  "nic" varchar(30) DEFAULT '(None)',
  "adr" varchar(50) DEFAULT '(None)',
  "mail" varchar(50) DEFAULT '(None)',
  "gen" varchar(10) DEFAULT NULL,
  "con" tinytext
);

--
-- Dumping data for table `studata`
--

UPDATE `studata` SET `id` = 1,`inm` = '1234',`nm` = 'Sameera Madhusanka',`nic` = '965487646V',`adr` = 'Massimbula,Godakawela',`mail` = 'l.sameeramadhusanka@gmail.com',`gen` = 'Male',`con` = '0717979760' WHERE `studata`.`id` = 1 AND `studata`.`inm` = '1234' AND `studata`.`nm` = 'Sameera Madhusanka' AND `studata`.`nic` = '965487646V' AND `studata`.`adr` = 'Massimbula,Godakawela' AND `studata`.`mail` = 'l.sameeramadhusanka@gmail.com' AND `studata`.`gen` = 'Male' AND `studata`.`con` = '0717979760';
UPDATE `studata` SET `id` = 2,`inm` = '9878',`nm` = 'Rohan Dhananjaya Amarasooriya',`nic` = '962062474V',`adr` = 'Massimbula, Godakawela',`mail` = 'rohandhananjaya@gmail.com',`gen` = 'Male',`con` = '0713660279' WHERE `studata`.`id` = 2 AND `studata`.`inm` = '9878' AND `studata`.`nm` = 'Rohan Dhananjaya Amarasooriya' AND `studata`.`nic` = '962062474V' AND `studata`.`adr` = 'Massimbula, Godakawela' AND `studata`.`mail` = 'rohandhananjaya@gmail.com' AND `studata`.`gen` = 'Male' AND `studata`.`con` = '0713660279';
UPDATE `studata` SET `id` = 3,`inm` = '5648',`nm` = 'Asanka Dhamith Liyanage',`nic` = '974585579V',`adr` = 'Malwatta,Godakawela',`mail` = '-',`gen` = 'Male',`con` = '0725687489' WHERE `studata`.`id` = 3 AND `studata`.`inm` = '5648' AND `studata`.`nm` = 'Asanka Dhamith Liyanage' AND `studata`.`nic` = '974585579V' AND `studata`.`adr` = 'Malwatta,Godakawela' AND `studata`.`mail` = '-' AND `studata`.`gen` = 'Male' AND `studata`.`con` = '0725687489';
UPDATE `studata` SET `id` = 5,`inm` = '789',`nm` = 'Chathurika Rajapakshe',`nic` = '85645789V',`adr` = 'Kahawatta,Godakawela',`mail` = 'chathurikarajapakshe@gmail.com',`gen` = 'Female',`con` = '0778965789' WHERE `studata`.`id` = 5 AND `studata`.`inm` = '789' AND `studata`.`nm` = 'Chathurika Rajapakshe' AND `studata`.`nic` = '85645789V' AND `studata`.`adr` = 'Kahawatta,Godakawela' AND `studata`.`mail` = 'chathurikarajapakshe@gmail.com' AND `studata`.`gen` = 'Female' AND `studata`.`con` = '0778965789';
UPDATE `studata` SET `id` = 6,`inm` = '365',`nm` = 'Dinu Edirimanna',`nic` = '89564587V',`adr` = 'Abilipitiya',`mail` = '-',`gen` = 'Female',`con` = '074568975' WHERE `studata`.`id` = 6 AND `studata`.`inm` = '365' AND `studata`.`nm` = 'Dinu Edirimanna' AND `studata`.`nic` = '89564587V' AND `studata`.`adr` = 'Abilipitiya' AND `studata`.`mail` = '-' AND `studata`.`gen` = 'Female' AND `studata`.`con` = '074568975';
