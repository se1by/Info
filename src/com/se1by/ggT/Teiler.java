package com.se1by.ggT;

public class Teiler {
	
	public int ggTAlgorithmus1(int a, int b)
	{
		int laufzahl = 0;
		boolean gefunden = false;
		
		if(a < b)
			laufzahl = a;
		else
			laufzahl = b;
		while(!gefunden)
			if(a % laufzahl == 0 && b % laufzahl == 0)
				gefunden = true;
			else
				laufzahl--;
		return laufzahl;
	}
	public int ggTAlgorithmus2(int a, int b)
	{
		while(a!=b)
			if(a<b)
				b = b - a;
			else
				a = a - b;
		return a;
	}
	public int ggTAlgorithmus3(int a, int b)
	{
		int rest = 0;
		
		while(a%b != 0){
			rest = a%b;
			a = b;
			b = rest;
		}
		return b;
	}
	public int ggTAlgorithmus4(int a, int b)
	{
		int rest = 0;
		
		if(a < b)
		{
			int i = a;
			a = b;
			b = i;
		}
		while(b > 0)
		{
			rest = a%b;
			a = b;
			b = rest;
		}
		return a;
	}

}
