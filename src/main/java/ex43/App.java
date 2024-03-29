package ex43;

import java.util.Scanner;

/*
Programming languages can create files and folders too.

Create a program that generates a website skeleton with the following specifications:

Prompt for the name of the site.
Prompt for the author of the site.
Ask if the user wants a folder for JavaScript files.
Ask if the user wants a folder for CSS files.
Generate an index.html file that contains the name of the site inside the <title> tag and the author in a <meta> tag.
Example Output
Site name: awesomeco
Author: Max Power
Do you want a folder for JavaScript? y
Do you want a folder for CSS? y
Created ./website/awesomeco
Created ./website/awesomeco/index.html
Created ./website/awesomeco/js/
Created ./website/awesomeco/css/
The user should then find these files and directories created in the working directory of your program.
 */
public class App {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        App myApp = new App();

        //prompt for input
        String site = myApp.input("Site name: ");
        String author = myApp.input("Author: ");
        String jsFolder = myApp.input("Do you want a folder for JavaScript? ");
        String cssFolder = myApp.input("Do you want a folder for CSS? ");
    }

    public String input(String prompt){
        System.out.print(prompt);
        return in.nextLine();
    }

    public void output(){
        System.out.println();
    }
}
