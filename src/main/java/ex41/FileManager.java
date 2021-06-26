package ex41;

import java.util.ArrayList;
import java.util.Collections;

public class FileManager {
    private ArrayList<String> names = new ArrayList<String>();

    //setting
    public void setNames(ArrayList<String> names) {
        this.names = names;
    }

    public ArrayList<String> sort_list(){
        Collections.sort(names);
        return names;
    }

    public int get_list_size(){
        int size = names.size();
        return size;
    }
}


