/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student_reg_system;
import java.util.ArrayList;
/**
 *
 * @author eoin
 */
public class Module {
    private String Name;
    private String ID;
    private ArrayList StudentList;

public Module(String name, String id, ArrayList students){
    this.Name = name;
    this.ID = id;
    this.StudentList = students;
}

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public ArrayList getStudentList() {
        return StudentList;
    }

    public void setStudentList(ArrayList StudentList) {
        this.StudentList = StudentList;
    }

    public void addToStudentList(Student s){
        this.StudentList.add(s);
    }


}
