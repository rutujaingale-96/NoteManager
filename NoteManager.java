import java.io.*;
import java.util.*;

public class NoteManager{
    File f1=new File("Abc.txt");
    Scanner sc= new Scanner(System.in);
    
    public void run() {
        int x=0;
        while (x!=1) {
            System.out.println("Notes Manager");
            System.out.println("1. Add Note");
            System.out.println("2. View Notes");
            System.out.println("3. Exit");

            System.out.println("Enter your choice: ");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                  AddNote();
                  break;
                case 2:
                  ViewNote();
                  break;
                case 3:
                   System.out.println("Exiting...");
                   x=1;
                default:
                 System.out.println("wrong choice..");
            } 
        }
    }
    public void AddNote(){
        System.out.println("Enter your note:");
        String note=new String(sc.next());
        try{
        FileWriter fw=new FileWriter("Abc.txt");
        fw.write(note);
         System.out.println("Note Added Successfully....");
         fw.close();
        }catch(Exception e){
           System.out.println(e);
        }
    }
String str="welcome ro django";
    public void ViewNote(){
        
        try{
        FileReader fin=new FileReader("Abc.txt");
        int data;
        while((data=fin.read())!=-1){
            System.out.print((char)data);
        }
        System.out.println();
        
        }catch(Exception e){
           System.out.println(e);
        }
    }

   public static void main(String[] args) {
        NoteManager notesManager = new NoteManager();
        notesManager.run();
    }
}