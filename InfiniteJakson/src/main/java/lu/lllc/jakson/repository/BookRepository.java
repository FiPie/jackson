package lu.lllc.jakson.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lu.lllc.jakson.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
