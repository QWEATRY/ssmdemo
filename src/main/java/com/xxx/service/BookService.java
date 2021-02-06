package com.xxx.service;

import com.xxx.domain.Books;

import java.util.List;

public interface BookService {

    //查询书
    Books selectBooksById(Integer id);

    //增加书
    int insertBook(Books books);

    //删除书
    int deleteBookById(Integer id);

    //查询全部书
    List<Books> selectBooks();

    //更新书
    int updateBook(Books books);

    Books selectBookByName(String bookName);
}
