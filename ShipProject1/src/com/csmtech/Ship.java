package com.csmtech;

public class Ship {
	protected String sname;
	private String syear;
	public Ship(String sname, String syear) {
		super();
		this.sname = sname;
		this.syear = syear;
	}
	@Override
	public String toString() {
		return "Ship [sname=" + sname + ", syear=" + syear + "]";
	}
    
}
