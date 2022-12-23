package com.csmtech;

public class CruiseShip extends Ship {
     private int npassengers;

	public CruiseShip(String sname, String syear, int npassengers) {
		super(sname, syear);
		this.npassengers = npassengers;
	}

	@Override
	public String toString() {
		return ("sname:"+sname+"npassengers"+npassengers);
	}

	
}
