package SwingHW;
import javax.swing.JFrame;
public class Student extends JFrame {
    private int id;
    private String name;
    public Student(){
        this.id = 0;
    }
    public Student(int id,String name){
        this.id = id;
        this.name = name;
    }
    public Student(Student std){
        this.id = std.id;
        this.name = std.name;
    }
    //getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    //setters

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString(){
        return (this.id+" "+this.name);
    }
}
