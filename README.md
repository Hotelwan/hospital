# hospital
医疗管理系统

#upload sql file
date:2017.12.18
----PengKe---

#update sql file
date:2017.12.21
商品详细信息表（wares_many）
修改字段：category(类别) 类型为 bigint、外键 参照表category中id
新增表：类别表（category）
code：
CREATE TABLE `category` (
  `id` bigint(20) NOT NULL COMMENT '类别id',
  `type` varchar(50) DEFAULT NULL COMMENT '类别',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
