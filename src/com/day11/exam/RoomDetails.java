package com.day11.exam;

public class RoomDetails implements RoomBillComponent {

	private int billId;
	private String customerName;
	private String typeOfRoom;
	private int noOfExtraPersons;
	private int noOfDaysOfStay;
	public static int counter = 100;

	// Constructor to generate automated BillId
	public RoomDetails(String customerName, String typeOfRoom, int noOfExtraPersons, int noOfDaysOfStay) {
		counter++;
		this.billId = counter;
		this.customerName = customerName;
		this.typeOfRoom = typeOfRoom;
		this.noOfExtraPersons = noOfExtraPersons;
		this.noOfDaysOfStay = noOfDaysOfStay;
	}

	public int getBillId() {
		return billId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getTypeOfRoom() {
		return typeOfRoom;
	}

	public int getNoOfExtraPersons() {
		return noOfExtraPersons;
	}

	public int getNoOfDaysOfStay() {
		return noOfDaysOfStay;
	}

	public boolean validateNoOfExtraPerson() {
		if (noOfExtraPersons >= 0 && noOfExtraPersons <= 2)
			return true;
		else
			return false;

	}

	public boolean validateTypeOfRoom() {
		if (typeOfRoom.equals("Standard") || typeOfRoom.equals("Deluxe") || typeOfRoom.equals("Cottage"))
			return true;
		else
			return false;

	}

	public boolean validateNoOfDaysOfStay() {
		if (noOfDaysOfStay >= 1 && noOfDaysOfStay <= 15)
			return true;
		else
			return false;
	}

	@Override
	public float calculateBill() {

		float totalBill = 0;
		float baseRoomFare = 0;
		if (validateNoOfExtraPerson() && validateTypeOfRoom() && validateNoOfDaysOfStay()) {
			if (typeOfRoom.equals("Standard")) {
				baseRoomFare = 2500;
			} else if (typeOfRoom.equals("Deluxe")) {
				baseRoomFare = 3500;
			} else if (typeOfRoom.equals("Cottage")) {
				baseRoomFare = 5500;
			}

			totalBill = (float) ((noOfDaysOfStay * baseRoomFare) + (noOfDaysOfStay * (FOOD_CHARGE))
					+ (EXTRA_PERSON_CHARGE * noOfExtraPersons));
			totalBill = (float) (totalBill + ((TAX) / 100) * totalBill);
			return (float) totalBill;

		} else {
			System.out.println("Invalid request");
			return 0;
		}
	}
}
