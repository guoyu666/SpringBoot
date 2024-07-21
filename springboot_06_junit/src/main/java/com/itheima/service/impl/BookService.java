package com.itheima.service.impl;

import org.springframework.stereotype.Service;

@Service
public class BookService implements com.itheima.service.BookService {
    @Override
    public void save() {
        System.out.println("保存图书");
    }
}
