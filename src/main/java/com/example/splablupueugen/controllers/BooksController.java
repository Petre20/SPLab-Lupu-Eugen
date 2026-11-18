package com.example.splablupueugen.controllers;

import com.example.splablupueugen.Book;
import com.example.splablupueugen.services.BooksService;
import org.springframework.web.bind.annotation.*;
import com.example.splablupueugen.observer.AllBooksSubject;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    private final BooksService booksService;
    private final AllBooksSubject allBooksSubject;

    public BooksController(BooksService booksService, AllBooksSubject allBooksSubject) {
        this.booksService = booksService;
        this.allBooksSubject = allBooksSubject;
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return booksService.findAll();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Integer id) {
        return booksService.findById(id).orElse(null);
    }

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        Book savedBook = booksService.save(book);
        allBooksSubject.add(savedBook);
        return savedBook;
    }
}