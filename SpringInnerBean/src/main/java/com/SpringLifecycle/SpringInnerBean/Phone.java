package com.SpringLifecycle.SpringInnerBean;

public class Phone {

	private int pno;

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}
	
	public void phoneMethod() {
		
		System.out.println("Calling number :" +pno);
	}
	
}
