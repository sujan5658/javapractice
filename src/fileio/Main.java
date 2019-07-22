
package fileio;
import java.io.File;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        /*File file = new File("/home/koju/javaFile/Folder1");
        boolean res = file.mkdir();
        if(res){
            System.out.println("Folder created.");
        }
        else{
            System.out.println("Failed to Create Folder.");
        }*/
        
        
//        File file1 = new File("/home/koju/javaFile/Folder1/info.txt");
//        if(file1.exists()==true){
//            System.out.println("The file exist.");
//        }
//        else{
//            file1.createNewFile();
//            System.out.println("File created.");
//        }
        File file = new File("/home/koju");
        String files[] = file.list();
        System.out.println(files.length);
        for(int i=0;i<files.length;i++){
            String str="";
            File f = new File("/home/koju/"+files[i]);
            if(f.isDirectory()){
                str="<dir>";
            }
            System.out.println(files[i]+" \t\t "+str);
        }
    }  
}
