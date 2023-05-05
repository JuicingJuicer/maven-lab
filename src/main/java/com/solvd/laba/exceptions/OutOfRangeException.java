package com.solvd.laba.exceptions;

public class OutOfRangeException extends RuntimeException {
	public OutOfRangeException(String message) {
		super(message);
	}

	public OutOfRangeException(Throwable cause) {
		super(cause);
	}
}
