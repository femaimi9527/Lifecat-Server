-- auto Generated on 2018-11-28 09:29:40 
-- DROP TABLE IF EXISTS `user`; 
CREATE TABLE user(
    `id` INTEGER(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
    `user_id` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '�û�ID',
    `user_name` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '�û��˺� Unique',
    `user_sex` INTEGER(12) NOT NULL DEFAULT -1 COMMENT '�Ա� 0�� 1�� 2Ů',
    `user_birthday` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '����',
    `user_email` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '����',
    `user_location` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'סַ',
    `user_phone` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '�ֻ���',
    `user_icon_url` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '�û�ͷ������',
    `source` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '�û���Դ(�����Ƽ�����)',
    `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'createTime',
    `update_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'updateTime',
    `is_deleted` INTEGER(12) NOT NULL DEFAULT -1 COMMENT 'isDeleted',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'user';
