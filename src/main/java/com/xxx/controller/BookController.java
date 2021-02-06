package com.xxx.controller;

import com.xxx.domain.Books;
import com.xxx.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

//    @Resource
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    @RequestMapping("/allBook")
    public ModelAndView selectAllBook()
    {
        List<Books> booksList=bookService.selectBooks();
        ModelAndView mv=new ModelAndView();
        mv.addObject("list",booksList);
        mv.setViewName("allBook");
        return mv;
    }

    @RequestMapping("/toAddBook")
    public String toAddPage()
    {
        return "addBook";
    }

    @RequestMapping("/addBook")
    public String addBook(Books books)
    {
        bookService.insertBook(books);

        return "redirect:/book/allBook";
    }

    @RequestMapping("/toUpdate")
    public ModelAndView toUpdatePage(Integer bookId)
    {
        Books books=bookService.selectBooksById(bookId);

        ModelAndView mv=new ModelAndView();
        mv.addObject("books",books);
        mv.setViewName("updateBook");
        return mv;
    }

    @RequestMapping("/updateBook")
    public String updateBook(Books books)
    {
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/deleteBook")
    public String deleteBook(Integer bookId)
    {
        bookService.deleteBookById(bookId);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/queryBook")
    public ModelAndView queryBook(String queryBookName)
    {
        ModelAndView mv=new ModelAndView();
        Books books=bookService.selectBookByName(queryBookName);
        List<Books> list=new ArrayList<>();

        if(books==null){
            list=bookService.selectBooks();
            mv.addObject("error","未查到");
            mv.addObject("list",list);
        }
        else{
            list.add(books);
            mv.addObject("list",list);
        }

        mv.setViewName("allBook");
        return mv;
    }
}
