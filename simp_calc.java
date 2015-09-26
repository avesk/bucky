import java.util.Scanner;

 class calc{

	public static void main(String[] args){

		

		System.out.println("ENTER A NUMBER");
		Scanner a = new Scanner(System.in);
		double num = a.nextDouble();
		System.out.println("ENTER AN OPERATOR");
		Scanner c = new Scanner(System.in);
		String l = c.nextLine();

		switch(l){

			case "+":
			
		/* //old code

			Scanner b = new Scanner(System.in);
			System.out.println("ENTER A SECOND NUMBER");
			double num2 = b.nextDouble();


												*/
			numgetter vals = new numgetter();

			vals.aux(args);								
			double sum = num + num2;
			System.out.println("= " + sum);
			break;

			




		}

		
	}
}

