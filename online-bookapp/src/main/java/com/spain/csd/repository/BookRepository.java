/**
 * 
 */
package com.spain.csd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.spain.csd.entity.Book;

/**
 * @author devpatna
 *
 */
@CrossOrigin("http://localhost:4200")
public interface BookRepository extends JpaRepository<Book, Long>{

}
