package com.day9.abstractClass;

public class MumbaiBranch extends Branch {

	MumbaiBranch() { // Constructor

	}

	@Override
	public boolean validatePhotoProof(String proof) {
		if (proof.equalsIgnoreCase("passport")) {
			return true;
		}
		return false;
	}

	@Override
	public boolean validateAddressProof(String proof) {
		if (proof.equalsIgnoreCase("electricity bill")) {
			return true;
		}
		return false;
	}

}
