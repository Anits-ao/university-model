/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import College.College;
import CourseCatalog.Course;
import CourseCatalog.CourseCatalog;
import CourseSchedule.CourseLoad;
import CourseSchedule.CourseOffer;
import CourseSchedule.CourseSchedule;
import Department.Department;
import Persona.Person;
import Persona.PersonDirectory;
import Persona.StudentDirectory;
import Persona.StudentProfile;
import Persona.Faculty.FacultyDirectory;
import Persona.Faculty.FacultyProfile;
import Persona.Faculty.FacultyAssignment;

/**im
 *
 * @author kal bugrara
 */
public class UniversityExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        College college = new College("Northeastern University");
        Department department = new Department("Information Systems");
        Department dataArchitecture = new Department("Data Architecture and Management");
        Department softwareEngineering = new Department("Software Engineering Systems");

        college.addDepartment(department);
        college.addDepartment(dataArchitecture);
        college.addDepartment(softwareEngineering);
        
        CourseCatalog coursecatalog = department.getCourseCatalog();
        
        Course course = coursecatalog.newCourse("Application Engineering", "INFO5100", 4);
        Course course2 = coursecatalog.newCourse("Master's Project", "INFO7945", 4);
        Course course3 = coursecatalog.newCourse("Advanced Software Engineering", "INFO7410", 4);

        Course datacourse1 = dataArchitecture.newCourse("Data Management", "DAMG6210", 4);
        Course datacourse2 = dataArchitecture.newCourse("Data Engineering", "DAMG6105", 4);
        Course datacourse3 = dataArchitecture.newCourse("Master's Project", "DAMG7945", 4);

        Course softwarecourse1 = softwareEngineering.newCourse("Object Oriented Design", "CSYE6200", 4);
        Course softwarecourse2 = softwareEngineering.newCourse("Program Structures", "INFO6205", 4);
        Course softwarecourse3 = softwareEngineering.newCourse("Master's Project", "CSYE7945", 4);



        
        CourseSchedule courseschedule = department.newCourseSchedule("Spring2023");
        CourseOffer courseoffer = courseschedule.newCourseOffer("INFO5100");
        CourseOffer courseoffer2 = courseschedule.newCourseOffer("INFO7945");
        CourseOffer courseoffer3 = courseschedule.newCourseOffer("INFO7410");
        courseoffer.generatSeats(10);
        courseoffer2.generatSeats(10);
        courseoffer3.generatSeats(10);

        CourseSchedule dataArchitectureSchedule = dataArchitecture.newCourseSchedule("Spring2023");
        CourseOffer dataoffer = dataArchitectureSchedule.newCourseOffer("DAMG6210");
        CourseOffer dataoffer2 = dataArchitectureSchedule.newCourseOffer("DAMG6105");
        CourseOffer dataoffer3 = dataArchitectureSchedule.newCourseOffer("DAMG7945");
        dataoffer.generatSeats(10);
        dataoffer2.generatSeats(10);
        dataoffer3.generatSeats(10);

        CourseSchedule softwareEngineeringSchedule = softwareEngineering.newCourseSchedule("Spring2023");
        CourseOffer softwareoffer = softwareEngineeringSchedule.newCourseOffer("CSYE6200");
        CourseOffer softwareoffer2 = softwareEngineeringSchedule.newCourseOffer("INFO6205");
        CourseOffer softwareoffer3 = softwareEngineeringSchedule.newCourseOffer("CSYE7945");
        softwareoffer.generatSeats(10);
        softwareoffer2.generatSeats(10);
        softwareoffer3.generatSeats(10);

        PersonDirectory pd = department.getPersonDirectory();
        
        StudentDirectory sd = department.getStudentDirectory();
        Person studentPerson1 = pd.newPerson("STU001");
        StudentProfile student1 = sd.newStudentProfile(studentPerson1);
        Person studentPerson2 = pd.newPerson("STU002");
        StudentProfile student2 = sd.newStudentProfile(studentPerson2);
        Person studentPerson3 = pd.newPerson("STU003");
        StudentProfile student3 = sd.newStudentProfile(studentPerson3);
        Person studentPerson4 = pd.newPerson("STU004");
        StudentProfile student4 = sd.newStudentProfile(studentPerson4);
        Person studentPerson5 = pd.newPerson("STU005");
        StudentProfile student5 = sd.newStudentProfile(studentPerson5);
        Person studentPerson6 = pd.newPerson("STU006");
        StudentProfile student6 = sd.newStudentProfile(studentPerson6);
        Person studentPerson7 = pd.newPerson("STU007");
        StudentProfile student7 = sd.newStudentProfile(studentPerson7);
        Person studentPerson8 = pd.newPerson("STU008");
        StudentProfile student8 = sd.newStudentProfile(studentPerson8);
        Person studentPerson9 = pd.newPerson("STU009");
        StudentProfile student9 = sd.newStudentProfile(studentPerson9);
        Person studentPerson10 = pd.newPerson("STU010");
        StudentProfile student10 = sd.newStudentProfile(studentPerson10);

        student1.newCourseLoad("Spring2023");
        student2.newCourseLoad("Spring2023");
        student3.newCourseLoad("Spring2023");
        student4.newCourseLoad("Spring2023");
        student5.newCourseLoad("Spring2023");
        student6.newCourseLoad("Spring2023");
        student7.newCourseLoad("Spring2023");
        student8.newCourseLoad("Spring2023");
        student9.newCourseLoad("Spring2023");
        student10.newCourseLoad("Spring2023");

        department.RegisterForAClass("STU001", "INFO5100", "Spring2023");
        department.RegisterForAClass("STU001", "INFO7945", "Spring2023");
        department.RegisterForAClass("STU001", "INFO7410", "Spring2023");

        department.RegisterForAClass("STU002", "INFO5100", "Spring2023");
        department.RegisterForAClass("STU002", "INFO7945", "Spring2023");
        department.RegisterForAClass("STU002", "INFO7410", "Spring2023");

        department.RegisterForAClass("STU003", "INFO5100", "Spring2023");
        department.RegisterForAClass("STU003", "INFO7945", "Spring2023");
        department.RegisterForAClass("STU003", "INFO7410", "Spring2023");

        department.RegisterForAClass("STU004", "INFO5100", "Spring2023");
        department.RegisterForAClass("STU004", "INFO7945", "Spring2023");
        department.RegisterForAClass("STU004", "INFO7410", "Spring2023");

        department.RegisterForAClass("STU005", "INFO5100", "Spring2023");
        department.RegisterForAClass("STU005", "INFO7945", "Spring2023");
        department.RegisterForAClass("STU005", "INFO7410", "Spring2023");

        department.RegisterForAClass("STU006", "INFO5100", "Spring2023");
        department.RegisterForAClass("STU006", "INFO7945", "Spring2023");
        department.RegisterForAClass("STU006", "INFO7410", "Spring2023");

        department.RegisterForAClass("STU007", "INFO5100", "Spring2023");
        department.RegisterForAClass("STU007", "INFO7945", "Spring2023");
        department.RegisterForAClass("STU007", "INFO7410", "Spring2023");

        department.RegisterForAClass("STU008", "INFO5100", "Spring2023");
        department.RegisterForAClass("STU008", "INFO7945", "Spring2023");
        department.RegisterForAClass("STU008", "INFO7410", "Spring2023");

        department.RegisterForAClass("STU009", "INFO5100", "Spring2023");
        department.RegisterForAClass("STU009", "INFO7945", "Spring2023");
        department.RegisterForAClass("STU009", "INFO7410", "Spring2023");

        department.RegisterForAClass("STU010", "INFO5100", "Spring2023");
        department.RegisterForAClass("STU010", "INFO7945", "Spring2023");
        department.RegisterForAClass("STU010", "INFO7410", "Spring2023");


        StudentDirectory dataArchitectureStudents = dataArchitecture.getStudentDirectory();
        Person dataStudentPerson1 = pd.newPerson("STU011");
        StudentProfile dataStudent1 = dataArchitectureStudents.newStudentProfile(dataStudentPerson1);
        Person dataStudentPerson2 = pd.newPerson("STU012");
        StudentProfile dataStudent2 = dataArchitectureStudents.newStudentProfile(dataStudentPerson2);
        Person dataStudentPerson3 = pd.newPerson("STU013");
        StudentProfile dataStudent3 = dataArchitectureStudents.newStudentProfile(dataStudentPerson3);
        Person dataStudentPerson4 = pd.newPerson("STU014");
        StudentProfile dataStudent4 = dataArchitectureStudents.newStudentProfile(dataStudentPerson4);
        Person dataStudentPerson5 = pd.newPerson("STU015");
        StudentProfile dataStudent5 = dataArchitectureStudents.newStudentProfile(dataStudentPerson5);
        Person dataStudentPerson6 = pd.newPerson("STU016");
        StudentProfile dataStudent6 = dataArchitectureStudents.newStudentProfile(dataStudentPerson6);
        Person dataStudentPerson7 = pd.newPerson("STU017");
        StudentProfile dataStudent7 = dataArchitectureStudents.newStudentProfile(dataStudentPerson7);
        Person dataStudentPerson8 = pd.newPerson("STU018");
        StudentProfile dataStudent8 = dataArchitectureStudents.newStudentProfile(dataStudentPerson8);
        Person dataStudentPerson9 = pd.newPerson("STU019");
        StudentProfile dataStudent9 = dataArchitectureStudents.newStudentProfile(dataStudentPerson9);
        Person dataStudentPerson10 = pd.newPerson("STU020");
        StudentProfile dataStudent10 = dataArchitectureStudents.newStudentProfile(dataStudentPerson10);

        dataStudent1.newCourseLoad("Spring2023");
        dataStudent2.newCourseLoad("Spring2023");
        dataStudent3.newCourseLoad("Spring2023");
        dataStudent4.newCourseLoad("Spring2023");
        dataStudent5.newCourseLoad("Spring2023");
        dataStudent6.newCourseLoad("Spring2023");
        dataStudent7.newCourseLoad("Spring2023");
        dataStudent8.newCourseLoad("Spring2023");
        dataStudent9.newCourseLoad("Spring2023");
        dataStudent10.newCourseLoad("Spring2023");

        dataArchitecture.RegisterForAClass("STU011", "DAMG6210", "Spring2023");
        dataArchitecture.RegisterForAClass("STU011", "DAMG6105", "Spring2023");
        dataArchitecture.RegisterForAClass("STU011", "DAMG7945", "Spring2023");

        dataArchitecture.RegisterForAClass("STU012", "DAMG6210", "Spring2023");
        dataArchitecture.RegisterForAClass("STU012", "DAMG6105", "Spring2023");
        dataArchitecture.RegisterForAClass("STU012", "DAMG7945", "Spring2023");

        dataArchitecture.RegisterForAClass("STU013", "DAMG6210", "Spring2023");
        dataArchitecture.RegisterForAClass("STU013", "DAMG6105", "Spring2023");
        dataArchitecture.RegisterForAClass("STU013", "DAMG7945", "Spring2023");

        dataArchitecture.RegisterForAClass("STU014", "DAMG6210", "Spring2023");
        dataArchitecture.RegisterForAClass("STU014", "DAMG6105", "Spring2023");
        dataArchitecture.RegisterForAClass("STU014", "DAMG7945", "Spring2023");

        dataArchitecture.RegisterForAClass("STU015", "DAMG6210", "Spring2023");
        dataArchitecture.RegisterForAClass("STU015", "DAMG6105", "Spring2023");
        dataArchitecture.RegisterForAClass("STU015", "DAMG7945", "Spring2023");

        dataArchitecture.RegisterForAClass("STU016", "DAMG6210", "Spring2023");
        dataArchitecture.RegisterForAClass("STU016", "DAMG6105", "Spring2023");
        dataArchitecture.RegisterForAClass("STU016", "DAMG7945", "Spring2023");

        dataArchitecture.RegisterForAClass("STU017", "DAMG6210", "Spring2023");
        dataArchitecture.RegisterForAClass("STU017", "DAMG6105", "Spring2023");
        dataArchitecture.RegisterForAClass("STU017", "DAMG7945", "Spring2023");

        dataArchitecture.RegisterForAClass("STU018", "DAMG6210", "Spring2023");
        dataArchitecture.RegisterForAClass("STU018", "DAMG6105", "Spring2023");
        dataArchitecture.RegisterForAClass("STU018", "DAMG7945", "Spring2023");

        dataArchitecture.RegisterForAClass("STU019", "DAMG6210", "Spring2023");
        dataArchitecture.RegisterForAClass("STU019", "DAMG6105", "Spring2023");
        dataArchitecture.RegisterForAClass("STU019", "DAMG7945", "Spring2023");

        dataArchitecture.RegisterForAClass("STU020", "DAMG6210", "Spring2023");
        dataArchitecture.RegisterForAClass("STU020", "DAMG6105", "Spring2023");
        dataArchitecture.RegisterForAClass("STU020", "DAMG7945", "Spring2023");

        StudentDirectory softwareEngineeringStudents = softwareEngineering.getStudentDirectory();
        Person softwareStudentPerson1 = pd.newPerson("STU021");
        StudentProfile softwareStudent1 = softwareEngineeringStudents.newStudentProfile(softwareStudentPerson1);
        Person softwareStudentPerson2 = pd.newPerson("STU022");
        StudentProfile softwareStudent2 = softwareEngineeringStudents.newStudentProfile(softwareStudentPerson2);
        Person softwareStudentPerson3 = pd.newPerson("STU023");
        StudentProfile softwareStudent3 = softwareEngineeringStudents.newStudentProfile(softwareStudentPerson3);
        Person softwareStudentPerson4 = pd.newPerson("STU024");
        StudentProfile softwareStudent4 = softwareEngineeringStudents.newStudentProfile(softwareStudentPerson4);
        Person softwareStudentPerson5 = pd.newPerson("STU025");
        StudentProfile softwareStudent5 = softwareEngineeringStudents.newStudentProfile(softwareStudentPerson5);
        Person softwareStudentPerson6 = pd.newPerson("STU026");
        StudentProfile softwareStudent6 = softwareEngineeringStudents.newStudentProfile(softwareStudentPerson6);
        Person softwareStudentPerson7 = pd.newPerson("STU027");
        StudentProfile softwareStudent7 = softwareEngineeringStudents.newStudentProfile(softwareStudentPerson7);
        Person softwareStudentPerson8 = pd.newPerson("STU028");
        StudentProfile softwareStudent8 = softwareEngineeringStudents.newStudentProfile(softwareStudentPerson8);
        Person softwareStudentPerson9 = pd.newPerson("STU029");
        StudentProfile softwareStudent9 = softwareEngineeringStudents.newStudentProfile(softwareStudentPerson9);
        Person softwareStudentPerson10 = pd.newPerson("STU030");
        StudentProfile softwareStudent10 = softwareEngineeringStudents.newStudentProfile(softwareStudentPerson10);

        softwareStudent1.newCourseLoad("Spring2023");
        softwareStudent2.newCourseLoad("Spring2023");
        softwareStudent3.newCourseLoad("Spring2023");
        softwareStudent4.newCourseLoad("Spring2023");
        softwareStudent5.newCourseLoad("Spring2023");
        softwareStudent6.newCourseLoad("Spring2023");
        softwareStudent7.newCourseLoad("Spring2023");
        softwareStudent8.newCourseLoad("Spring2023");
        softwareStudent9.newCourseLoad("Spring2023");
        softwareStudent10.newCourseLoad("Spring2023");

        softwareEngineering.RegisterForAClass("STU021", "CSYE6200", "Spring2023");
        softwareEngineering.RegisterForAClass("STU021", "INFO6205", "Spring2023");
        softwareEngineering.RegisterForAClass("STU021", "CSYE7945", "Spring2023");

        softwareEngineering.RegisterForAClass("STU022", "CSYE6200", "Spring2023");
        softwareEngineering.RegisterForAClass("STU022", "INFO6205", "Spring2023");
        softwareEngineering.RegisterForAClass("STU022", "CSYE7945", "Spring2023");

        softwareEngineering.RegisterForAClass("STU023", "CSYE6200", "Spring2023");
        softwareEngineering.RegisterForAClass("STU023", "INFO6205", "Spring2023");
        softwareEngineering.RegisterForAClass("STU023", "CSYE7945", "Spring2023");

        softwareEngineering.RegisterForAClass("STU024", "CSYE6200", "Spring2023");
        softwareEngineering.RegisterForAClass("STU024", "INFO6205", "Spring2023");
        softwareEngineering.RegisterForAClass("STU024", "CSYE7945", "Spring2023");

        softwareEngineering.RegisterForAClass("STU025", "CSYE6200", "Spring2023");
        softwareEngineering.RegisterForAClass("STU025", "INFO6205", "Spring2023");
        softwareEngineering.RegisterForAClass("STU025", "CSYE7945", "Spring2023");

        softwareEngineering.RegisterForAClass("STU026", "CSYE6200", "Spring2023");
        softwareEngineering.RegisterForAClass("STU026", "INFO6205", "Spring2023");
        softwareEngineering.RegisterForAClass("STU026", "CSYE7945", "Spring2023");

        softwareEngineering.RegisterForAClass("STU027", "CSYE6200", "Spring2023");
        softwareEngineering.RegisterForAClass("STU027", "INFO6205", "Spring2023");
        softwareEngineering.RegisterForAClass("STU027", "CSYE7945", "Spring2023");

        softwareEngineering.RegisterForAClass("STU028", "CSYE6200", "Spring2023");
        softwareEngineering.RegisterForAClass("STU028", "INFO6205", "Spring2023");
        softwareEngineering.RegisterForAClass("STU028", "CSYE7945", "Spring2023");

        softwareEngineering.RegisterForAClass("STU029", "CSYE6200", "Spring2023");
        softwareEngineering.RegisterForAClass("STU029", "INFO6205", "Spring2023");
        softwareEngineering.RegisterForAClass("STU029", "CSYE7945", "Spring2023");

        softwareEngineering.RegisterForAClass("STU030", "CSYE6200", "Spring2023");
        softwareEngineering.RegisterForAClass("STU030", "INFO6205", "Spring2023");
        softwareEngineering.RegisterForAClass("STU030", "CSYE7945", "Spring2023");



        FacultyDirectory fd = department.getFacultyDirectory();
        Person facultyPerson = pd.newPerson("FAC001");
        Person facultyPerson2 = pd.newPerson("FAC002");
        Person facultyPerson3 = pd.newPerson("FAC003");
        Person facultyPerson4 = pd.newPerson("FAC004");
        Person facultyPerson5 = pd.newPerson("FAC005");
        Person facultyPerson6 = pd.newPerson("FAC006");
        Person facultyPerson7 = pd.newPerson("FAC007");
        Person facultyPerson8 = pd.newPerson("FAC008");
        Person facultyPerson9 = pd.newPerson("FAC009");

    

        FacultyProfile faculty = fd.newFacultyProfile(facultyPerson);
        FacultyProfile faculty2 = fd.newFacultyProfile(facultyPerson2);
        FacultyProfile faculty3 = fd.newFacultyProfile(facultyPerson3);
        FacultyProfile faculty4 = fd.newFacultyProfile(facultyPerson4);
        FacultyProfile faculty5 = fd.newFacultyProfile(facultyPerson5);
        FacultyProfile faculty6 = fd.newFacultyProfile(facultyPerson6);
        FacultyProfile faculty7 = fd.newFacultyProfile(facultyPerson7);
        FacultyProfile faculty8 = fd.newFacultyProfile(facultyPerson8);
        FacultyProfile faculty9 = fd.newFacultyProfile(facultyPerson9);



        FacultyAssignment assignment = faculty.AssignAsTeacher(courseoffer);
        FacultyAssignment assignment2 = faculty2.AssignAsTeacher(courseoffer2);
        FacultyAssignment assignment3 = faculty3.AssignAsTeacher(courseoffer3);
        FacultyAssignment assignment4 = faculty4.AssignAsTeacher(dataoffer);
        FacultyAssignment assignment5 = faculty5.AssignAsTeacher(dataoffer2);
        FacultyAssignment assignment6 = faculty6.AssignAsTeacher(dataoffer3);
        FacultyAssignment assignment7 = faculty7.AssignAsTeacher(softwareoffer);
        FacultyAssignment assignment8 = faculty8.AssignAsTeacher(softwareoffer2);
        FacultyAssignment assignment9 = faculty9.AssignAsTeacher(softwareoffer3);

    
        System.out.println("Information Systems Revenue: " + department.calculateRevenuesBySemester("Spring2023"));
        System.out.println("Data Architecture Revenue: " + dataArchitecture.calculateRevenuesBySemester("Spring2023"));
        System.out.println(
                "Software Engineering Revenue: " + softwareEngineering.calculateRevenuesBySemester("Spring2023"));
        System.out.println("College Total Revenue: " + college.calculateTotalRevenue("Spring2023"));


    }

}
