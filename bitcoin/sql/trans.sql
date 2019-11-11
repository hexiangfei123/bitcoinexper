SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `trans`;
CREATE TABLE `trans`
(
    `TxId` int(11) NOT NULL ,
    `Blk_Id`        char(64),
    `TxHash`        char(64),
    `Version`        int(11),





    `IsTimeLock`        bit(1),
    `LockTimeValue`        int(11),
    PRIMARY KEY (`TxId`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  auto_increment = 1;
