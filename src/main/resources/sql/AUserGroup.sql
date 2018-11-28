-- auto Generated on 2018-11-28 09:31:21 
-- DROP TABLE IF EXISTS `a_user_group`; 
CREATE TABLE a_user_group(
    `id` INTEGER(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
    `user_id` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '�û�ID',
    `group_id` INTEGER(12) NOT NULL DEFAULT -1 COMMENT '����ID',
    `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'createTime',
    `update_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'updateTime',
    `is_deleted` INTEGER(12) NOT NULL DEFAULT -1 COMMENT 'isDeleted',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'a_user_group';
