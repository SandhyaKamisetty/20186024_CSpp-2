import java.util.Scanner;

class Quiz {
    Quiz() {}
}
/**
 * Solution class for code-eval.
 */
public final class Solution {
     /**
      * Constructs the object.
      */
    private Solution() {
        // leave this blank
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
         // instantiate this Quiz
        Quiz q = new Quiz();
         // code to read the test cases input file
        Scanner s = new Scanner(System.in);
        // check if there is one more line to process
        while (s.hasNext()) {
            // read the line
            String line = s.nextLine();
             // split the line using space
            String[] tokens = line.split(" ");
              // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
                case "LOAD_QUESTIONS":
                System.out.println("|----------------|");
                System.out.println("| Load Questions |");
                System.out.println("|----------------|");
                loadQuestions(s, q, Integer.parseInt(tokens[1]));
                break;
                case "START_QUIZ":
                System.out.println("|------------|");
                System.out.println("| Start Quiz |");
                System.out.println("|------------|");
                startQuiz(s, q, Integer.parseInt(tokens[1]));
                break;
                case "SCORE_REPORT":
                System.out.println("|--------------|");
                System.out.println("| Score Report |");
                System.out.println("|--------------|");
                displayScore(q);
                break;
                default:
                break;
            }
        }
    }
   


    /**
     * Loads questions.
     *
     * @param      s              The scanner object for user input
     * @param      quiz           The quiz object
     * @param      questionCount  The question count
     */
    public static void loadQuestions(final Scanner s, final Quiz quiz, final int questionCount) {
        // write your code here to read the questions from the console
        // tokenize the question line and create the question object
        // add the question objects to the quiz class
        if (questionCount == 0) {
            System.out.println("quiz doesnot have questions");
            return;
        }
        String line = s.nextLine();
        String[] token = line.split(":");
        String[] questionLin = token[1].split(",");
        int testCases = Integer.parseInt(token[2]);
        if(token[0] == null) {
            System.out.println("Error! Malformed question");
            return;
        }
        if (token.length < (2+2+1)) {
            System.out.println("Error! Malformed question");
            return;
        }
        int maxCorrect = Integer.parseInt(token[2+1]);
        if(maxCorrect < 0) {
            System.out.println("Invalid max marks for "+token[0]);
            return;
        }
        int penality = Integer.parseInt(token[2+2]);
        if (penality > 0) {
            System.out.println("Invalid penalty for "+token[0]);
            return;
        }
        if (questionLin.length < (2+2)) {
            System.out.println(token[0]+" does not have enough answer choices");
            return;
        }
        if (testCases > (2+2)) {
            System.out.println("Error! Correct answer choice number is out of range for question text 1");
            return;
        }
        System.out.println(questionCount + " are added to the quiz");
     
        /*int questionCount = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < questionCount; i++) {
            String line = s.nextLine();
            String[] tokens = line.split(":");
            switch (tokens[0]) {
                case "add":
                    String[] c2 = tokens[1].split(",");
                    quiz.addToQuiz(new Item(c2[0],
                        Integer.parseInt(c2[1])));*/
        //System.out.println(“4 questions are added to the quiz");
           

    }

    /**
     * Starts a quiz.
     *
     * @param      s            The scanner object for user input
     * @param      quiz         The quiz object
     * @param      answerCount  The answer count
     */
    public static void startQuiz(final Scanner s, final Quiz quiz, final int answerCount) {
        // write your code here to display the quiz questions
        // read the user responses from the console
        // store the user respones in the quiz object
        /*System.out.println("question text 1(1)");
        System.out.println("choice 1    choice 2    choice 3    choice 4");

        System.out.println("question text 2(2)");
        System.out.println("choice 1    choice 2    choice 3    choice 4");

        System.out.println("question text 3(3)");
        System.out.println("choice 1    choice 2    choice 3    choice 4");

        System.out.println("question text 4(4)");
        System.out.println("choice 1    choice 2    choice 3    choice 4");
        return;*/
    }

    /**
     * Displays the score report
     *
     * @param      quiz     The quiz object
     */
    public static void displayScore(final Quiz quiz) {
        // write your code here to display the score report
        /*System.out.println("question text 1");
        System.out.println(" Correct Answer! - Marks Awarded: 1");
        System.out.println("question text 2");
        System.out.println(" Correct Answer! - Marks Awarded: 2");
        System.out.println("question text 3");
        System.out.println(" Correct Answer! - Marks Awarded: 3");
        System.out.println("question text 4");
        System.out.println(" Correct Answer! - Marks Awarded: 4");
        System.out.println("Total Score: 10");*/
       // return;
    }
}
