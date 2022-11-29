package javaPrograms;

public class seriesPrinting {

	public static void main(String[] args) {
	
		// 00 01 02 03 04
		// 10 11 12 13 14
		
		for(int i = 0 ; i < 2 ; i++)
		{
			for(int j=0 ; j < 5 ; j++)
			{
				System.out.print(i + "" +j + "  ");
			}
			System.out.println();
		}

	}

}
