package com.example.keptcha.service;


import com.example.keptcha.data.BookRepo;
import com.example.keptcha.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class LibraryService {


    @Autowired
    BookRepo bookRepo;


    public Book insertBook(String bookName,  String bookAuthor){

        Book book= new Book();
        book.setBookName(bookName);
        book.setAuthor(bookAuthor);
        return bookRepo.save(book);

    }
    public  List<Book> getAllBooks(){

        return bookRepo.findAll();
    }
}
