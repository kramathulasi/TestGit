package com.collections;

public class CustomSingleTon {
	
	//This solution is thread safe and does not require any synchronization.
	//This approach is more efficient for other approaches
	/** private constructor to prevent others from instantiating this class */
    private CustomSingleTon() {}

    /** This inner class is loaded only after getInstance() is called for the first time. */
    private static class SingletonHelper {
        private static final CustomSingleTon INSTANCE = new CustomSingleTon();
    }

    public static CustomSingleTon getInstance() {
        return SingletonHelper.INSTANCE;
    }
}

