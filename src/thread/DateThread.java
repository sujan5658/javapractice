
package thread;

import java.util.Date;
import java.text.SimpleDateFormat;
public class DateThread extends Thread {
    Date date;
    @Override
    public void run(){
        while(true){
            try{
                Date date = new Date();
                SimpleDateFormat hr = new SimpleDateFormat("h");
                SimpleDateFormat min = new SimpleDateFormat("m");
                SimpleDateFormat sec = new SimpleDateFormat("s");
                System.out.println(hr.format(date)+" : "+min.format(date)+" : "+sec.format(date));
                Thread.sleep(1000);
            }
            catch(Exception er){
                System.out.println(er);
            }
        }
    }
}
