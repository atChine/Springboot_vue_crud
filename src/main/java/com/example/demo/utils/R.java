package com.example.demo.utils;

import lombok.Data;

@Data
public class R {
    private Boolean flag;
    private Object date;

    public R() {
    }

    public R(Boolean flag){
        this.flag = flag;
    }

    public R(Boolean flag,Object date){
        this.flag = flag;
        this.date = date;
    }
}
