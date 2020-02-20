/**
 * 
 */
package com.spain.csd.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author devpatna
 *
 */
@Entity
@Table(name = "tbl_category")
//@Setter
//@Getter
@ToString
public class BookCategory implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "category_name")
	private String ctaegoryName;
	
	// List of Books
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
	private Set<Book> book;

	// getter and setter
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCtaegoryName() {
		return ctaegoryName;
	}

	public void setCtaegoryName(String ctaegoryName) {
		this.ctaegoryName = ctaegoryName;
	}

	public Set<Book> getBook() {
		return book;
	}

	public void setBook(Set<Book> book) {
		this.book = book;
	}
	
}
