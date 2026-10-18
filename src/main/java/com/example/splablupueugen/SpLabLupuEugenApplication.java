package com.example.splablupueugen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpLabLupuEugenApplication {

    public static void main(String[] args) {
        //SpringApplication.run(SpLabLupuEugenApplication.class, args);

        Book book = new Book("Cartea mea");

        Section cap1 = new Section("Capitolul 1");
        Section cap11 = new Section("Capitolul 1.1");
        Section cap2 = new Section("Capitolul 2");

        cap1.add(cap11);

        book.addContent(cap1);
        book.addContent(cap2);

        GenerateToC generateToC = new GenerateToC();

        book.accept(generateToC);

        TableOfContents toc = generateToC.getToC();
        toc.render();
    }

}
