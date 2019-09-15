package com.day9.abstractClass;

public class DelhiBranch extends Branch {

	DelhiBranch() { // Constructor

	}
	
	public void greeting() {
		System.out.println("hello");
	}

	@Override
	public boolean validatePhotoProof(String proof) {
		if (proof.equalsIgnoreCase("pan card")) {
			return true;
		}
		return false;
	}

	@Override
	public boolean validateAddressProof(String proof) {
		if (proof.equalsIgnoreCase("ration Card")) {
			return true;
		}
		return false;
	}

}
