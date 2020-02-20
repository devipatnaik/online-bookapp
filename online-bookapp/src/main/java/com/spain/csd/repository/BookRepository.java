/**
 * 
 */
package com.spain.csd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spain.csd.entity.Book;

/**
 * @author devpatna
 *
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
