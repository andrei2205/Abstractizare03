package myPackage;

public abstract class Forma {
	protected static String culoare;
	public String getCuloare() {
		return culoare;
	}
	public void setCuloare(String culoare) {
		this.culoare = culoare;
	}
	
	public abstract void afisareAll();
	public abstract void setBase(String culoare1);
	public abstract void afisareArie();
	public abstract String toString();
	
}
