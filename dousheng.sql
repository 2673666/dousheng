/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1_mysql
Source Server Version : 50734
Source Host           : localhost:13306
Source Database       : dousheng

Target Server Type    : MYSQL
Target Server Version : 50734
File Encoding         : 65001

Date: 2023-02-19 12:11:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `vid` bigint(20) unsigned NOT NULL COMMENT '视频id',
  `uid` bigint(20) unsigned NOT NULL COMMENT '用户id',
  `content` text NOT NULL COMMENT '评论内容',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '发布时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
  `is_deleted` tinyint(4) NOT NULL DEFAULT '0' COMMENT '逻辑删除',
  PRIMARY KEY (`id`),
  KEY `comment_user_uid_fk` (`uid`),
  KEY `comment_video_vid_fk` (`vid`),
  CONSTRAINT `comment_user_uid_fk` FOREIGN KEY (`uid`) REFERENCES `user` (`id`),
  CONSTRAINT `comment_video_vid_fk` FOREIGN KEY (`vid`) REFERENCES `video` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COMMENT='评论表';

-- ----------------------------
-- Table structure for favourite
-- ----------------------------
DROP TABLE IF EXISTS `favourite`;
CREATE TABLE `favourite` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `uid` bigint(20) unsigned NOT NULL COMMENT '点赞者id',
  `vid` bigint(20) unsigned NOT NULL COMMENT '被点赞的视频id',
  `is_favourite` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否点赞',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '发布时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  KEY `favourite_user_uid_fk` (`uid`),
  KEY `favourite_video_vid_fk` (`vid`),
  CONSTRAINT `favourite_user_uid_fk` FOREIGN KEY (`uid`) REFERENCES `user` (`id`),
  CONSTRAINT `favourite_video_vid_fk` FOREIGN KEY (`vid`) REFERENCES `video` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COMMENT='点赞表';

-- ----------------------------
-- Table structure for follow
-- ----------------------------
DROP TABLE IF EXISTS `follow`;
CREATE TABLE `follow` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '关注id',
  `my_uid` bigint(20) unsigned NOT NULL COMMENT '用户id',
  `his_uid` bigint(20) unsigned NOT NULL COMMENT '用户查看的其他人的id',
  `is_follow` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否关注',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '发布时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`),
  KEY `follow_my_uid_fk` (`my_uid`),
  KEY `follow_his_uid_fk` (`his_uid`),
  CONSTRAINT `follow_his_uid_fk` FOREIGN KEY (`his_uid`) REFERENCES `user` (`id`),
  CONSTRAINT `follow_my_uid_fk` FOREIGN KEY (`my_uid`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='关注表';

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `name` varchar(255) NOT NULL DEFAULT '' COMMENT '用户昵称',
  `password` varchar(255) NOT NULL DEFAULT '' COMMENT '密码',
  `follow_count` int(11) NOT NULL COMMENT '关注数量',
  `follower_count` bigint(20) NOT NULL COMMENT '粉丝数量',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
  `is_follow` tinyint(1) NOT NULL DEFAULT '0' COMMENT '逻辑删除',
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COMMENT='用户表';

-- ----------------------------
-- Table structure for video
-- ----------------------------
DROP TABLE IF EXISTS `video`;
CREATE TABLE `video` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `uid` bigint(20) unsigned NOT NULL COMMENT '视频发布者id',
  `play_url` text NOT NULL COMMENT '视频文件路径',
  `cover_url` text NOT NULL COMMENT '视频封面路径',
  `comment_count` bigint(20) NOT NULL DEFAULT '0' COMMENT '评论数量',
  `favourite_count` bigint(20) NOT NULL DEFAULT '0' COMMENT '点赞数量',
  `title` varchar(255) NOT NULL COMMENT '视频标题',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '发布时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
  `is_favourite` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `video_user_uid_fk` (`uid`),
  CONSTRAINT `video_user_uid_fk` FOREIGN KEY (`uid`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COMMENT='视频表';
