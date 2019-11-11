SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for question
-- ----------------------------
DROP TABLE IF EXISTS `block`;
CREATE TABLE `block`
(
    `Height` int(11) NOT NULL ,
    `hash`        char (64),
    `Confirmations`        int (11),
    `Timestamp`           int(11)  ,
    `Miner`        char (64),
    `Difficulty`      datetime,
    `Version`        bigint(20),
    `Difficulty`        int (11),
    `Bits`           char (64),
    `Size`        int (11),
    `Nonce`      char(64),
    `Blk_Id` int(11)  NOT NULL ,

    PRIMARY KEY (`Blk_Id`),

) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 auto_increment=1;
