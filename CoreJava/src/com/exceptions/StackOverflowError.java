package com.exceptions;

public class StackOverflowError {

	public static void main(String[] args) {
            int i = RecursiveMethod();
        }
        private static int RecursiveMethod()
        {
            return RecursiveMethod();
        }
}
