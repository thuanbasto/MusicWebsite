CREATE DATABASE  IF NOT EXISTS `music`;
use music;
CREATE TABLE `user` (
  `user_Id` bigint PRIMARY KEY AUTO_INCREMENT,
  `name` nvarchar(255),
  `birthday` date,
  `gender` nvarchar(255),
  `email` nvarchar(255),
  `image_url` nvarchar(255),
  `description` text(20000),
  `username` nvarchar(255) NOT NULL,
  `password` nvarchar(255) NOT NULL,
  `role` nvarchar(255),
  `enable` tinyint
);

CREATE TABLE `favourite` (
  `user_Id` bigint,
  `music_Id` bigint,
  PRIMARY KEY (`user_Id`, `music_Id`)
);

CREATE TABLE `user_playlist` (
  `playlist_Id` bigint,
  `user_Id` bigint,
  PRIMARY KEY (`playlist_Id`, `user_Id`)
);

CREATE TABLE `playlist` (
  `playlist_Id` bigint PRIMARY KEY AUTO_INCREMENT,
  `name` nvarchar(255),
  `share` tinyint,
  `description` text(20000)
);

CREATE TABLE `music_playlist` (
  `playlist_Id` bigint,
  `music_Id` bigint,
  PRIMARY KEY (`playlist_Id`, `music_Id`)
);

CREATE TABLE `music` (
  `music_Id` bigint PRIMARY KEY AUTO_INCREMENT,
  `name` nvarchar(255) NOT NULL,
  `uploaded_date` datetime,
  `lyrics` text(20000),
  `description` text(20000),
  `image_url` nvarchar(255),
  `video_url` nvarchar(255),
  `music_url` nvarchar(255),
  `view` bigint,
  `enable` tinyint,
  `user_Id` bigint,
  `category_Id` bigint,
  `singer_Id` bigint,
  `musician_Id` bigint
);

CREATE TABLE `category` (
  `category_Id` bigint PRIMARY KEY,
  `name` nvarchar(255),
  `country` nvarchar(255),
  `description` text(20000)
);

CREATE TABLE `artist` (
  `artist_Id` bigint PRIMARY KEY AUTO_INCREMENT,
  `name` nvarchar(255),
  `birthday` date,
  `gender` nvarchar(255),
  `image_url` nvarchar(255),
  `description` text(20000)
);

ALTER TABLE `music_playlist` ADD FOREIGN KEY (`playlist_Id`) REFERENCES `playlist` (`playlist_Id`);

ALTER TABLE `music_playlist` ADD FOREIGN KEY (`music_Id`) REFERENCES `music` (`music_Id`);

ALTER TABLE `music` ADD FOREIGN KEY (`user_Id`) REFERENCES `user` (`user_Id`);

ALTER TABLE `music` ADD FOREIGN KEY (`singer_Id`) REFERENCES `artist` (`artist_Id`);

ALTER TABLE `music` ADD FOREIGN KEY (`musician_Id`) REFERENCES `artist` (`artist_Id`);

ALTER TABLE `music` ADD FOREIGN KEY (`category_Id`) REFERENCES `category` (`category_Id`);

ALTER TABLE `user_playlist` ADD FOREIGN KEY (`user_Id`) REFERENCES `user` (`user_Id`);

ALTER TABLE `user_playlist` ADD FOREIGN KEY (`playlist_Id`) REFERENCES `playlist` (`playlist_Id`);

ALTER TABLE `favourite` ADD FOREIGN KEY (`user_Id`) REFERENCES `user` (`user_Id`);

ALTER TABLE `favourite` ADD FOREIGN KEY (`music_Id`) REFERENCES `music` (`music_Id`);

