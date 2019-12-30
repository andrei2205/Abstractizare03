package myPackage;

public class Dreptunghi extends Forma{
	private double latime;
	private double lungime;

	public double getLatime() {
		return latime;
	}
	public void setLatime(double latime) {
		this.latime = latime;
	}
	public double getLungime() {
		return lungime;
	}
	public void setLungime(double lungime) {
		this.lungime = lungime;
	}
	
	public Dreptunghi(double latime, double lungime) {
		super();
		this.latime = latime;
		this.lungime = lungime;
	}
	
	@Override
	public void setBase(String culoare1) {
		culoare = culoare1;
		
	}
	
	@Override
	public void afisareAll() {
		System.out.print("Lungime " + lungime + " | " + "latime:" +  latime + " | " + "culoare " + culoare );
		
	}
	@Override
	public void afisareArie() {
		System.out.println(" Aria dreptunghiului este: " + lungime * latime);
	}	
	
	@Override
	public String toString() {
		return culoare + " | " + lungime + " | "+ latime;
		
	}
}
