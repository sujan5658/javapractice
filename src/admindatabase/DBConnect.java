package admindatabase;
import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnect {
    private Connection con;
    private String url = "jdbc:mysql://localhost/miniproject3";
    private String user = "sujan";
    private String pass = "Difficult@5658";
    public Connection Connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,user,pass);
        }
        catch(Exception er){
            System.out.println(er);
        }
        return con;
    }
    public void DBClose(Connection con){
        try{
            con.close();
        }
        catch(Exception er){
            System.out.println(er);
        }
    }
}
