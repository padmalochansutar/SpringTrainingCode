package com.csmtech;

public class CargoShip extends Ship {
    private int tonnage;

	public CargoShip(String sname, String syear, int tonnage) {
		super(sname, syear);
		this.tonnage = tonnage;
	}

	@Override
	public String toString() {
		return  ("sname:"+sname+"cargocapacity:"+tonnage);
	}
    
}
