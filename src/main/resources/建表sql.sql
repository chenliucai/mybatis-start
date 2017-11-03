
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(64) NOT NULL DEFAULT '',
  `dept` varchar(254) NOT NULL DEFAULT '',
  `website` varchar(254) DEFAULT '',
  `phone` varchar(16) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'yiibai', 'Tech', 'http://www.yiibai.com', '13800009988');



DROP TABLE IF EXISTS `user1`;
CREATE TABLE `user1` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(64) NOT NULL DEFAULT '',
  `dept` varchar(254) NOT NULL DEFAULT '',
  `website` varchar(254) DEFAULT '',
  `phone` varchar(16) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user1` VALUES ('1', 'yiibai', 'Tech', 'http://www.yiibai.com', '13800009988');

DROP TABLE IF EXISTS `user2`;
CREATE TABLE `user2` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(64) NOT NULL DEFAULT '',
  `dept` varchar(254) NOT NULL DEFAULT '',
  `website` varchar(254) DEFAULT '',
  `phone` varchar(16) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user2` VALUES ('1', 'yiibai', 'Tech', 'http://www.yiibai.com', '13800009988');


-- ----------------------------
-- Table structure for `post`
-- ----------------------------
DROP TABLE IF EXISTS `post`;
CREATE TABLE `post` (
  `post_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `userid` int(10) unsigned NOT NULL,
  `title` varchar(254) NOT NULL DEFAULT '',
  `content` text,
  `created` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`post_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of post
-- ----------------------------
INSERT INTO `post` VALUES ('1', '1', 'MyBatis关联数据查询', '在实际项目中，经常使用关联表的查询，比如：多对一，一对多等。这些查询是如何处理的呢，这一讲就讲这个问题。我们首先创建一个 post 表，并初始化数据.', '2015-09-23 21:40:17');
INSERT INTO `post` VALUES ('2', '1', 'MyBatis开发环境搭建', '为了方便学习，这里直接建立java 工程，但一般都是开发 Web 项目。', '2015-09-23 21:42:14');
INSERT INTO `post` VALUES ('3', '2', '这个是别人发的', 'content,内容...', '0000-00-00 00:00:00');  


-- ----------------------------
-- Table structure for `post`
-- ----------------------------
DROP TABLE IF EXISTS `post2`;
CREATE TABLE `post2` (
  `post_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `userid` int(10) unsigned NOT NULL,
  `title` varchar(254) NOT NULL DEFAULT '',
  `content` text,
  `created` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`post_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of post
-- ----------------------------
INSERT INTO `post2` VALUES ('1', '1', 'MyBatis关联数据查询', '在实际项目中，经常使用关联表的查询，比如：多对一，一对多等。这些查询是如何处理的呢，这一讲就讲这个问题。我们首先创建一个 post 表，并初始化数据.', '2015-09-23 21:40:17');
INSERT INTO `post2` VALUES ('2', '1', 'MyBatis开发环境搭建', '为了方便学习，这里直接建立java 工程，但一般都是开发 Web 项目。', '2015-09-23 21:42:14');
INSERT INTO `post2` VALUES ('3', '2', '这个是别人发的', 'content,内容...', '0000-00-00 00:00:00'); 





DROP TABLE IF EXISTS `user3`;
-- ----------------------------
-- Table structure for `user`
-- ----------------------------
CREATE TABLE `user3` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(64) NOT NULL DEFAULT '',
  `mobile` int(10) unsigned NOT NULL DEFAULT '0',
  `created` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user3` VALUES ('1', 'yiibai', '100', '2015-09-23 20:11:23');


DROP TABLE IF EXISTS `post3`;

-- ----------------------------
-- Table structure for `post`
-- ----------------------------
CREATE TABLE `post3` (
  `post_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `userid` int(10) unsigned NOT NULL,
  `title` varchar(254) NOT NULL DEFAULT '',
  `content` text,
  `created` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`post_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of post
-- ----------------------------
INSERT INTO `post3` VALUES ('1', '1', 'MyBatis关联数据查询', '在实际项目中，经常使用关联表的查询，比如：多对一，一对多等。这些查询是如何处理的呢，这一讲就讲这个问题。我们首先创建一个 post 表，并初始化数据.', '2015-09-23 21:40:17');
INSERT INTO `post3` VALUES ('2', '1', 'MyBatis开发环境搭建', '为了方便学习，这里直接建立java 工程，但一般都是开发 Web 项目。', '2015-09-23 21:42:14');
INSERT INTO `post3` VALUES ('3', '2', '这个是别人发的', 'content,内容...', '0000-00-00 00:00:00');  



DROP TABLE IF EXISTS `user4`;
CREATE TABLE `user4` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(64) NOT NULL DEFAULT '',
  `mobile` varchar(16) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user4` VALUES ('1', 'yiibai', '13838009988');
INSERT INTO `user4` VALUES ('2', 'User-name-1', '13838009988');

DROP TABLE IF EXISTS `group4`;
CREATE TABLE `group4` (
  `group_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `group_name` varchar(254) NOT NULL DEFAULT '',
  PRIMARY KEY (`group_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of group
-- ----------------------------
INSERT INTO `group4` VALUES ('1', 'Group-1');
INSERT INTO `group4` VALUES ('2', 'Group-2');




DROP TABLE IF EXISTS `user_group4`;
CREATE TABLE `user_group4` (
  `user_id` int(10) unsigned NOT NULL DEFAULT '0',
  `group_id` int(10) unsigned NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_group
-- ----------------------------
INSERT INTO `user_group4` VALUES ('1', '1');
INSERT INTO `user_group4` VALUES ('2', '1');
INSERT INTO `user_group4` VALUES ('1', '2');





DROP TABLE IF EXISTS `user5`;
CREATE TABLE `user5` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(64) NOT NULL DEFAULT '',
  `mobile` varchar(16) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user5` VALUES ('1', 'yiibai', '13838009988');
INSERT INTO `user5` VALUES ('2', 'saya', '13838009988');


DROP TABLE IF EXISTS `order5`;
CREATE TABLE `order5` (
  `order_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(10) unsigned NOT NULL DEFAULT '0',
  `order_no` varchar(16) NOT NULL DEFAULT '',
  `money` float(10,2) unsigned DEFAULT '0.00',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order
-- ----------------------------
INSERT INTO `order5` VALUES ('1', '1', '1509289090', '99.90');
INSERT INTO `order5` VALUES ('2', '1', '1519289091', '290.80');
INSERT INTO `order5` VALUES ('3', '1', '1509294321', '919.90');
INSERT INTO `order5` VALUES ('4', '1', '1601232190', '329.90');
INSERT INTO `order5` VALUES ('5', '1', '1503457384', '321.00');
INSERT INTO `order5` VALUES ('6', '1', '1598572382', '342.00');
INSERT INTO `order5` VALUES ('7', '1', '1500845727', '458.00');
INSERT INTO `order5` VALUES ('8', '1', '1508458923', '1200.00');
INSERT INTO `order5` VALUES ('9', '1', '1504538293', '2109.00');
INSERT INTO `order5` VALUES ('10', '1', '1932428723', '5888.00');
INSERT INTO `order5` VALUES ('11', '1', '2390423712', '3219.00');
INSERT INTO `order5` VALUES ('12', '1', '4587923992', '123.00');
INSERT INTO `order5` VALUES ('13', '1', '4095378812', '421.00');
INSERT INTO `order5` VALUES ('14', '1', '9423890127', '678.00');
INSERT INTO `order5` VALUES ('15', '1', '7859213249', '7689.00');
INSERT INTO `order5` VALUES ('16', '1', '4598450230', '909.20');


