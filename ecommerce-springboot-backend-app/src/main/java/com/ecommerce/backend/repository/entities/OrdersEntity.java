package com.ecommerce.backend.repository.entities;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Entity
@Table(name="orders")
@Data
public class OrdersEntity {

			
	 	   //@GeneratedValue(strategy = GenerationType.SEQUENCE)
		    
		    
			
		    @Id
		    @GeneratedValue(strategy = GenerationType.AUTO)
		    @Column(name="id")
		    private Integer id;
			
			@Column
			@CreationTimestamp
		    private LocalDateTime order_date;
		     
		    @Column
		    private Integer order_total_Price;
		    @Column
		    private String order_items;
		    @Column
		    private String payment_type;
		

		    @OneToMany(cascade = CascadeType.ALL,mappedBy = "ordersEntity")
		    private List<ProductEntity> productEntity;

		
	
	
}
