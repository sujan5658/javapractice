
package Day2;

public class Student {
    private int id;
    private String name;
    public Student(){
        this.id=0;
        this.name="";
    }
    public Student(int id,String name){
        this.id=id;
        this.name=name;
    }
    public Student(Student std){
        this.id = std.id;
        this.name = std.name;
    }
    //getter
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    
    //setter
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return(this.id+" "+this.name);
    }
}
