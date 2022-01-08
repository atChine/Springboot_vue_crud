package com.example.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.bean.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
public class ServiceBookTestCase {

    @Autowired
    private IBookService iBookService;

    @Test
    public void testGetById() {
        System.out.println(iBookService.getById(20));
    }

    @Test
    public void testSave() {
        Book book = new Book();
        book.setType("测试数据122222222223");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        iBookService.save(book);
    }

    @Test
    public  void testUpdate() {
        Book book = new Book();
        book.setId(23);
        book.setType("===========");
        book.setName("=========");
        book.setDescription("==========");
        iBookService.updateById(book);
    }

    @Test
    public  void testDelete() {
        iBookService.removeById(13);
    }

    @Test
    public  void testGetAll() {
        System.out.println(iBookService.list());
    }

    @Test
    public  void testGetPage() {
        IPage<Book> page = new Page<>(2, 5);
        iBookService.page(page);
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getPages());
        System.out.println(page.getTotal());
        System.out.println(page.getRecords());
    }
}

