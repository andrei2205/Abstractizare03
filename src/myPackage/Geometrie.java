package myPackage;

import java.util.ArrayList;

public class Geometrie {
	{
	Dreptunghi dr1 = new Dreptunghi(10, 20);
	Triunghi tr1 = new Triunghi(25, 50);
	ArrayList<Forma> myArr = new ArrayList<>();
	}
	
	public void addElement(ArrayList<Forma> myArr, Forma object)
	{
		myArr.add(object);
	}
	
	void afisareElemente(ArrayList<Forma> myArr) {
		for (Forma forma : myArr) {
			System.out.println(forma);
		}
	}
}
