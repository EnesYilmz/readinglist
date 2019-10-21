package com.manning.readingList.dao;

import java.util.List;

import com.manning.readingList.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReadingListRepository extends JpaRepository<Book, Long> {
    List<Book> findByReader(String reader);
}
