
public class MyFirstProgram {
	public void thisIsANewMethod() {
		int newInt=Integer.MIN_VALUE;
		System.out.println("I am a new Method and I'll bring you TROUBLES!");
		//bugfix
	}


	public static void main(String[] args) {
		int numberOfOutputs;
		
		Out.print("Please enter the number of outputs: "); 
		numberOfOutputs = In.readInt(); 
		for (int i = 1; i <= numberOfOutputs; i++) {
			Out.print("Output number ");
			Out.print(i);
			Out.println(": Hello World!"); //Kommentar
			
		}

	}

}
