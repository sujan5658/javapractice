package admin;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import admindatabase.AdminLogin;
public class AdminGui implements ActionListener {
    JFrame frame;
    JLabel lbl_message;
    JTextField txt_name,txt_pass;
    JButton btn_login,btn_close;
    public AdminGui(){
        lbl_message = new JLabel("");
        
        txt_name = new JTextField();
        txt_name.setColumns(15);
        txt_pass = new JTextField();
        txt_pass.setColumns(15);
        
        btn_login = new JButton(" Login ");
        btn_login.addActionListener(this);
        
        btn_close = new JButton(" Close ");
        btn_close.addActionListener(this);
        
        frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setBounds(570, 250, 200, 230);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Admin Login");
        
        frame.add(new JLabel("User name : "));
        frame.add(txt_name);
        frame.add(new JLabel("Password : "));
        frame.add(txt_pass);
        frame.add(btn_login);
        frame.add(btn_close);
        frame.add(lbl_message);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==btn_login){
            lbl_message.setText("Loggin in...!!!!");
            AdminInfo ai = new AdminInfo(txt_name.getText(),txt_pass.getText());
            Message msg = new AdminLogin(ai).validateAdmin();
            lbl_message.setText(msg.getMessage());
        }
        else if(ae.getSource()==btn_close){
            System.exit(0);
        }
    }
}
