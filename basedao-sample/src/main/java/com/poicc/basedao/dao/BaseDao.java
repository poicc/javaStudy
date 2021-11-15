package com.poicc.basedao.dao;

import java.util.List;

/**
 * @description:
 * @author: crq
 * @create: 2021-11-15 08:08
 **/
public interface BaseDao<T> {
    /**
     * 新增
     * @param t 泛型入参
     */
    void add(T t);

    /**
     * 删除
     * @param t 泛型入参
     */
    void delete(T t);

    /**
     * 根据id查询
     * @param id 主键
     * @return T
     */
    T get(Long id);

    /**
     * 根据指定的属性查找
     * @param fieldName 域
     * @param value 值
     * @return T
     */
    List<T> findByField(String fieldName,Object value);

    /**
     * 修改
     * @param t 泛型入参
     * @param id 主键
     */
    void update(T t, Long id);

    /**
     * 查询所有
     * @return list
     */
    List<T> findAll();
}
