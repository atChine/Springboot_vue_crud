package com.example.demo.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.bean.Book;
import com.example.demo.service.IBookService;
import com.example.demo.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private IBookService iBookService;

    @GetMapping//查询所有
    public R getAll(){
        return new R(true,iBookService.list());
    }

    @PostMapping//增
    public R save(@RequestBody Book book){
        return new R(iBookService.save(book));
    }

    @DeleteMapping("{id}")//按照Id删除
    public R delete(@PathVariable Integer id){
        return new R(iBookService.delete(id));
    }

    @PutMapping//修改
    public R update(@RequestBody Book book){
        return new R(iBookService.modify(book));
    }

    @GetMapping("{id}")//id查询
    public R getById(@PathVariable Integer id){
        return new R(true,iBookService.getById(id));
    }

    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable Integer currentPage, @PathVariable int pageSize){
        return new R(true,iBookService.getPage(currentPage,pageSize));
    }
}
