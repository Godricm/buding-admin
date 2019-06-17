package org.buding.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;


/**
 * 通用mapper,注意:这个mapper不能和其它mapper放在一起
 * 也就是不能被Mybatis扫描到
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
