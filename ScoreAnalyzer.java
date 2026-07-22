public class ScoreAnalyzer {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 99, 88, 73, 100};

        int highestScore = scores[0]; //Assume the first score is the highest to start
        int lowestScore = scores[0];
        double total = 0; //Use double so our average can have decimals

        System.out.print("--- Test Scores ---");

        for (int i = 0; i < scores.length; i++) {
            System.out.println("Student " + (i+1) + " scored: " + scores[i]);

            total = total + scores[i];

            if(scores[i] > highestScore) {
                highestScore = scores[i];
            }

            if(scores[i] < lowestScore) {
                lowestScore = scores[i];
            }

        }

        double average = total / scores.length;

        System.out.println("\n--- Final Analysis ---");
        System.out.println("Total Students: " + scores.length);
        System.out.println("Highest Score: " +highestScore);
        System.out.println("Lowest Score: " +lowestScore);
        System.out.println("Class Average: " +average);
    }
}
