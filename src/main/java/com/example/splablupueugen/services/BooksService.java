package com.example.splablupueugen.services;

import com.example.splablupueugen.Book;
import com.example.splablupueugen.persistence.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BooksService {

    private final CrudRepository<Book> booksRepository;

    public BooksService(CrudRepository<Book> booksRepository) {
        this.booksRepository = booksRepository;
    }

    public Book save(Book book) {
        return booksRepository.save(book);
    }

    public List<Book> findAll() {
        return booksRepository.findAll();
    }

    public Optional<Book> findById(Integer id) {
        return booksRepository.findById(id);
    }
}