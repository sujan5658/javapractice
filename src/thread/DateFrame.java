
package thread;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.util.Date;
import java.text.SimpleDateFormat;
public class DateFrame extends Thread {
    JFrame frame;
    JLabel lbl_hr;
    JLabel lbl_min;
    JLabel lbl_sec;
    SimpleDateFormat hr,min,sec;
    public DateFrame(){
        frame = new JFrame();
        lbl_hr = new JLabel();
        lbl_min = new JLabel();
        lbl_sec = new JLabel();
        
        frame.setLayout(new FlowLayout());
        frame.setSize(300,400);
        frame.setResizable(false);
        frame.setTitle("Current Date");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    @Override
    public void run(){
        while(true){
            Date date = new Date();
            hr = new SimpleDateFormat("h");
            min = new SimpleDateFormat("m");
            sec = new SimpleDateFormat("s");
            
            lbl_hr.setText(hr.format(date)+" : ");
            lbl_min.setText(min.format(date)+" : ");
            lbl_sec.setText(sec.format(date));
            
            frame.add(lbl_hr);
            frame.add(lbl_min);
            frame.add(lbl_sec);
            try{
                Thread.sleep(1000);
            }
            catch(Exception er){
                System.out.println(er);
            }
            frame.setVisible(true);
        }
    }
}
