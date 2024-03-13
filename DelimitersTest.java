import java.util.ArrayList;

public class DelimitersTest
{
    public static void main(String[] args)
    {
        System.out.println("Testing Part a: ");
    
        System.out.println();
        System.out.print("Testing 1: ");
        Delimiters d = new Delimiters("(",")");
        ArrayList<String> answer = d.getDelimitersList(new String[]{"(","x + y",")"," * 5"});
        if(answer.size()==2 && answer.get(0).equals("(") && answer.get(1).equals(")")){
            System.out.println("Pass");
        }else{
            System.out.println("Fail!");
            System.out.println("Your answer: " + answer);
        }
    
        System.out.println();
        System.out.print("Testing 2: ");
        d = new Delimiters("<q>","</q>");
        answer = d.getDelimitersList(new String[]{"<q>","yy","</q>"," zz","</q>"});
        if(answer.size()==3 && answer.get(0).equals("<q>") && answer.get(1).equals("</q>") && answer.get(2).equals("</q>")){
            System.out.println("Pass");
        }else{
            System.out.println("Fail!");
            System.out.println("Your answer: " + answer);
        }
    
        System.out.println();
        System.out.println("#################################");
        System.out.print("Testing Part b: ");
    
        System.out.println();
        System.out.print("Testing 3:");
        d = new Delimiters("<sup>","</sup>");
        ArrayList<String> answerList = new ArrayList<String>();
        answerList.add("<sup>");
        answerList.add("<sup>");
        answerList.add("</sup>");
        answerList.add("<sup>");
        answerList.add("</sup>");
        answerList.add("</sup>");
    
        if(d.isBalanced(answerList)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail!");
            System.out.println("Your answer: " + answer);
        }
    
        System.out.println();
        System.out.print("Testing 4:");
        answerList.clear();
        answerList.add("<sup>");
        answerList.add("</sup>");
        answerList.add("</sup>");
        answerList.add("<sup>");
    
        if(!d.isBalanced(answerList)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail!");
            System.out.println("Your answer: " + answer);
        }
    
        System.out.println();
        System.out.print("Testing 5:");
        answerList.clear();
        answerList.add("</sup>");
        if(!d.isBalanced(answerList)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail!");
            System.out.println("Your answer: " + answer);
        }
    
        System.out.println();
        System.out.print("Testing 6:");
        answerList.clear();
        answerList.add("<sup>");
        answerList.add("<sup>");
        answerList.add("</sup>");
    
        if(!d.isBalanced(answerList)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail!");
            System.out.println("Your answer: " + answer);
        }
    
        System.out.println();
        System.out.print("Testing 7:");
        answerList.clear();
        answerList.add("<sup>");
        answerList.add("<sup>");
        answerList.add("</sup>");
        answerList.add("<sup>");
        answerList.add("</sup>");
        answerList.add("</sup>");
    
        if(d.isBalanced(answerList)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail!");
            System.out.println("Your answer: " + answer);
        }
    
        System.out.println();
        System.out.println("End of test");
    }
}

