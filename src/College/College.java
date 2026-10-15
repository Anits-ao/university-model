/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package College;

import Department.Department;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class College {
    ArrayList<Department> departments;

    public College(String name) {
        departments = new ArrayList();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }
    
    public int calculateTotalRevenue(String semester) {
        int total = 0;
        for (Department departments : departments) {
            total = total + departments.calculateRevenuesBySemester(semester);
        }

        return total;
    }
}


