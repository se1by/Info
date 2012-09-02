package com.se1by.Liste;

public class Liste {
	public int[] zahl;
	public Liste(){
		zahl = new int[100];
		for(int i = 0; i < 100; i++){
			zahl[i] = i*i;
		}
	}
	
	public void verdoppeln(){
		for(int i = 0; i < 100; i++){
			zahl[i] = zahl[i]*2;
		}
	}
	
	public void multipliziereMitNachfolger(){
		for(int i = 0; i < 99; i++){
			zahl[i] += zahl[i+1];
		}
	}
	
	public void zeigeZahl(){
		for(int i : zahl){
			System.out.println(i);
		}
		System.out.println("\n\n\n");
	}
}
