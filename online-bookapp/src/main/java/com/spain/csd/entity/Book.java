package com.spain.csd.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author devpatna
 *
 */
@Entity
@Table(name = "tbl_book")
@Setter
@Getter
@ToString
public class Book implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String sku;
	
	private String name;
	
	private String description;
	
	private boolean active;
	
	@Column(name = "image_url")
	private String imageUrl;
	
	@Column(name = "units_in_stock")
	private BigDecimal unitsInStock;
	
	@Column(name = "unit_price")
	private BigDecimal unitPrice;
	
	@Column(name = "date_created")
	private Date createdOn;
	
	@Column(name = "last_updated")
	private Date updatedOn;
	
	@ManyToOne
	@JoinColumn(name = "category_id", nullable = false)
	private BookCategory category;
	
	// getter and setter
	
}
