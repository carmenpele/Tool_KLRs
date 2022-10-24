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
public class ToolV3 extends JFrame {

  private JPanel contentPane;
  private JTextField textField;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {

          ToolV3 frame = new ToolV3();
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
  public ToolV3() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 988, 777);
    contentPane = new JPanel();
    contentPane.setBackground(new Color(0, 128, 128));
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);

    textField = new JTextField();
    textField.setBounds(41, 57, 861, 27);
    contentPane.add(textField);
    textField.setColumns(10);
    JTextPane textPane = new JTextPane();

    JButton btn1 = new JButton("HOVI");
    btn1.addMouseListener(new MouseAdapter() {
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
    btn1.setBounds(196, 148, 85, 21);
    contentPane.add(btn1);

    JButton btn2 = new JButton("HTST");
    btn2.addMouseListener(new MouseAdapter() {
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
    btn2.setBounds(301, 148, 85, 21);
    contentPane.add(btn2);


    JScrollPane scrollPane = new JScrollPane();
    scrollPane.setBounds(41, 333, 861, 321);
    contentPane.add(scrollPane);



    scrollPane.setViewportView(textPane);

    JButton btn3 = new JButton("HTVH");
    btn3.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        String textFromField=textField.getText();
        if(textFromField.equals("")){
          textPane.setText("EMPTY INPUT");
        }
        else{
          if(textFromField.substring(4, 8).equals("HTVH")){
            textPane.setText(Deserializer.deserializeHTVH(textFromField));
          }
          else{
            textPane.setText("WRONG INPUT");
          }
        }
      }
    });
    btn3.setBounds(408, 148, 85, 21);
    contentPane.add(btn3);

    JButton btn4 = new JButton("HTBR");
    btn4.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        String textFromField=textField.getText();
        if(textFromField.equals("")){
          textPane.setText("EMPTY INPUT");
        }
        else{
          if(textFromField.substring(4, 8).equals("HTBR")){
            textPane.setText(Deserializer.deserializeHTBR(textFromField));
          }
          else{
            textPane.setText("WRONG INPUT");
          }
        }
      }
    });
    btn4.setBounds(513, 148, 85, 21);
    contentPane.add(btn4);

    JButton btn5 = new JButton("HTRX");
    btn5.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        String textFromField=textField.getText();
        if(textFromField.equals("")){
          textPane.setText("EMPTY INPUT");
        }
        else{
          if(textFromField.substring(4, 8).equals("HTRX")){
            textPane.setText(Deserializer.deserializeHTRX(textFromField));
          }
          else{
            textPane.setText("WRONG INPUT");
          }
        }
      }
    });
    btn5.setBounds(628, 148, 85, 21);
    contentPane.add(btn5);

    JButton btn6 = new JButton("HTRI");
    btn6.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        String textFromField=textField.getText();
        if(textFromField.equals("")){
          textPane.setText("EMPTY INPUT");
        }
        else{
          if(textFromField.substring(4, 8).equals("HTRI")){
            textPane.setText(Deserializer.deserializeHTRI(textFromField));
          }
          else{
            textPane.setText("WRONG INPUT");
          }
        }
      }
    });
    btn6.setBounds(196, 189, 85, 21);
    contentPane.add(btn6);

    JButton btn7 = new JButton("HTMQ");
    btn7.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        String textFromField=textField.getText();
        if(textFromField.equals("")){
          textPane.setText("EMPTY INPUT");
        }
        else{
          if(textFromField.substring(4, 8).equals("HTMQ")){
            textPane.setText(Deserializer.deserializeHTMQ(textFromField));
          }
          else{
            textPane.setText("WRONG INPUT");
          }
        }
      }
    });
    btn7.setBounds(301, 189, 85, 21);
    contentPane.add(btn7);

    JButton btn8 = new JButton("HTTR");
    btn8.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        String textFromField=textField.getText();
        if(textFromField.equals("")){
          textPane.setText("EMPTY INPUT");
        }
        else{
          if(textFromField.substring(4, 8).equals("HTTR")){
            textPane.setText(Deserializer.deserializeHTTR(textFromField));
          }
          else{
            textPane.setText("WRONG INPUT");
          }
        }
      }
    });
    btn8.setBounds(408, 189, 85, 21);
    contentPane.add(btn8);

    JButton btn9 = new JButton("HTVR");
    btn9.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        String textFromField=textField.getText();
        if(textFromField.equals("")){
          textPane.setText("EMPTY INPUT");
        }
        else{
          if(textFromField.substring(4, 8).equals("HTVR")){
            textPane.setText(Deserializer.deserializeHTVR(textFromField));
          }
          else{
            textPane.setText("WRONG INPUT");
          }
        }
      }
    });
    btn9.setBounds(513, 189, 85, 21);
    contentPane.add(btn9);

    JButton btn10 = new JButton("HTCP");
    btn10.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        String textFromField=textField.getText();
        if(textFromField.equals("")){
          textPane.setText("EMPTY INPUT");
        }
        else{
          if(textFromField.substring(4, 8).equals("HTCP")){
            textPane.setText(Deserializer.deserializeHTCP(textFromField));
          }
          else{
            textPane.setText("WRONG INPUT");
          }
        }
      }
    });
    btn10.setBounds(628, 189, 85, 21);
    contentPane.add(btn10);

    JButton btn11 = new JButton("HTVS");
    btn11.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        String textFromField=textField.getText();
        if(textFromField.equals("")){
          textPane.setText("EMPTY INPUT");
        }
        else{
          if(textFromField.substring(4, 8).equals("HTVS")){
            textPane.setText(Deserializer.deserializeHTVS(textFromField));
          }
          else{
            textPane.setText("WRONG INPUT");
          }
        }

      }
    });
    btn11.setBounds(196, 235, 85, 21);
    contentPane.add(btn11);

    JButton btn12 = new JButton("12");
    btn12.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        textPane.setText("12 - "+textField.getText());

      }
    });
    btn12.setBounds(301, 235, 85, 21);
    contentPane.add(btn12);

    JButton btn13 = new JButton("13");
    btn13.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        textPane.setText("13 - "+textField.getText());
      }
    });
    btn13.setBounds(408, 235, 85, 21);
    contentPane.add(btn13);

    JButton btn14 = new JButton("14");
    btn14.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        textPane.setText("14 - "+textField.getText());
      }
    });
    btn14.setBounds(513, 235, 85, 21);
    contentPane.add(btn14);

    JButton btn15 = new JButton("15");
    btn15.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        textPane.setText("15 - "+textField.getText());
      }
    });
    btn15.setBounds(628, 235, 85, 21);
    contentPane.add(btn15);
  }
}
