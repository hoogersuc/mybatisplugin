package com.dpnet.mybatis.plugins;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.special.InsertListMapper;

/**
 * @author Youtao
 *         Created by youtao on 2017/8/17.
 */
public interface DPMapper<T> extends Mapper<T>, InsertListMapper<T> {
}
