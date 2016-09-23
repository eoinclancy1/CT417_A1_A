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

    
}

