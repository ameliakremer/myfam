package FirstTry;


public class MyFam {

	public static void main(String[] args) {  
		String name1 = "Amelia";
		String name2 = "Annabelle";
		String name3 = "Addison";
		String name4 = "Amy";
		String name5 = "Adam";
		String[] famnames = new String[5];
		famnames[0] = name1;
		famnames[1] = name2;
		famnames[2] = name3;
		famnames[3] = name4;
		famnames[4] = name5;
		int[] famages = new int[5];
		famages[0] = 12;
		famages[1] = 19;
		famages[2] = 21;
		famages[3] = 46;
		famages[4] = 47;
		
		for(int i = 0; i<famnames.length; i++) { 
			System.out.println(famnames[i] + ": " + famages[i] + " ");
		}
		
	}

}
