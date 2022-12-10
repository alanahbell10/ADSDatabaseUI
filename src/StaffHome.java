import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StaffHome extends JFrame {
    private static final long serialVersionUID = 1L;
    private JLabel label;
    private JPanel contentPane;


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    StaffHome frame = new StaffHome();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public StaffHome() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBackground(Color.pink);
        setContentPane(contentPane);
        contentPane.setLayout(null);


        JButton staffButton = new JButton("View Employees");
        staffButton.setFont(new Font("Serif", Font.PLAIN, 26));
        staffButton.setBounds(200, 250, 200, 75);
        staffButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        contentPane.add(staffButton);


        JButton testButton = new JButton("View Tests");
        testButton.setFont(new Font("Serif", Font.PLAIN, 26));
        testButton.setBounds(500, 250, 200, 75);
        testButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        contentPane.add(testButton);

    }

}
