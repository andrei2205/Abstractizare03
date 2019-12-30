package myPackage;

public class Triunghi extends Forma{
	private double baza;
	private double inaltime;
	
	public double getBaza() {
		return baza;
	}
	public void setBaza(double baza) {
		this.baza = baza;
	}
	public double getInaltime() {
		return inaltime;
	}
	public void setInaltime(double inaltime) {
		this.inaltime = inaltime;
	}
	@Override
	public void afisareAll() {
		 System.out.print("Baza " + baza + " | " + "inaltime:" +  inaltime + " | " + "culoare " + culoare );
		
	}
	@Override
	public void setBase(String culoare1) {
		culoare = culoare1;
	}
	public Triunghi(double baza, double inaltime) {
		super();
		this.baza = baza;
		this.inaltime = inaltime;
	}
	@Override
	public void afisareArie() {
		System.out.println(" Aria triunghiului este: " + (baza * inaltime) / 2);
	}
	@Override
	public String toString() {
		return culoare + " | " + baza + " | "+ inaltime;
		
	}
	
}
