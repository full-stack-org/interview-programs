package com.test.practice;

//final class can not be extended
final class SigletonXyz {

	private static final SigletonXyz instance = null;

	private SigletonXyz() {

		// To prevent the Reflection
		if (instance != null) {
			throw new RuntimeException("Instance already available");
		}

	}

	// To stop object deserilization
	protected Object readResolve() {
		return instance;
	}

	// TO Stop the cloning
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	// Making Thread safe
	public static synchronized SigletonXyz getInstance() {
		if (instance == null) {
			return new SigletonXyz();
		}
		return instance;
	}
}