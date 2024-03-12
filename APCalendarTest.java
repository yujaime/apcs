public class APCalendarTest {
	public static void main(String[] args){
		System.out.println("Testing Part a: ");

		System.out.println();
		System.out.println("Testing 1: from 1900 to 2204 ");
        int answer = APCalendar.numberOfLeapYears(1900,2204);
		if(answer==74){
			System.out.println("Pass");
		}else{
			System.out.println("Fail!");
            System.out.println("Correct answer: 74");
            System.out.println("Your answer: " + answer);
		}
		
		System.out.println();
		System.out.println("Testing 2: from 1900 to 2204 ");
        answer = APCalendar.numberOfLeapYears(2013,2137);
		if(answer==30){
			System.out.println("Pass");
		}else{
			System.out.println("Fail!");
            System.out.println("Correct answer: 30");
            System.out.println("Your answer: " + answer);
		}

		System.out.println();
		System.out.println("#################################");
		System.out.print("Testing Part b: ");

		System.out.println();
		System.out.println("Testing 3: 1/5/2019 ");
        answer = APCalendar.dayOfWeek(1,5,2019);
		if(answer==6){
			System.out.println("Pass");
		}else{
			System.out.println("Fail!");
            System.out.println("Correct answer: 6");
            System.out.println("Your answer: " + answer);
		}

        System.out.println();
		System.out.println("Testing 4: 3/2/2022 ");
        answer = APCalendar.dayOfWeek(3,2,2022);
		if(answer==3){
			System.out.println("Pass");
		}else{
			System.out.println("Fail!");
            System.out.println("Correct answer: 3");
            System.out.println("Your answer: " + answer);
		}

        System.out.println();
		System.out.println("Testing 5: 3/1/2020 ");
        answer = APCalendar.dayOfWeek(3,1,2020);
		if(answer==0){
			System.out.println("Pass");
		}else{
			System.out.println("Fail!");
            System.out.println("Correct answer: 0");
            System.out.println("Your answer: " + answer);
		}

        System.out.println();
		System.out.println("Testing 6: 3/5/2100 ");
        answer = APCalendar.dayOfWeek(3,5,2100);
		if(answer==5){
			System.out.println("Pass");
		}else{
			System.out.println("Fail!");
            System.out.println("Correct answer: 5");
            System.out.println("Your answer: " + answer);
		}
	}
}


