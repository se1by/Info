package com.se1by.Gerade;

public class Gerade {
	
	private double m,b;
	
	public Gerade(){
		m = 1;
		b = 0; // Nicht notwendig, aber der Uebersicht halber
	}
	public Gerade(double steigung, double yAbschnitt){
		m = steigung;
		b = yAbschnitt;
	}
	public Gerade(double steigung, double x, double y){
		m = steigung;
		b = y - (m*x);
	}
	public Gerade(double x1, double x2, double y1, double y2){
		m = (y2 - y1)/(x2 - x1);
		b = y1 - (m*x1);
	}
	public double steigung(){
		return m;
	}
	public double yAbschnitt(){
		return b;
	}
	public double nullstelle(){
		return -b/m;
	}
	public double funktionswert(double x){
		return m*x+b;
	}
	public void druckeFunktionsgleichung(){
		System.out.println("y = " + m + " * x + " + b);
	}
	public void druckeWerteTabelle(double start, double ende, int schrittweite){
		System.out.println("   y       x");
		for(double x = start; x <= ende;x += (double)schrittweite){
			double y = m*x+b;
			System.out.println("   " + y + "       " + x);
		}
	}
	public double orthogonaleSteigung(){
		return -1/m;
	}
	public Gerade orthogonaleGerade(double x, double y){
		double ortB = y/(orthogonaleSteigung()*x);
		Gerade g = new Gerade(orthogonaleSteigung(), ortB);
		return g;
	}
	public Gerade paralleleGerade(double x, double y){
		double parB = y/(m*x);
		Gerade g = new Gerade(m, parB);
		return g;
	}
}
