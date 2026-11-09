import javax.swing.JOptionPane;

/**
 This program demonstrates the Exam class,
 which extends the Assessment class.
 */
public class Runner {
    public static void main(String[] args) {
        try {
            String input = JOptionPane.showInputDialog("How many questions are on the exam?");
            if (input == null) {
                return;
            }
            int questions = Integer.parseInt(input);

            input = JOptionPane.showInputDialog("How many questions did the student miss?");
            if (input == null) {
                return;
            }
            int missed = Integer.parseInt(input);

            // Decimal division does not throw an exception for zero.
            if (questions == 0) {
                throw new ArithmeticException("The number of questions cannot be zero.");
            }

            Exam exam = new Exam(questions, missed);
            String message = "Each question counts " + exam.getPointsEach();
            message += " points.\nThe exam score is " + exam.getScore();
            message += "\nThe exam grade is " + exam.getGrade();
            JOptionPane.showMessageDialog(null, message);
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter whole numbers, such as 4, instead of words or decimals.");
        }
        catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        System.exit(0);
    }
}
