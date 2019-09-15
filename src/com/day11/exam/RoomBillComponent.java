package com.day11.exam;

public interface RoomBillComponent {

	double TAX = 12;
	double EXTRA_PERSON_CHARGE = 500.00;
	double FOOD_CHARGE = 800.00;

	float calculateBill();
}
