/**
 * 
 */
package com.spain.csd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spain.csd.entity.Book;

/**
 * @author devpatna
 *
 */
public interface BookRepository extends JpaRepository<Book, Long>{

}
