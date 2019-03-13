package com.exceptions;

import java.io.File;

class NameNotFoundException extends Exception {

    public NameNotFoundException(String message) {
        super(message);
    }

}

public class CheckedException {
	
	public static void main(String[] args) throws NameNotFoundException {
		String name = "Thulasi";
		if(name.equals("Thulasi"))
		{
			throw new NameNotFoundException("Thulasi does not exist");
		}
	}
}
