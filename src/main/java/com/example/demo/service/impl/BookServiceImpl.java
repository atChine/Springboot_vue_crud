package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.bean.Book;
import com.example.demo.dao.BookDao;
import com.example.demo.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookServiceImpl extends ServiceImpl<BookDao, Book> implements IBookService {

    @Autowired
    private BookDao bookDao;

    public Boolean insert(Book book) {
        return bookDao.insert(book) > 0;
    }

    public Boolean modify(Book book) {
        return bookDao.updateById(book) > 0;
    }

    public Boolean delete(Integer id) {
        return bookDao.deleteById(id) > 0;
    }

    public Book get(Integer id) {
        return bookDao.selectById(id);
    }

    @Override
    public IPage<Book> getPage(int currentPage, int pageSize) {
        IPage page = new Page(currentPage,pageSize);
        bookDao.selectPage(page,null);
        return page;
    }
}
