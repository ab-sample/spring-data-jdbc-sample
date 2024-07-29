DROP TABLE IF EXISTS sys_user;
CREATE TABLE sys_user (
    id                      int PRIMARY KEY AUTO_INCREMENT COMMENT 'ID',
    username                varchar(128) NOT NULL DEFAULT '' COMMENT '用户名',
    password                varchar(256) NOT NULL DEFAULT '' COMMENT '密码',
    account_non_expired     tinyint      NOT NULL DEFAULT '0' COMMENT '账号是否过期,0:未过期,1:已过期',
    account_non_locked      tinyint      NOT NULL DEFAULT '0' COMMENT '账号是否锁定,0:未锁定,1:已锁定',
    credentials_non_expired tinyint      NOT NULL DEFAULT '0' COMMENT '认证是否过期,0:未过期,1:已过期',
    enabled                 tinyint      NOT NULL DEFAULT '1' COMMENT '是否可用,0:不可用,1:可用',
    full_name               varchar(128) NOT NULL DEFAULT '' COMMENT '姓名',
    email_address           varchar(128) NOT NULL DEFAULT '' COMMENT '邮件地址',
    birth_date              date         NOT NULL DEFAULT (NOW()) COMMENT '生日'
);