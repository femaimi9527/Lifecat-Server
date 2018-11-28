-- auto Generated on 2018-11-28 09:30:52 
-- DROP TABLE IF EXISTS `info`; 
CREATE TABLE info(
    `id` INTEGER(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
    `info_id` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '��ϢID',
    `user_id` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '��Ϣ�����û�ID',
    `info_title` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '��Ϣ����',
    `info_content` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '��Ϣ����',
    `info_level` INTEGER(12) NOT NULL DEFAULT -1 COMMENT '��Ϣ��ʾ�ȼ� 0���� 1��ʾ ...',
    `is_readed` INTEGER(12) NOT NULL DEFAULT -1 COMMENT '��Ϣ�Ķ����',
    `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'createTime',
    `update_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'updateTime',
    `is_deleted` INTEGER(12) NOT NULL DEFAULT -1 COMMENT 'isDeleted',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'info';
