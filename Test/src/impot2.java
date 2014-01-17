import java.io.IOException;

import impot.Impot;


public class impot2 {

	public static void main(String[] args)
	{
		Impot i = Impot.createImpot2013(); 
		System.out.println(i.montantImpotAvecAbattements(100000, 2));
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
