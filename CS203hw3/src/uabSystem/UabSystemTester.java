package uabSystem;

import java.io.*;
import java.util.Scanner;

public class UabSystemTester {

    public static void main(String[] args) throws IOException {

        Controller.readFile();
        System.out.println("***************************************\n" +
                "Welcome to the UAB Employee Directory!!\n" +
                "***************************************\n");
        Scanner input = new Scanner(System.in);
        String prompt = "Please press the key that matches what you would like to do:\n" +
                "1 - Display Directory\n" +
                "2 - Add Employee\n" +
                "3 - Delete Employee\n" +
                "4 - Exit System\n" +
                "*********************";
        int choice = 0;
        while (choice != 4) {
            System.out.println(prompt);
            if (!input.hasNextInt()){
                break;
            }
            choice = input.nextInt();



            if (choice == 1){
                System.out.println("***************************************\n" +
                        "Total number of employees: " + Controller.getCounter() + "\n\n" +
                        "Faculty: " + Controller.getfCounter());
                for (Faculty faculty : Controller.getFaculties()){
                    if (faculty == null){
                        break;
                    } else{
                        System.out.println(faculty);
                    }
                }
                System.out.println("\n" + "Students: " + Controller.getsCounter());
                for (Student student : Controller.getStudents()){
                    if (student == null){
                        break;
                    } else{
                        System.out.println(student);
                    }
                }

                System.out.println("\n" + "Staff: " + Controller.gettCounter());
                for (Staff staff : Controller.getStaffs()){
                    if (staff == null){
                        break;
                    } else{
                        System.out.println(staff);
                    }
                }

                System.out.println("\n" + "Advisors: " + Controller.getaCounter());
                for (Advisor advisor : Controller.getAdvisors()){
                    if (advisor == null){
                        break;
                    } else{
                        System.out.println(advisor);
                    }
                }

                System.out.println("\n" + "IT Professionals: " + Controller.getiCounter());
                for (ITstaff iTstaff : Controller.getiTstaffs()){
                    if (iTstaff == null){
                        break;
                    } else{
                        System.out.println(iTstaff);
                    }
                }
                System.out.println("\n***************************************");


            } else if (choice == 2){
                System.out.println("Please enter first name: ");
                String first = input.next();
                System.out.println("Please enter last name: ");
                String last = input.next();
                System.out.println("Please enter blazerID: ");
                String blaze = input.next();
                System.out.println("*************************\n" +
                        "Employee Types:\n" +
                        "Faculty: F\n" +
                        "Student: S\n" +
                        "Staff: T\n" +
                        "Advisor: A\n" +
                        "IT Staff: I\n" +
                        "**********************************\n" +
                        "Please enter single digit code for employee type: ");
                String category = input.next().toUpperCase();
                //maybe split adding employees into separate methods so i do not call any print statements in my classes?
                //Controller.addEmployee(input, first, last, blaze, category);
                        if (category.equals("F")) {
                            System.out.println("Please enter department: ");
                            String department = input.next();
                            System.out.println("Please enter number of courses: ");
                            while (!input.hasNextInt()){
                                System.out.println("Please enter number of courses: ");
                                input.next();
                            }
                            int courses = input.nextInt();
                            Controller.addFaculty(first, last, blaze, department, courses);
                        } else if (category.equals("S")) {
                            System.out.println("Please enter student level: ");
                            String level = input.next();
                            System.out.println("Please enter student major: ");
                            String major = input.next();
                            System.out.println("Please enter student GPA");
                            while (!input.hasNextFloat()) {
                                System.out.println("Please enter student GPA");
                                input.next();
                            }
                            float gpa = input.nextFloat();
                            Controller.addStudent(first, last, blaze, level, major, gpa);
                        } else if (category.equals("T")){
                            System.out.println("Please enter role: ");
                            String role = input.next();
                            System.out.println("Please enter department: ");
                            String department = input.next();
                            Controller.addStaff(first, last, blaze, role, department);
                        } else if (category.equals("A")){
                            System.out.println("Please enter department: ");
                            String department = input.next();
                            System.out.println("Undergraduate or Graduate students?");
                            String clients = input.next();
                            Controller.addAdvisor(first, last, blaze, department, clients);
                        } else if (category.equals("I")){
                            System.out.println("Please enter role: ");
                            String role = input.next();
                            Controller.addITstaff(first, last, blaze, role);
                        } else {
                            System.out.println("Please retry using a valid employee type");
                        }
                System.out.println(first + " " + last + " has been added\n" +
                        "***********************************\n");


            } else if (choice == 3){
                System.out.println("*************************\n" +
                        "Employee Types:\n" +
                        "Faculty: F\n" +
                        "Student: S\n" +
                        "Staff: T\n" +
                        "Advisor: A\n" +
                        "IT Staff: I\n" +
                        "**********************************\n" +
                        "Please enter single digit code for employee type: ");
                String category = input.next().toUpperCase();
                System.out.println("Please enter employee BlazerID: ");
                String blaze = input.next();
                String employeeToRemove = Controller.deleteArray(category, blaze);
                Controller.deleteEmployee(employeeToRemove);
                System.out.println(employeeToRemove + " removed\n");


            }
        }

        input.close();


    }

}
