package Day2;
public class FinalStudent extends Student {
    String grade;
    String section;
    public FinalStudent(){
        super();  //Calls the default constructor of the class Student.
        this.grade = "";
        this.section = "";
    }
    public FinalStudent(int id,String name,String grade,String section){
        super(id,name); // Calls the parameterized constructor of the class Student.
        this.grade = grade;
        this.section = section;
    }
    public FinalStudent(FinalStudent fs){
        super.setId(fs.getId());
        super.setName(fs.getName());
        this.grade = fs.getGrade();
        this.section = fs.getSection();
    }
    //getters
    @Override
    public int getId(){
        return super.getId();
    }
    public String getName(){
        return super.getName();
    }
    public String getGrade(){
        return this.grade;
    }
    public String getSection(){
        return this.section;
    }
    //Setters
    public void setId(int id){
        super.setId(id);
    }
    public void setName(String name){
        super.setName(name);
    }
    public void setGrade(String grade){
        this.grade = grade;
    }
    public void setSection(String section){
        this.section = section;
    }
    public String toString(){
        return(super.toString()+" "+this.grade+" "+this.section);
    }
}
