package ex42;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        App myApp = new App();
        Chart myChart = myApp.createInstance();

        //separate and parse
        myChart.setEmployees(myChart.split_string(myChart.getInputStrings()));
        myApp.print_the_chart(myChart.getEmployees(),myChart);

    }
    public Chart createInstance(){
        ArrayList<String> temp = new ArrayList<String>();//create temp instance
        get_data(temp);//get input from file using get_data method
        Chart myChart = new Chart(temp);
        return myChart;
    }
    public void get_data(ArrayList <String> employeeSalary) {

        //handle exceptions through try catch method
        try (Scanner input = new Scanner(Paths.get("C:\\\\Development\\\\COP3330\\\\MotivatedPractice\\\\Shannon-cop3330-assignment3\\\\src\\\\main\\\\java\\\\ex42\\\\exercise42_input.txt"))) {
            while (input.hasNext()) {
                employeeSalary.add(input.next());
            }
        } catch (Exception e) {
            System.out.println("Cannot input data from this file...");
        }
    }

    public void print_the_chart(String[] arr, Chart myChart) {
        System.out.printf("%-10s%-10s%-6s\n--------------------------\n", "Last", "First", "Salary");
        for (int i = 1; i < (arr.length); i += 4) {
            System.out.printf("%-10s%-10s%-6d\n", arr[i], arr[i + 1], myChart.parse_salary(arr[i + 2]));
        }
    }
}
