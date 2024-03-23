package classes;

import interfaceve.DealWithTheFile;

import java.io.*;
import java.util.Scanner;

public class MyFile  implements DealWithTheFile {
    File fileName = new File("C:\\\\Users\\\\USER\\\\IdeaProjects\\\\a3.f22621642.tema1\\\\test.txt");

    @Override
    public void openMyFile() throws IOException {
        Scanner scfile = new Scanner(fileName);
        System.out.println("Here is my file:");
        while (scfile.hasNextLine()) {
            String t = scfile.nextLine();
            System.out.println(t);
        }
        scfile.close();
    }

    @Override
    public void closeMyFile() throws IOException {

    }

    @Override
    public void saveMyFile() throws IOException {

    }

    @Override
    public void saveMyFileAs( ) throws IOException {

    }

    @Override
    public void getLinesTable() throws IOException {
        Scanner scanner=new Scanner(System.in);
        String l=scanner.nextLine();

        BufferedReader read=new BufferedReader(new FileReader(fileName));
        String text="";
        String coma="";
        while ((text=read.readLine()) !=null){
            coma+=text+"\r\n";

            read.close();
            l = text.replaceAll(",", "|" + scanner);
            FileWriter writer=new FileWriter("C:\\\\Users\\\\USER\\\\IdeaProjects\\\\a3.f22621642.tema1\\\\test.txt");
            writer.write(coma);
            writer.close();
        }
    }
}
