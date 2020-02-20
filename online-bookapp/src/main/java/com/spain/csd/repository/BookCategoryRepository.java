/**
 * 
 */
package com.spain.csd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.spain.csd.entity.BookCategory;

/**
 * @author devpatna
 *
 */
@Repository
@RepositoryRestResource(collectionResourceRel = "bookCategory", path = "book_category")
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {

}
