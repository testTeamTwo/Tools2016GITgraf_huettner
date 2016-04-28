
public class MyFirstProgram {
	public void thisIsANewMethod() {
		
	}


	public static void main(String[] args) {
		int numberOfOutputs;
		
		Out.print("Please enter the number of outputs: "); 
		numberOfOutputs = In.readInt(); 
		for (int i = 1; i <= numberOfOutputs; i++) {
			Out.print("Output number ");
			Out.print(i);
			Out.println(": Hello World!");
		}

	}

}
