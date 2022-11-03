package com.example.keptcha.controller;


import com.example.keptcha.pojo.Book;
import com.example.keptcha.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LibraryController {


    @Autowired
    LibraryService service;


    @PostMapping("/insertBook/{bookName}/{bookAuthor}")
    Book insertBook(@PathVariable String bookName, @PathVariable String bookAuthor){

        return  service.insertBook(bookName,bookAuthor);

    }

    @GetMapping ("/getAllBooksInLibrary")
    List<Book> getAll(){
      return   service.getAllBooks();
    }

    @PostMapping("/deleteBook/{id}")
    String deleteBook(){

    }


}
