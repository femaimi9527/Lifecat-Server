-- auto Generated on 2018-11-28 09:31:06 
-- DROP TABLE IF EXISTS `dynamic`; 
CREATE TABLE dynamic(
    `id` INTEGER(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
    `dynamic_id` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '��̬ID',
    `user_id` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '�����û�ID',
    `dynamic_content` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '��̬����',
    `image_count` INTEGER(12) NOT NULL DEFAULT -1 COMMENT '��̬ͼƬ��Ŀ',
    `favorite_count` INTEGER(12) NOT NULL DEFAULT -1 COMMENT '������Ŀ',
    `comment_count` INTEGER(12) NOT NULL DEFAULT -1 COMMENT '������Ŀ',
    `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'createTime',
    `update_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'updateTime',
    `is_deleted` INTEGER(12) NOT NULL DEFAULT -1 COMMENT 'isDeleted',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'dynamic';
