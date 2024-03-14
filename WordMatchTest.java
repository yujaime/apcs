public class WordMatchTest {
	public static void main(String[] args){
		System.out.println("Testing Part a: ");

        System.out.println();
		System.out.println("Constructing object: WordMatch game = new WordMatch(\"mississippi\")");
        WordMatch game = new WordMatch("mississippi"); 
        
		System.out.println();
		System.out.print("Testing 1: game.scoreGuess(\"i\") ");
        int answer = game.scoreGuess("i");
		if(answer==4){
			System.out.println("Pass");
		}else{
			System.out.println("Fail!");
            System.out.println("Correct answer: 4");
            System.out.println("Your answer: " + answer);
		}
		
		System.out.print("Testing 2: game.scoreGuess(\"iss\") ");
        answer = game.scoreGuess("iss");
		if(answer==18){
			System.out.println("Pass");
		}else{
			System.out.println("Fail!");
            System.out.println("Correct answer: 18");
            System.out.println("Your answer: " + answer);
		}

		System.out.print("Testing 3: game.scoreGuess(\"issipp\") ");
        answer = game.scoreGuess("issipp");
		if(answer==36){
			System.out.println("Pass");
		}else{
			System.out.println("Fail!");
            System.out.println("Correct answer: 36");
            System.out.println("Your answer: " + answer);
		}

        System.out.println();
		System.out.println("Constructing object: WordMatch game = new WordMatch(\"aaaabb\");");
        game = new WordMatch("aaaabb"); 
        
		System.out.println();
		System.out.print("Testing 4: game.scoreGuess(\"a\") ");
        answer = game.scoreGuess("a");
		if(answer==4){
			System.out.println("Pass");
		}else{
			System.out.println("Fail!");
            System.out.println("Correct answer: 4");
            System.out.println("Your answer: " + answer);
		}
		
		System.out.print("Testing 5: game.scoreGuess(\"aa\") ");
        answer = game.scoreGuess("aa");
		if(answer==12){
			System.out.println("Pass");
		}else{
			System.out.println("Fail!");
            System.out.println("Correct answer: 12");
            System.out.println("Your answer: " + answer);
		}

		System.out.print("Testing 6: game.scoreGuess(\"aabb\") ");
        answer = game.scoreGuess("aabb");
		if(answer==16){
			System.out.println("Pass");
		}else{
			System.out.println("Fail!");
            System.out.println("Correct answer: 16");
            System.out.println("Your answer: " + answer);
		}

		System.out.println();
		System.out.println("#################################");
		System.out.print("Testing Part b: ");

        System.out.println();
        System.out.println("Constructing object: WordMatch game = new WordMatch(\"concatenation\");");
        game = new WordMatch("concatenation");  
        
		System.out.println();
		System.out.print("Testing 7: game.findBetterGuess(\"ten\" , \"nation\"); ");
        String sanswer = game.findBetterGuess("ten" , "nation");
		if(sanswer.equals("nation")){
			System.out.println("Pass");
		}else{
			System.out.println("Fail!");
            System.out.println("Correct answer: nation");
            System.out.println("Your answer: " + sanswer);
		}

        System.out.println();
		System.out.print("Testing 8: game.findBetterGuess(\"con\" , \"cat\"); ");
        sanswer = game.findBetterGuess("con" , "cat");
		if(sanswer.equals("con")){
			System.out.println("Pass");
		}else{
			System.out.println("Fail!");
            System.out.println("Correct answer: con");
            System.out.println("Your answer: " + sanswer);
		}
	}
}

