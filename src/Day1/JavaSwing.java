package Day1;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JavaSwing implements ActionListener{
    JFrame frame;
    JLabel label1,label2,label3;
    JButton btn1,btn2;
    JTextField txt1,txt2,txt3;
    
    public JavaSwing(){
        frame = new JFrame();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        txt1 = new JTextField();
        txt2 = new JTextField();
        txt3 = new JTextField();
        
        frame.setSize(300,300);
        frame.setTitle("First Java Window");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        label1.setText("Enter number 1st : ");
        label2.setText("Enter number 2nd : ");
        label3.setText("The result is : ");
        txt1.setColumns(10);
        txt2.setColumns(10);
        txt3.setColumns(10);
        
        btn1 = new JButton();
        btn1.setText(" Add ");
        btn1.addActionListener(this);
        btn2 = new JButton();
        btn2.setText(" Close ");
        btn2.addActionListener(this);
        
        frame.setLayout(new FlowLayout());
        frame.add(label1);
        frame.add(txt1);
        frame.add(label2);
        frame.add(txt2);
        frame.add(btn1);
        frame.add(btn2);
        frame.add(label3);
        frame.add(txt3);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource().equals(btn1)){
            double num1,num2,sum;
            num1 = Double.parseDouble(txt1.getText());
            num2 = Double.parseDouble(txt2.getText());
            sum = num1+num2;
            txt3.setText(Double.toString(sum));
        }
        if(ae.getSource().equals(btn2)){
            System.exit(0);
        }
    }
}
