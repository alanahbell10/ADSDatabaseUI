import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.text.DateFormatter;
import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class EmployeeView extends JFrame {

    private static final long serialVersionUID = 1L;
    private JTextField textField;
    private JPasswordField passwordField;
    private JButton btnNewButton;
    private JLabel label;
    private JTable table;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    EmployeeView frame = new EmployeeView();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public EmployeeView() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBackground(Color.pink);
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel mainLabel = new JLabel("ADS");
        mainLabel.setForeground(Color.BLACK);
        mainLabel.setFont(new Font("Serif", Font.PLAIN, 46));
        mainLabel.setBounds(400, 13, 273, 93);
        contentPane.add(mainLabel);


        JLabel searchCourseLabel = new JLabel("Search by course: ");
        searchCourseLabel.setForeground(Color.BLACK);
        searchCourseLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        searchCourseLabel.setBounds(100, 100, 200, 50);
        contentPane.add(searchCourseLabel);

        JTextField searchCourse = new JTextField();
        searchCourse.setForeground(Color.BLACK);
        searchCourse.setFont(new Font("Serif", Font.PLAIN, 20));
        searchCourse.setBounds(250, 100, 200, 50);
        contentPane.add(searchCourse);



        JLabel searchDateLabel = new JLabel("Search by date: ");
        searchDateLabel.setForeground(Color.BLACK);
        searchDateLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        searchDateLabel.setBounds(100, 150, 200, 50);
        contentPane.add(searchDateLabel);

        DateFormat  dateFormat = new SimpleDateFormat("mm/dd/yyyy");
        DateFormatter dateFormatter  = new DateFormatter(dateFormat);
        JTextField searchDate = new JFormattedTextField(dateFormatter);
        searchDate.setForeground(Color.BLACK);
        searchDate.setFont(new Font("Serif", Font.PLAIN, 20));
        searchDate.setBounds(250, 150, 200, 50);
        contentPane.add(searchDate);


        JLabel employeeLabel = new JLabel("List of Employees: ");
        employeeLabel.setForeground(Color.BLACK);
        employeeLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        employeeLabel.setBounds(650, 100, 200, 50);
        contentPane.add(employeeLabel);

        String[][] data = {
                { "001", "Wang", "Alanah Bell" },
                { "001", "Wang", "Michael Green" }
        };
        String[] columnNames = { "Test ID", "Prof Name", "Student Name" };
        table = new JTable(data, columnNames);
        table.setBounds(30, 40, 200, 300);



        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(table);
        contentPane.add(sp);



    }
}
