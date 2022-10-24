import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
public class Tool extends JFrame {

  private JPanel contentPane;
  private JTextField textField;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {

          Tool frame = new Tool();
          frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the application.
   */
  public Tool() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 800, 550);
    contentPane = new JPanel();
    contentPane.setBackground(new Color(0, 128, 128));
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);

    textField = new JTextField();
    textField.setBounds(53, 47, 600, 27);
    contentPane.add(textField);
    textField.setColumns(10);
    JTextPane textPane = new JTextPane();

    JButton btnNewButton = new JButton("HOVI");
    btnNewButton.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        String textFromField=textField.getText();
        if(textFromField.equals("")){
          textPane.setText("EMPTY INPUT");
        }
        else{
          if(textFromField.substring(4, 8).equals("HOVI")){
            textPane.setText(Deserializer.deserializeHOVI(textFromField));
          }
          else{
            textPane.setText("WRONG INPUT");
          }
        }
      }
    });
    btnNewButton.setBounds(63, 84, 85, 21);
    contentPane.add(btnNewButton);

    JButton btnNewButton_1 = new JButton("HTST");
    btnNewButton_1.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        String textFromField=textField.getText();
        if(textFromField.equals("")){
          textPane.setText("EMPTY INPUT");
        }
        else{
          if(textFromField.substring(4, 8).equals("HTST")){
            textPane.setText(Deserializer.deserializeHTST(textFromField));
          }
          else{
            textPane.setText("WRONG INPUT");
          }
        }
      }
    });
    btnNewButton_1.setBounds(171, 84, 85, 21);
    contentPane.add(btnNewButton_1);

    JButton btnNewButton_2 = new JButton("HTVR");
    btnNewButton_2.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        textPane.setText("HTVR- "+textField.getText());
      }
    });
    btnNewButton_2.setBounds(290, 84, 85, 21);
    contentPane.add(btnNewButton_2);


    JScrollPane scrollPane = new JScrollPane();
    scrollPane.setBounds(53, 138, 700, 300);
    contentPane.add(scrollPane);



    scrollPane.setViewportView(textPane);
  }
}
