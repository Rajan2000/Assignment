package com.userInterface;


import java.util.ArrayList;
import java.util.List;

import com.ecommerce.services.CustomerServices;
import com.ecommerce.services.ProductServices;

public class ManageRecords {

	public static void main(String args[]) {
		
		/*-----------------------------------------Product Crud Operation-----------------------------------------------*/
		ProductServices productServices=new ProductServices();
		
		Integer product1=productServices.addProduct("Clothes", "Medium size", "t-Shirt", 550, 4);
		
		List<Integer> listProduct=new ArrayList<>();
		listProduct.add(product1);
		if(listProduct.size()!=0) {
			System.out.println("Record is inserted");
		}
		else
		{
			System.out.println("Record is not inserted");
		}
		
		/*List of product records in databse*/
		try {
			productServices.listOfAllProducts();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
		/*Update product records in database*/
		try {
		productServices.updateProductDetails(3, 600);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		/* delete product records in database by id */
		try {
			productServices.deleteProductById(2);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		/*------------------------------------------End of product crud operation-------------------------------------*/
		
		/*------------------------------------------Customer crud operation-------------------------------------------*/
		CustomerServices customerServices=new CustomerServices();
		
		Integer customer1=customerServices.addCustomer("Rajan", "lahoti", "836382638");
		Integer customer2=customerServices.addCustomer("Sid", "gaba", "90762537");
		List<Integer> listOfCustomer=new ArrayList<>();
		listOfCustomer.add(customer1);
		listOfCustomer.add(customer2);
		if(listOfCustomer.size()!=0) {
			System.out.println("Record is inserted ");
		}
		else {
			System.out.println("Record is not inserted ");
		}
		
		/*List of all customer*/
		try {
			customerServices.listOfAllCustomers();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		/*Update customer record in database*/
		try {
			customerServices.updateCustomerDetails(3, "5082");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		/*Delete customer record in database by id*/
		try {
			customerServices.deleteCustomerById(7);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		/*------------------------------------------End of crud operation---------------------------------------------*/
	}
}