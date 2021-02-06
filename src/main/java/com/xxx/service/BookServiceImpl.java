package com.xxx.service;

import com.xxx.dao.BookDao;
import com.xxx.domain.Books;
import com.xxx.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao dao;

    @Override
    public Books selectBooksById(Integer id) {
        return dao.selectBooksById(id);
    }

    @Override
    public int insertBook(Books books) {
        return dao.insertBook(books);
    }

    @Override
    public int deleteBookById(Integer id) {
        return dao.deleteBookById(id);
    }

    @Override
    public List<Books> selectBooks() {
        return dao.selectBooks();
    }

    @Override
    public int updateBook(Books books) {
        return dao.updateBook(books);
    }

    @Override
    public Books selectBookByName(String bookName) {
        return dao.selectBookByName(bookName);
    }

    public BookDao getDao() {
        return dao;
    }

    public void setDao(BookDao dao) {
        this.dao = dao;
    }
}
