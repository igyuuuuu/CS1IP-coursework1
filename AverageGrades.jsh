public class AverageGrades {
    public static void main(String[] args) {
        int[][] grades = {{51, 83, 28}}};
        int[] weights = {30, 40, 30};
        int[] averages = average_grades(grades, weights);

        // Print the result
        for (int avg : averages) {
            System.out.println(avg);
        }
    }

    static int[] average_grades(int grades[][], int weights[]) {
        int numberOfStudents = grades.length;
        int[] averages = new int[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            int totalWeightedScore = 0;

            for (int j = 0; j < grades[i].length; j++) {
                totalWeightedScore += grades[i][j] * weights[j];
            }

            // Calculate the weighted average and round down
            averages[i] = totalWeightedScore / 100; // Integer division rounds down
        }

        return averages;
    }
}
