
package Day2;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class JavaSwing extends JFrame implements ActionListener{
    JLabel lbl_1,lbl_2,lbl_3;
    JTextField txt_1,txt_2,txt_3;
    JButton btn_add,btn_close;
    public JavaSwing(){
        lbl_1 = new JLabel();
        lbl_2 = new JLabel();
        lbl_3 = new JLabel();
        
        txt_1 = new JTextField();
        txt_2 = new JTextField();
        txt_3 = new JTextField();
        
        btn_add = new JButton();
        btn_close = new JButton();
        
        lbl_1.setText("Enter First Number : ");
        lbl_2.setText("Enter Second Number : ");
        lbl_3.setText("Result : ");
        
        txt_1.setColumns(5);
        txt_2.setColumns(5);
        txt_3.setColumns(5);
        
        btn_add.setText(" ADD ");
        btn_add.addActionListener(this);
        btn_close.setText(" Close ");
        btn_close.addActionListener(this);
        
        setSize(250,250);
        setTitle("Java Addition ");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new FlowLayout());
        add(lbl_1);
        add(txt_1);
        add(lbl_2);
        add(txt_2);
        add(btn_add);
        add(btn_close);
        add(lbl_3);
        add(txt_3);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource().equals(btn_add)){
            double num1,num2,sum;
            num1 = Double.parseDouble(txt_1.getText());
            num2 = Double.parseDouble(txt_2.getText());
            sum = num1+num2;
            txt_3.setText(Double.toString(sum));
        }
        if(ae.getSource().equals(btn_close)){
            System.exit(0);
        }
    }
}
