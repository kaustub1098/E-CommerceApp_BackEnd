package com.ecommerce.backend.repository.entities;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="orders")
@Getter
@Setter
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
		    private Long order_total_Price;
		    @Column
		    private String order_items;
		    @Column
		    private String payment_type;
		    
		    @Column
		    private Integer user_id;
		    
		    @Column 
		    private Integer product_id;

		
	
	
	
	
	
	
}
