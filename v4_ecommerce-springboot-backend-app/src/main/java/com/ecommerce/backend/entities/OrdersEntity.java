package com.ecommerce.backend.entities;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name="orders")
public class OrdersEntity {
		
		    @Id
		    @GeneratedValue(strategy = GenerationType.AUTO)
		    @Column(name="id")
		    private Integer id;
			
			@Column
			@CreationTimestamp
		    private LocalDate order_Date;
		    @CreationTimestamp 
			@Column
			private LocalTime order_Time;
		    @Column
		    private String payment_type;
		

//		    @OneToMany(cascade = CascadeType.ALL,mappedBy = "ordersEntity")
//		    private List<ProductEntity> productEntity;
		   
		    @JsonIgnore
		    @OneToMany(cascade = CascadeType.ALL,mappedBy = "ordersEntity",fetch = FetchType.EAGER)
		    private List<Order_items>order_items=new ArrayList<>();
		    
		    @JsonIgnore
		    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
		    @JoinColumn(name = "user_Id",referencedColumnName = "id")
		    private UsersEntity usersEntity;
		    
		    @OneToOne(cascade = CascadeType.ALL)
			@JoinColumn(name="adddress_id",nullable = false)
	        private ShippingAddressEntity shippingAddressEntity;


			public OrdersEntity() {
				super();
				// TODO Auto-generated constructor stub
			}


			public OrdersEntity(LocalDate order_Date, LocalTime order_Time, String payment_type,
					List<Order_items> order_items, UsersEntity usersEntity,
					ShippingAddressEntity shippingAddressEntity) {
				super();
				this.order_Date = order_Date;
				this.order_Time = order_Time;
				this.payment_type = payment_type;
				this.order_items = order_items;
				this.usersEntity = usersEntity;
				this.shippingAddressEntity = shippingAddressEntity;
			}


			public Integer getId() {
				return id;
			}


			public void setId(Integer id) {
				this.id = id;
			}


			public LocalDate getOrder_Date() {
				return order_Date;
			}


			public void setOrder_Date(LocalDate order_Date) {
				this.order_Date = order_Date;
			}


			public LocalTime getOrder_Time() {
				return order_Time;
			}


			public void setOrder_Time(LocalTime order_Time) {
				this.order_Time = order_Time;
			}


			public String getPayment_type() {
				return payment_type;
			}


			public void setPayment_type(String payment_type) {
				this.payment_type = payment_type;
			}


			public List<Order_items> getOrder_items() {
				return order_items;
			}


			public void setOrder_items(List<Order_items> order_items) {
				this.order_items = order_items;
			}


			public UsersEntity getUsersEntity() {
				return usersEntity;
			}


			public void setUsersEntity(UsersEntity usersEntity) {
				this.usersEntity = usersEntity;
			}


			public ShippingAddressEntity getShippingAddressEntity() {
				return shippingAddressEntity;
			}


			public void setShippingAddressEntity(ShippingAddressEntity shippingAddressEntity) {
				this.shippingAddressEntity = shippingAddressEntity;
			}


			@Override
			public String toString() {
				return "OrdersEntity [id=" + id + ", order_Date=" + order_Date + ", order_Time=" + order_Time
						+ ", payment_type=" + payment_type + ", order_items=" + order_items + ", usersEntity="
						+ usersEntity + ", shippingAddressEntity=" + shippingAddressEntity + "]";
			}
			
}
