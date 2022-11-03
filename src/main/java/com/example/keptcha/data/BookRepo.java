package com.example.keptcha.data;

import com.example.keptcha.pojo.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,Integer> {
}
