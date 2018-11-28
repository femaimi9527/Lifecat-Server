-- auto Generated on 2018-11-28 09:30:40 
-- DROP TABLE IF EXISTS `permission`; 
CREATE TABLE permission(
    `id` INTEGER(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
    `permission_id` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'Ȩ��ID',
    `permission_name` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'Ȩ������',
    `permission_desc` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'Ȩ������',
    `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'createTime',
    `update_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'updateTime',
    `is_deleted` INTEGER(12) NOT NULL DEFAULT -1 COMMENT 'isDeleted',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'permission';
