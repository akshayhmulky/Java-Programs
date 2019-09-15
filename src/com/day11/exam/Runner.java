package com.day11.exam;

public class Runner {

	public static void main(String[] args) {

		RoomDetails c1 = new RoomDetails("Hero", "Deluxe", 2, 5);
		System.out.println("BillId : " + c1.getBillId());
		System.out.println("Customer Name : " + c1.getCustomerName());
		System.out.println("No of Days of Stays : " + c1.getNoOfDaysOfStay());
		System.out.println("Total Bill : " + c1.calculateBill());

		System.out.println("-------------------------------------------------");

		RoomDetails c2 = new RoomDetails("Vampire", "Standard", -1, 17);
		System.out.println("BillId : " + c2.getBillId());
		System.out.println("Customer Name : " + c2.getCustomerName());
		System.out.println("No of Days of Stays : " + c2.getNoOfDaysOfStay());
		System.out.println("Total Bill : " + c2.calculateBill());

	}

}
