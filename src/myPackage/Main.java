package myPackage;

import java.util.ArrayList;

public class Main {
	public static void main(String [] args) {
		
		Dreptunghi dr1 = new Dreptunghi(10, 20);
		dr1.setBase("albastru");
		dr1.afisareAll();
		dr1.afisareArie();
		
		System.out.println();
		
		Triunghi tr1 = new Triunghi(25, 30);
		tr1.setBase("rosu");
		tr1.afisareAll();
		tr1.afisareArie();
		
		ArrayList<Forma> myArr = new ArrayList<>();
		
		Geometrie geom1 = new Geometrie();
		geom1.addElement(myArr, dr1);
		geom1.addElement(myArr, tr1);
		geom1.toString();
		geom1.afisareElemente(myArr);
		
	}
}
