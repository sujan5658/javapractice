
package admin;
public class AdminInfo {
    private String name;
    private String pass;
    
    public AdminInfo() {
        this.name = "";
        this.pass = "";
    }
    public AdminInfo(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }
    public AdminInfo(AdminInfo ai) {
        this.name = ai.name;
        this.pass = ai.pass;
    }

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "AdminInfo{" + "name=" + name + ", pass=" + pass + '}';
    }
    
}
