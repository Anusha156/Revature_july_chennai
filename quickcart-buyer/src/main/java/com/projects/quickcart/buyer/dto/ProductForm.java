package com.projects.quickcart.buyer.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductForm {
	private String title;
	private String description, category;
	private double price;
}
