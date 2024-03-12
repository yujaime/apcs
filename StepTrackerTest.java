public class StepTrackerTest {
	public static void main(String[] args){
		StepTracker tr = new StepTracker(10000);

		System.out.println("Start Testing");

		System.out.println();
		System.out.print("Testing tr.activeDays(): ");
        int answer = tr.activeDays() ;
		if(answer==0){
			System.out.println("Pass");
		}else{
			System.out.println("Fail!");
            System.out.println("Correct answer: 0");
            System.out.println("Your answer: " + answer);
		}
		
		System.out.println();
		System.out.print("Testing tr.averageSteps(): ");
        double danswer = tr.averageSteps();
		if(danswer==0){
			System.out.println("Pass");
		}else{
			System.out.println("Fail!");
            System.out.println("Correct answer: 0.0");
            System.out.println("Your answer: " + danswer);
		}

		tr.addDailySteps(9000);
		tr.addDailySteps(5000);

		System.out.println();
		System.out.print("Testing tr.activeDays(): ");
        answer = tr.activeDays() ;
		if(answer==0){
			System.out.println("Pass");
		}else{
			System.out.println("Fail!");
            System.out.println("Correct answer: 0");
            System.out.println("Your answer: " + answer);
		}
		
		System.out.println();
		System.out.print("Testing tr.averageSteps(): ");
        danswer = tr.averageSteps();
		if(danswer==7000){
			System.out.println("Pass");
		}else{
			System.out.println("Fail!");
            System.out.println("Correct answer: 7000.0");
            System.out.println("Your answer: " + danswer);
		}

		tr.addDailySteps(13000);

		System.out.println();
		System.out.print("Testing tr.activeDays(): ");
        answer = tr.activeDays() ;
		if(answer==1){
			System.out.println("Pass");
		}else{
			System.out.println("Fail!");
            System.out.println("Correct answer: 1");
            System.out.println("Your answer: " + answer);
		}
		
		System.out.println();
		System.out.print("Testing tr.averageSteps(): ");
        danswer = tr.averageSteps();
		if(danswer==9000){
			System.out.println("Pass");
		}else{
			System.out.println("Fail!");
            System.out.println("Correct answer: 9000.0");
            System.out.println("Your answer: " + danswer);
		}

		tr.addDailySteps(23000);
		tr.addDailySteps(1111);

		System.out.println();
		System.out.print("Testing tr.activeDays(): ");
        answer = tr.activeDays() ;
		if(answer==2){
			System.out.println("Pass");
		}else{
			System.out.println("Fail!");
            System.out.println("Correct answer: 2");
            System.out.println("Your answer: " + answer);
		}
		
		System.out.println();
		System.out.print("Testing tr.averageSteps(): ");
        danswer = tr.averageSteps();
		if(danswer==10222.2){
			System.out.println("Pass");
		}else{
			System.out.println("Fail!");
            System.out.println("Correct answer: 10222.2");
            System.out.println("Your answer: " + danswer);
		}

	}
}
