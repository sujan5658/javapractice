
package admindatabase;
import admin.AdminInfo;
import admin.Message;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
public class AdminLogin {
    AdminInfo adminInfo;

    public AdminLogin() {
        this.adminInfo = null;
    }
    public AdminLogin(AdminInfo adminInfo) {
        this.adminInfo = adminInfo;
    }
    public AdminLogin(AdminLogin al) {
        this.adminInfo = al.adminInfo;
    }

    public AdminInfo getAdminInfo() {
        return adminInfo;
    }

    public void setAdminInfo(AdminInfo adminInfo) {
        this.adminInfo = adminInfo;
    }
    public Message validateAdmin(){
        Message msg=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = new DBConnect().Connect();
            String sql = "SELECT * FROM tbl_login WHERE login_name=? AND login_password=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,this.adminInfo.getName());
            pst.setString(2,this.adminInfo.getPass());
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                msg = new Message("True");
                return msg;
            }
        } 
        catch (Exception ex) {
            msg = new Message("False");
        }
        msg = new Message("False");
        return msg;
    }
    @Override
    public String toString() {
        return "AdminLogin{" + "adminInfo=" + adminInfo + '}';
    }
    
}
