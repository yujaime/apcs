public class LightBoardTest {
	public static void main(String[] args){
		System.out.println("The probability of part a) is not easily tested but will be explained later.");

        System.out.println();
        System.out.println("Testing Part b: ");

        LightBoard sim = new LightBoard(7, 5);
        boolean[][] arr = {{true,true,false,true,true},
                           {true,false,false,true,false},
                           {true,false,false,true,true},
                           {true,false,false,false,true},
                           {true,false,false,false,true},
                           {true,true,false,true,true},
                           {false,false,false,false,false}};
        sim.forceChange(arr);
        
        System.out.println();
		System.out.println("Testing 1: sim.evaluateLight(0,3)");
        boolean answer = sim.evaluateLight(0, 3);
		if(!answer){
			System.out.println("Pass");
		}else{
			System.out.println("Fail!");
            System.out.println("Correct answer: false");
            System.out.println("Your answer: " + answer);
		}
        
        System.out.println();
		System.out.println("Testing 2: sim.evaluateLight(6, 0)");
        answer = sim.evaluateLight(6, 0);
		if(answer){
			System.out.println("Pass");
		}else{
			System.out.println("Fail!");
            System.out.println("Correct answer: true");
            System.out.println("Your answer: " + answer);
		}

        System.out.println();
		System.out.println("Testing 3: sim.evaluateLight(4, 1)");
        answer = sim.evaluateLight(4, 1);
		if(!answer){
			System.out.println("Pass");
		}else{
			System.out.println("Fail!");
            System.out.println("Correct answer: false");
            System.out.println("Your answer: " + answer);
		}

        System.out.println();
		System.out.println("Testing 4: sim.evaluateLight(5, 4)");
        answer = sim.evaluateLight(5, 4);
		if(answer){
			System.out.println("Pass");
		}else{
			System.out.println("Fail!");
            System.out.println("Correct answer: true");
            System.out.println("Your answer: " + answer);
		}
	}
}



