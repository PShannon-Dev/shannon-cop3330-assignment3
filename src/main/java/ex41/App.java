package ex41;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        App myApp = new App();
        FileManager myFile = new FileManager();
        File outputFile = new File("exercise41_output.txt");

        //call method to get names from input file
        myFile.setNames(myApp.get_input());
        //output sorted list to file
        myFile.sort_list();

        //write to file
        myApp.write_to_file(myFile, outputFile);
    }
    public ArrayList<String> get_input(){
        //create temp names arrayList to read from the file
        ArrayList<String> names = new ArrayList<String>();

        try(Scanner input = new Scanner(Paths.get("C:\\\\Development\\\\COP3330\\\\MotivatedPractice\\\\Shannon-cop3330-assignment3\\\\src\\\\main\\\\java\\\\ex41\\\\exercise41_input.txt"))) {

            //read from file
            while (input.hasNext()) {

                //add each name to array list
                String temp = input.nextLine();
                names.add(temp);
            }

            //return the arrayList
            return names;
        }
        catch (Exception e)
        {
            System.out.printf("The directory is invalid...");
            return null;
        }
    }

    public void write_to_file(FileManager instance, File outputFile){
        int size = instance.get_list_size();
        ArrayList <String> list = instance.sort_list();

        //write to file
        try(Formatter write = new Formatter(outputFile)){

            //print the first two lines that are constant and only printed once
            write.format("Total of %d names\n-----------------\n",instance.get_list_size());

            for(int i = 0; i < instance.get_list_size(); i ++){
                write.format("%s\n",list.get(i));
        }
        write.close();}
        catch(Exception e){
            System.out.println("Unable to write to file.");
        }
    }

}
