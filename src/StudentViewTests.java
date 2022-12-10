import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class StudentViewTests extends JFrame {
    private static final long serialVersionUID = 1L;
    private JLabel label;
    private JPanel contentPane;


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    StudentViewTests frame = new StudentViewTests();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public StudentViewTests() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBackground(Color.pink);
        setContentPane(contentPane);
        contentPane.setLayout(null);


        JLabel futureLabel = new JLabel("Upcoming Tests: ");
        futureLabel.setForeground(Color.BLACK);
        futureLabel.setFont(new Font("Serif", Font.PLAIN, 25));
        futureLabel.setBounds(200, 50, 273, 93);
        contentPane.add(futureLabel);

        JLabel pastLabel = new JLabel("Past Tests: ");
        pastLabel.setForeground(Color.BLACK);
        pastLabel.setFont(new Font("Serif", Font.PLAIN, 25));
        pastLabel.setBounds(550, 50, 273, 93);
        contentPane.add(pastLabel);
    }

}
