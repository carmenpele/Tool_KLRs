import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class ToolV2 extends JFrame {

  private JPanel contentPane;
  private JTextField textField;
  private JTextField textField2;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {

          ToolV2 frame = new ToolV2();
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
  public ToolV2() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 800, 777);
    contentPane = new JPanel();
    contentPane.setBackground(new Color(0, 128, 128));
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);

    textField = new JTextField();
    textField.setBounds(41, 24, 700, 27);
    contentPane.add(textField);
    textField.setColumns(10);
    JTextPane textPane = new JTextPane();
    JTextPane textPane2 = new JTextPane();

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
    btnNewButton.setBounds(339, 322, 85, 21);
    contentPane.add(btnNewButton);

    JButton btnNewButton_1 = new JButton("HTST");
    textField2 = new JTextField();
    textField2.setColumns(10);
    textField2.setBounds(41, 375, 700, 27);
    btnNewButton_1.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        String textFromField=textField2.getText();
        if(textFromField.equals("")){
          textPane2.setText("EMPTY INPUT");
        }
        else{
          if(textFromField.substring(4, 8).equals("HTST")){
            textPane2.setText(Deserializer.deserializeHTST(textFromField));
          }
          else{
            textPane2.setText("WRONG INPUT");
          }
        }
      }
    });
    btnNewButton_1.setBounds(308, 670, 85, 21);
    contentPane.add(btnNewButton_1);


    JScrollPane scrollPane = new JScrollPane();
    scrollPane.setBounds(41, 75, 700, 237);
    contentPane.add(scrollPane);



    scrollPane.setViewportView(textPane);


    contentPane.add(textField2);

    JScrollPane scrollPane2 = new JScrollPane();
    scrollPane2.setBounds(41, 423, 700, 237);
    contentPane.add(scrollPane2);


    scrollPane2.setViewportView(textPane2);
  }
}
