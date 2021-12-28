package com.comptivia.trade.protfoliomanager.controller;

import java.util.List;

import com.comptivia.trade.protfoliomanager.model.Book;
import com.comptivia.trade.protfoliomanager.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class BookController {

    @Autowired
    private BookRepository bookRepo;

    @PostMapping("book/add")
    public String saveBook(@RequestBody Book book) {
        bookRepo.save(book);
        return "Added book successfully with id : "+ book.getId();
    }
    @GetMapping("book/list")
    public List<Book> getBooks() {
        return bookRepo.findAll();
    }
}
