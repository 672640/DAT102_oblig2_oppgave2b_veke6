package Opg2;

import java.util.Random;
import Opg2.SorteringTabell;

public class SorteringMain {

	public static void main(String[] args) {
			Random tilfeldig = new Random();
			int n = 128000;
			int antal = 10;
			
			Integer[][] a = new Integer[antal][n];
			
			// set inn tilfeldige heiltal i alle rekker
			for (int i = 0; i < antal; i++){
				for (int j = 0; j < n; j++){
					a[i][j] = 0; //tilfeldig.nextInt() for opg a
				}
			}
			
			long startTime = System.nanoTime();
			// start tidsmåling
			for (int i = 0; i < antal; i++){
				
				SorteringTabell.flettesortering(a[i]); // a[i] blir ein eindimensjonal tabell
				System.out.println(i);
			}
			// slutt tidsmåling
			long sluttTime = System.nanoTime();
			
			System.out.println((sluttTime - startTime) / 1000000);
		}

}

