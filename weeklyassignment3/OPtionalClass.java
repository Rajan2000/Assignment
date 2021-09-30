package com.assessment;

import java.util.Optional;

public class OPtionalClass {
	public static void main(String[] args) {
		
		String names[] = new String[10];
		Optional<String> optional = Optional.ofNullable(names[9]);
		if(optional.isPresent()) {
			System.out.print(names[0].length( ));
		}
		else {
			System.out.println("Item is not present");
		}
	}

}