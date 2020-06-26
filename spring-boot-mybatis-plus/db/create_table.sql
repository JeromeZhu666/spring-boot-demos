-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user`  (
  `id` varchar(64) NOT NULL COMMENT '主键id',
  `name` varchar(32) NULL DEFAULT NULL COMMENT '姓名',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `create_user` varchar(64) NULL DEFAULT NULL COMMENT '创建人',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `update_user` varchar(64) NULL DEFAULT NULL COMMENT '更新人',
  `del_flag` varchar(2) NULL DEFAULT '0' COMMENT '逻辑删除标识: (1: 删除; 0: 正常(数据库默认))',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;