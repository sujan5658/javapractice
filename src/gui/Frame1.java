
package gui;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Frame1 implements ActionListener{
    JFrame frame;
    JLabel lbl_no1,lbl_no2,lbl_result;
    JTextField txt_no1,txt_no2,txt_result;
    JButton btn_add,btn_close,btn_clear;
    JMenuBar menuBar;
    JMenu menu1;
    JMenuItem itemAdd,itemClose,itemClear;
    public Frame1(){
        frame = new JFrame();
        lbl_no1 = new JLabel();
        lbl_no2 = new JLabel();
        lbl_result = new JLabel();
        
        txt_no1 = new JTextField();
        txt_no2 = new JTextField();
        txt_result = new JTextField();
        
        menuBar = new JMenuBar();
        menu1 = new JMenu(" File ");
        itemAdd = new JMenuItem(" ADD "); 
        itemClose = new JMenuItem(" CLOSE ");
        itemClear = new JMenuItem(" CLEAR ");
        
        menu1.add(itemAdd);
        menu1.add(itemClear);
        menu1.add(itemClose);
        menuBar.add(menu1);
        
        itemAdd.addActionListener(this);
        itemClear.addActionListener(this);
        itemClose.addActionListener(this);
        
        lbl_no1.setText("First  No : ");
        lbl_no2.setText("Second No : ");
        lbl_result.setText("Result    : ");
        
        txt_no1.setColumns(15);
        txt_no2.setColumns(15);
        txt_result.setColumns(15);
        
        btn_add = new JButton();
        btn_add.setText("   ADD   ");
        btn_add.addActionListener(this);
        
        btn_clear = new JButton();
        btn_clear.setText("  Clear  ");
        btn_clear.addActionListener(this);
        
        btn_close = new JButton();
        btn_close.setText("   Close   ");
        btn_close.addActionListener(this);
        
        frame.setLayout(new FlowLayout());
        frame.setSize(350,350);
        frame.setResizable(false);
        frame.setTitle("Adding Two Numbers");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add(menuBar);
        frame.add(lbl_no1);
        frame.add(txt_no1);
        frame.add(lbl_no2);
        frame.add(txt_no2);
        frame.add(btn_add);
        frame.add(lbl_result);
        frame.add(txt_result);
        frame.add(btn_clear);
        frame.add(btn_close);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource().equals(btn_add) || ae.getSource().equals(itemAdd)){
            double num1,num2,result;
            num1 = Double.parseDouble(txt_no1.getText());
            num2 = Double.parseDouble(txt_no2.getText());
            result = num1+num2;
            txt_result.setText(Double.toString(result));
        }
        else if(ae.getSource().equals(btn_clear) || ae.getSource().equals(itemClear)){
            txt_no1.setText("");
            txt_no2.setText("");
            txt_result.setText("");
        }
        else if(ae.getSource().equals(btn_close) || ae.getSource().equals(itemClose)){
            System.exit(0);
        }
    }
    public static void main(String[] args){
        new Frame1();
    }
}
