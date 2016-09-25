/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student_reg_system;

import java.util.ArrayList;
import org.joda.time.LocalDate;
/** *
 * @author eoin
 */
public class CourseProgramme {
    
    private String CourseName;
    private ArrayList moduleList;
    private LocalDate startDate;
    private LocalDate endDate;

    public CourseProgramme(String courseName, ArrayList moduleList, LocalDate start, LocalDate end){
        this.CourseName = courseName;
        this.moduleList = moduleList;
        this.startDate = start;
        this.endDate = end;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }
    
    public ArrayList getModuleList() {
        return moduleList;
    }

    public void setModuleList(ArrayList moduleList) {
        this.moduleList = moduleList;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void printStudents(){
        ArrayList<Student> CourseStudents = new ArrayList<Student>();
        
        ArrayList<Module> modules = new ArrayList<Module>();
        modules = this.getModuleList();
        for (int i=0 ; i<modules.size()-1 ; i++){
            Module m = modules.get(i);
            ArrayList<Student> ModuleStudents = new ArrayList<Student>();
            ModuleStudents = m.getStudentList();
            for (int j=0 ; j<ModuleStudents.size()-1;j++){
                Student s = ModuleStudents.get(i);
                if (s.getCourse().equals(this.getCourseName()) && !(CourseStudents.contains(s))){
                    CourseStudents.add(s);
                    System.out.println(s.getName() + "\t " + s.getCourse());
                    System.out.print("Modules: ");
                    for(int k=0; k<modules.size()-1;k++){
                        System.out.print(modules.get(k));
                    }
                    System.out.println();
                }
            }
        }
    }
}

