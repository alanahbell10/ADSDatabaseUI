import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class StaffViewTests extends JFrame {
    private static final long serialVersionUID = 1L;
    private JLabel label;
    private JPanel contentPane;


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    StaffViewTests frame = new StaffViewTests();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public StaffViewTests() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBackground(Color.pink);
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel dateLabel = new JLabel("Test Date:");
        dateLabel.setForeground(Color.BLACK);
        dateLabel.setFont(new Font("Serif", Font.PLAIN, 25));
        dateLabel.setBounds(200, 50, 273, 93);
        contentPane.add(dateLabel);

        DateFormat dateformat = new SimpleDateFormat("MM/dd/yyyy");
        JFormattedTextField txtDate = new JFormattedTextField(dateformat);
        txtDate.setForeground(Color.BLACK);
        txtDate.setFont(new Font("Serif", Font.PLAIN, 25));
        txtDate.setBounds(400, 50, 273, 93);
        contentPane.add(txtDate);

    }

}