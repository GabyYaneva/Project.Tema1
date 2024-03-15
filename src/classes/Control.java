package classes;

import java.util.Scanner;

public class Control {
    //scanner
    public void controlOfFiles(){
        Scanner scFile=new Scanner(System.in);
        System.out.println("what to do:");
        String comand= scFile.nextLine();

        if (comand=="open"){
            //izwikwa komanda
        }
        if (comand=="close"){
            //izwikwa komanda
        }
        if (comand=="save"){
            //izwikwa komanda
        }
        if (comand=="save as"){
            //izwikwa komanda
        }
        if (comand=="help"){
            //izwikwa komanda
        }
        if (comand=="exit"){
            //izliza ot programata
        }
        else {
            System.out.println("Do you need help:");
            String yesno=scFile.nextLine();
            if (yesno=="yes"){
                //pokazwa opciite na potrebitelq
                //i izpiswa da napish jelata opciq


            }
         if (yesno=="no"){
               System.out.println("k,bye");
               //izliza ot programata

           }
        }
    }

    public static void main(String[] args) {
        Control g=new Control();
        g.controlOfFiles();
    }
}
