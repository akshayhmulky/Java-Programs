package com.day9.abstractClass;

public abstract class Branch {

	Branch() { // constructor

	}

	public abstract boolean validatePhotoProof(String proof);

	public abstract boolean validateAddressProof(String proof);

	public void openAccount(String photoProof, String addressProof, int amount) {
		if (amount > 1000) {
			if (validateAddressProof(addressProof) && validatePhotoProof(photoProof)) {
				System.out.println("Account is created");
			} else {
				System.out.println("Account is not created");
			}
		} else {

			System.out.println("Account cannot be created");
		}
	}

}
