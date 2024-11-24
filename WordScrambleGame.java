import java.util.Scanner;

public class WordScrambleGame {
    static String[] words = {"apple", "banana", "cherry", "date", "elephant", "giraffe", "hippopotamus", "iguana", "jaguar", "kiwi","lemon", "mango", "nectar", "orange", "papaya", "quince", "raspberry", "strawberry", "tangerine", "umbrella", "violet", "watermelon", "xenon", "yellow", "zebra", "acorn", "bear", "cat", "dog", "elephant", "fox", "grape", "hat", "ice", "jacket", "kite", "lemon", "mountain", "napkin", "octopus", "penguin", "queen", "rose", "sun", "tree", "umbrella", "vase", "whale", "xylophone", "yarn", "zoo", "arch", "bench", "cup",
"door", "edge", "fish", "garden", "hill", "island", "jungle", "key", "lake", "mirror", "night", "ocean", "piano", "quilt", "river", "star", "train", "under", "village", "walk", "xmas", "yellow", "zipper"};

        
public static void main(String[] args) {
    String[] scrambledWords = new String[words.length];
    for (int i = 0; i < words.length; i++) {
           scrambledWords[i] = scrambleWord(words[i]);
       }
        playGame(scrambledWords);
 }
 public static String scrambleWord(String word) {
     String[] letters = new String[word.length()-1]; // new String array that can hold every letter of word
     String[] scramble = new String[word.length()-1];
     for (int x = 0; x < word.length(); x++){
        letters[x] = word.substring(x,x+1);
     } // puts letters into array
     int n = letters.length; //get length of word
     boolean scrambled = false; //huh
     for (int a = 0; a < n; a++) {//for every letter in the word

        String b = letters[(int) Math.random() * letters.length];
        String done = new String[word.length()];
        while (letters[a] == b && ){
            b = letters[(int) Math.random() * letters.length];
        }
        //String b = letters[(int) Math.random() * letters.length];//hm
        //if (letters[a] == b) {
        //    b = letters[(int) Math.random() * letters.length];//um
        //} else {

        letters = letters[0,(int) Math.random() * letters.length] + letters[(int) Math.random() * letters.length+1];
        String[] newLetters = new String[letters.length-1];
        for(int x = 0; x < (int) Math.random() * letters.length; x++){
            newLetters[x] = letters[x];
        }
        for(int x = (int) Math.random() * letters.length+1; x < leters.length; x++){
            newLetters[x-1] = letters[x];
        }
        scramble[a] = b;//what
        }
    }
    String answer = "";
    for(String y : scramble){
        answer+=y;
    }
    return answer;
 }

 public static void playGame(String[] scrambledWords) {
    Scanner scanner = new Scanner(System.in);
    int score = 0;
    boolean playAgain = true;

    while (playAgain) {
         String word = scrambledWords[(int) Math.random() * 100 + 1];
          
        // Ask the user to guess the word
        System.out.println("Guess the original word for this scrambled word: " + scrambleWord(word));
        String userGuess = scanner.nextLine().trim();

        if (userGuess == word) {
            score += 1;
        }
          
        // Show the current score
        System.out.println("Your current score is: " + score);

        System.out.println("Would you like to play again? (y/n)");
        String response = scanner.nextLine().trim();
        if (response.equalsIgnoreCase("n")) {
              playAgain = false;
        }
      }

      // End the game and show final score
      System.out.println("Thanks for playing! Your final score is: " + score);
    }
}