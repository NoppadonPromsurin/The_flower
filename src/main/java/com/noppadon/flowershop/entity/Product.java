package com.noppadon.flowershop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	public int id;
	
	@Column(name="flowername")
	public String flowername;
	
	@Column(name="flowerdescription")
	public String flowerdescription;
	
	@Column(name="flowerprice")
	public double flowerprice;
	
	@Column(name="flowerimage")
	public String flowerimage;
	
	public Product() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFlowername() {
		return flowername;
	}

	public void setFlowername(String flowername) {
		this.flowername = flowername;
	}

	public String getFlowerdescription() {
		return flowerdescription;
	}

	public void setFlowerdescription(String flowerdescription) {
		this.flowerdescription = flowerdescription;
	}

	public double getFlowerprice() {
		return flowerprice;
	}

	public void setFlowerprice(double flowerprice) {
		this.flowerprice = flowerprice;
	}

	public String getFlowerimage() {
		return flowerimage;
	}

	public void setFlowerimage(String flowerimage) {
		this.flowerimage = flowerimage;
	}

	public Product(int id, String flowername, String flowerdescription, double flowerprice, String flowerimage) {
		super();
		this.id = id;
		this.flowername = flowername;
		this.flowerdescription = flowerdescription;
		this.flowerprice = flowerprice;
		this.flowerimage = flowerimage;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", flowername=" + flowername + ", flowerdescription=" + flowerdescription
				+ ", flowerprice=" + flowerprice + ", flowerimage=" + flowerimage + "]";
	}
	
	
}
