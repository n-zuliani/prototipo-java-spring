package mypkg;

public class Test {
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public void getLength() {
		System.out.println("la length di " + message + " e' " + message.length());
	}
}