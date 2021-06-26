package ex42;

import java.util.ArrayList;

public class Chart {
    private ArrayList <String> inputStrings;
    private String[] employees;

    public Chart(ArrayList<String> inputStrings) {
        this.inputStrings = inputStrings;
    }

    public ArrayList<String> getInputStrings() {
        return inputStrings;
    }

    public String[] getEmployees() {
        return employees;
    }

    public void setEmployees(String[] employees) {
        this.employees = employees;
    }

    public String[] split_string(ArrayList StringList){
        //split strings
        String str = StringList.toString();
        return str.split("[\\[,\\s\\]]",0);
    }

    public int parse_salary(String str){
        //parse salary to int
        return Integer.parseInt(str);
    }
}
