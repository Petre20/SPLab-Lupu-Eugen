package com.example.splablupueugen.observer;

import com.example.splablupueugen.Book;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers(Book book);
}