package classes;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ControlPanel {
    public ControlPanel() throws FileNotFoundException {
    }

    public void ContrplPanel() throws IOException {
        MyFile m;
        m = new MyFile();
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.print("What to do:");
            String comand=sc.nextLine();
            if (comand.equalsIgnoreCase("open")){
                System.out.println("Opening the file...");
                m.openMyFile();
            }
            else if (comand.equalsIgnoreCase("close")){
                System.out.println("file id closing");
                m.closeMyFile();
            }
            else if (comand.equalsIgnoreCase("save")){
                System.out.println("file is saved");
                m.saveMyFile();
            }
            else if (comand.equalsIgnoreCase("save as")){
                System.out.println("file is saved as...");
                m.saveMyFileAs();
            }
            else if (comand.equalsIgnoreCase("help")){
                System.out.println("Here are your opions:");
                System.out.println("Open- to open the file;");
                System.out.println("Close- to close the file;");
                System.out.println("Save- to save the file;");
                System.out.println("Save as- to save and change the name of the file;");
                System.out.println("Exit-to close the program.");


            }
            else if (comand.equalsIgnoreCase("exit")){
                System.out.println("bey");

            }
            else{
                System.out.println("do you need help");
                if (comand.equalsIgnoreCase("yes")){
                    System.out.println("Your options");
                }
                else if (comand.equalsIgnoreCase("no")){
                    System.out.println("K bey");
                    //  scKontrol.close();
                }
            }
        }

    }
    /**/
    public static void main(String[] args) throws IOException {
        ControlPanel k=new ControlPanel();
        k.ContrplPanel();
    }


}
