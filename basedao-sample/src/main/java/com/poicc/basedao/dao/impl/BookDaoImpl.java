package com.poicc.basedao.dao.impl;

import com.poicc.basedao.dao.BookDao;
import com.poicc.basedao.entity.Book;

/**
 * @description: BookDaoImpl实现类 实现BookDao接口 指定泛型
 * @author: crq
 * @create: 2021-11-15 08:20
 **/
public class BookDaoImpl extends BaseDaoImpl<Book> implements BookDao<Book> {
}
