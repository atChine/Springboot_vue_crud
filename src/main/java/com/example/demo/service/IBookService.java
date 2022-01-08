package com.example.demo.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.bean.Book;


public interface IBookService extends IService<Book> {
        // 追加的操作与原始操作通过名称区分，功能类似
        Boolean delete(Integer id);

        Boolean insert(Book book);

        Boolean modify(Book book);

        Book get(Integer id);

        IPage<Book> getPage(int currentPage, int pageSize);

}

