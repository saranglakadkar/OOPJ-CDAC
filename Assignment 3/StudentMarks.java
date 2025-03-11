public class StudentMarks {
    public static void main(String[] args) {
        int marks[][] = {
            {85, 80, 90}, {70, 75, 72}, {35, 40, 38}, {90, 92, 88}, {45, 50, 48}, 
            {20, 30, 25}, {78, 80, 79}, {65, 60, 62}, {55, 50, 53}, {85, 86, 88},
            {95, 90, 93}, {30, 35, 33}, {25, 20, 22}, {80, 85, 82}, {75, 78, 79},
            {60, 62, 64}, {45, 40, 42}, {92, 90, 91}, {55, 57, 58}, {10, 15, 12}
        };

        int highScorers = 0, lowScorers = 0;

        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double percentage = (total / 3.0);

            if (percentage >= 75) highScorers++;
            if (percentage <= 40) lowScorers++;
        }

        System.out.println("Students with 75% and above: " + highScorers);
        System.out.println("Students with 40% and below: " + lowScorers);
    }
}
