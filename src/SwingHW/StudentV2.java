package SwingHW;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
public class StudentV2 extends Student implements ActionListener {
    private String grade;
    private String section;
    private float mark1,mark2;
    private float total,avg;
    private String result;
    private final int PM = 40;
    
    JLabel lbl_id,lbl_name,lbl_grade,lbl_section;
    JLabel lbl_mark1,lbl_mark2,lbl_total,lbl_avg,lbl_result;
    JTextField txt_id,txt_name,txt_grade,txt_section;
    JTextField txt_mark1,txt_mark2,txt_total,txt_avg,txt_result;
    JButton btn_save,btn_close,btn_calc;
    
    private void studentFrame(){
        lbl_id = new JLabel();
        lbl_name = new JLabel();
        lbl_section = new JLabel();
        lbl_grade = new JLabel();
        lbl_mark1 = new JLabel();
        lbl_mark2 = new JLabel();
        lbl_total = new JLabel();
        lbl_avg = new JLabel();
        lbl_result = new JLabel();
        
        txt_id = new JTextField();
        txt_name = new JTextField();
        txt_grade = new JTextField();
        txt_section = new JTextField();
        txt_mark1 = new JTextField();
        txt_mark2 = new JTextField();
        txt_total = new JTextField();
        txt_avg = new JTextField();
        txt_result = new JTextField();
        
        
        lbl_id.setText("Enter ID : ");
        lbl_name.setText("Enter Name : ");
        lbl_grade.setText("Enter Grade : ");
        lbl_section.setText("Enter Section : ");
        lbl_mark1.setText("Enter mark 1 st : ");
        lbl_mark2.setText("Enter mark 2 nd : ");
        lbl_total.setText("Total Mark : ");
        lbl_avg.setText("Average Mark : ");
        lbl_result.setText("Result : ");
        
        txt_id.setColumns(15);
        txt_name.setColumns(13);
        txt_grade.setColumns(13);
        txt_section.setColumns(12);
        txt_mark1.setColumns(12);
        txt_mark2.setColumns(11);
        txt_total.setColumns(10);
        txt_avg.setColumns(12);
        txt_result.setColumns(15);
        
        btn_calc = new JButton();
        btn_calc.setText("               Calculate            ");
        btn_calc.addActionListener(this);
        
        btn_save = new JButton();
        btn_save.setText(" Save ");
        btn_save.addActionListener(this);
        
        btn_close = new JButton();
        btn_close.setText(" Close ");
        btn_close.addActionListener(this);
        
        setLayout(new FlowLayout());
        setSize(300,500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(" Student Info ");
        add(lbl_id);
        add(txt_id);
        add(lbl_name);
        add(txt_name);
        add(lbl_grade);
        add(txt_grade);
        add(lbl_section);
        add(txt_section);
        add(lbl_mark1);
        add(txt_mark1);
        add(lbl_mark2);
        add(txt_mark2);
        add(btn_calc);
        add(lbl_total);
        add(txt_total);
        add(lbl_avg);
        add(txt_avg);
        add(lbl_result);
        add(txt_result);
        add(btn_save);
        add(btn_close);
        setVisible(true);
    }
    public StudentV2(){
        super();
        this.grade = "";
        this.section = "";
        this.mark1 =0;
        this.mark2 = 0;
        this.total = 0;
        this.avg = 0 ;
        this.studentFrame();
    }
    public StudentV2(int id,String name,String grade,String section,float mark1,float mark2){
        super(id,name);
        this.grade = grade;
        this.section = section;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.studentFrame();
    }
    public StudentV2(StudentV2 std){
        super.setId(std.getId());
        super.setName(std.getName());
        this.grade = std.grade;
        this.section = std.section;
        this.mark1 = std.mark1;
        this.mark2 = std.mark2;
        this.studentFrame();
    }
    @Override
    //getters
    
    public String toString(){
        return(super.toString()+" "+this.grade+" "+this.section+" "+this.mark1+" "+this.mark2+" "+this.total+" "+this.avg+" "+this.result);
    }
    @Override
    public int getId(){
        return super.getId();
    }
    @Override
    public String getName(){
        return super.getName();
    }
    public String getGrade() {
        return grade;
    }

    public String getSection() {
        return section;
    }

    public float getMark1() {
        return mark1;
    }

    public float getMark2() {
        return mark2;
    }

    public float getTotal() {
        return total;
    }

    public float getAvg() {
        return avg;
    }

    public String getResult() {
        return result;
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource().equals(btn_calc)){
            mark1 = Float.parseFloat(txt_mark1.getText());
            mark2 = Float.parseFloat(txt_mark2.getText());
            total = mark1+mark2;
            avg = total/2;
            txt_total.setText(Float.toString(total));
            txt_avg.setText(Float.toString(avg));
            if(mark1>PM && mark2>PM){
                result = "Passed";
            }
            else{
                result = "Failed";
            }
            txt_result.setText(result);
        }
        if(ae.getSource().equals(btn_close)){
            System.exit(0);
        }
    }
}
