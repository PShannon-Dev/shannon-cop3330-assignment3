package ex41;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FileManagerTest {

    @Test
    void get_list_size() {
        ArrayList <String> testArray = new ArrayList<>();
        FileManager myFileManager = new FileManager();
        for(int i = 0; i < 8; i ++){
            testArray.add("Str");
        }
        myFileManager.setNames(testArray);
        assertEquals(8,myFileManager.get_list_size());
    }

    @Test
    void empty_list_return_0(){
        ArrayList <String> testArray = new ArrayList<>();
        FileManager myFileManager = new FileManager();

        myFileManager.setNames(testArray);
        assertEquals(0,myFileManager.get_list_size());
    }

    @Test
    void sort_correctly(){
        ArrayList <String> testArray = new ArrayList<>();
        FileManager myFileManager = new FileManager();
        testArray.add("John");
        testArray.add("Avery");
        testArray.add("Edward");

        myFileManager.setNames(testArray);

        ArrayList <String> actual = new ArrayList<>();

        actual.add("Avery");
        actual.add("Edward");
        actual.add("John");

        assertEquals(actual,myFileManager.sort_list());
    }
}