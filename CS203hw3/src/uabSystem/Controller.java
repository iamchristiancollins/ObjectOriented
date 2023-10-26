package uabSystem;


import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;

public class Controller {

    private static int counter = 0;
    private static Faculty[] faculties = new Faculty[20];
    private static int fCounter = 0;
    private static Staff[] staffs = new Staff[20];
    private static int tCounter = 0;
    private static Student[] students = new Student[20];
    private static int sCounter = 0;
    private static Advisor[] advisors = new Advisor[20];
    private static int aCounter = 0;
    private static ITstaff[] iTstaffs = new ITstaff[20];
    private static int iCounter = 0;


    public static int getCounter() {
        return counter;
    }

    public static Faculty[] getFaculties() {
        return faculties;
    }

    public static int getfCounter() {
        return fCounter;
    }

    public static Staff[] getStaffs() {
        return staffs;
    }

    public static int gettCounter() {
        return tCounter;
    }

    public static Student[] getStudents() {
        return students;
    }

    public static int getsCounter() {
        return sCounter;
    }

    public static Advisor[] getAdvisors() {
        return advisors;
    }

    public static int getaCounter() {
        return aCounter;
    }

    public static ITstaff[] getiTstaffs() {
        return iTstaffs;
    }

    public static int getiCounter() {
        return iCounter;
    }

    public static void readFile() throws IOException {
        Scanner in = new Scanner(Paths.get("uabEmployee.txt"));
        in.useDelimiter("\\s+|\n");
        while (in.hasNext()){
            String category = in.next();
//            System.out.println("Category is: " + category);
            String first = in.next();
//            System.out.println("First Name: " + first);
            String last = in.next();
//            System.out.println("Last Name: " + last);
            String blaze = in.next();
//            System.out.println("BlazerID: " + blaze);
            if (category.equals("F")) {
                String department = in.next();
//                System.out.println("Department is: " + department);
                int courses = in.nextInt();
//                System.out.println("Courses is: " + courses);
                faculties[fCounter] = new Faculty(first, last, blaze, department, courses);
                ++fCounter;
                ++counter;
            } else if (category.equals("S")){
                String level = in.next();
//                System.out.println("Level is: " + level);
                String major = in.next();
                float gpa = in.nextFloat();
                students[sCounter] = new Student(first, last, blaze, level, major, gpa);
                ++sCounter;
                ++counter;
            } else if (category.equals("T")){
                String role = in.next();
                String department = in.next();
                staffs[tCounter] = new Staff(first, last, blaze, department, role);
                ++tCounter;
                ++counter;
            } else if (category.equals("A")){
                String department = in.next();
                String clients = in.next();
                advisors[aCounter] = new Advisor(first, last, blaze, department, clients);
                ++aCounter;
                ++counter;
            } else if (category.equals("I")){
                String role = in.next();
//                System.out.println("Role is: " + role);
                iTstaffs[iCounter] = new ITstaff(first, last, blaze, role);
                ++iCounter;
                ++counter;
            }

        }
        in.close();
    }


//    public static void displayEmployees(int counter, int fCounter, int tCounter, int sCounter, int iCounter,
//                                        int aCounter, Faculty[] faculties, Staff[] staffs, Student[] students,
//                                        ITstaff[] iTstaffs, Advisor[] advisors) {
//        System.out.println("Total number of employees: " + counter + "\n\n" +
//                "Faculty: " + fCounter);
//        for (Faculty faculty : faculties){
//            if (faculty == null){
//                break;
//            } else{
//                System.out.println(faculty);
//            }
//        }
//        System.out.println("\n" + "Students: " + sCounter);
//        for (Student student : students){
//            if (student == null){
//                break;
//            } else{
//                System.out.println(student);
//            }
//        }
//
//        System.out.println("\n" + "Staff: " + tCounter);
//        for (Staff staff : staffs){
//            if (staff == null){
//                break;
//            } else{
//                System.out.println(staff);
//            }
//        }
//
//        System.out.println("\n" + "Advisors: " + aCounter);
//        for (Advisor advisor : advisors){
//            if (advisor == null){
//                break;
//            } else{
//                System.out.println(advisor);
//            }
//        }
//
//        System.out.println("\n" + "IT Professionals: " + iCounter);
//        for (ITstaff iTstaff : iTstaffs){
//            if (iTstaff == null){
//                break;
//            } else{
//                System.out.println(iTstaff);
//            }
//        }
//
//    }

    //add student to txt file and a student object to the students array
    public static void addStudent(String first, String last, String blaze, String level, String major, float gpa) throws IOException {
        BufferedWriter output;
        try {
            output = new BufferedWriter(new FileWriter("uabEmployee.txt", true));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        students[sCounter] = new Student(first, last, blaze, level, major, gpa);
        output.append("\n").append(students[sCounter].toString());
        output.close();
        ++sCounter;
        ++counter;
    }

    //add faculty to txt file and a faculty object to the faculties array
    public static void addFaculty(String first, String last, String blaze, String department, int courses) throws IOException {
        BufferedWriter output;
        try {
            output = new BufferedWriter(new FileWriter("uabEmployee.txt", true));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        faculties[fCounter] = new Faculty(first, last, blaze, department, courses);
        output.append("\n").append(faculties[fCounter].toString());
        output.close();
        ++fCounter;
        ++counter;
    }

    //add staff to txt file and a staff object to the staffs array
    public static void addStaff(String first, String last, String blaze, String role, String department) throws IOException {
        BufferedWriter output;
        try {
            output = new BufferedWriter(new FileWriter("uabEmployee.txt", true));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        staffs[tCounter] = new Staff(first, last, blaze, department, role);
        output.append("\n").append(staffs[tCounter].toString());
        output.close();
        ++tCounter;
        ++counter;
    }

    //add advisor to txt file and an advisor object to the advisors array
    public static void addAdvisor(String first, String last, String blaze, String department, String clients) throws IOException {
        BufferedWriter output;
        try {
            output = new BufferedWriter(new FileWriter("uabEmployee.txt", true));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        advisors[aCounter] = new Advisor(first, last, blaze, department, clients);
        output.append("\n").append(advisors[aCounter].toString());
        output.close();
        ++aCounter;
        ++counter;
    }

    //add IT staff to txt file and an It staff object to the iTstaffs array
    public static void addITstaff(String first, String last, String blaze, String role) throws IOException {
        BufferedWriter output;
        try {
            output = new BufferedWriter(new FileWriter("uabEmployee.txt", true));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        iTstaffs[iCounter] = new ITstaff(first, last, blaze, role);
        output.append("\n").append(iTstaffs[tCounter].toString());
        output.close();
        ++iCounter;
        ++counter;
    }

//    public static void addEmployee(Scanner input, String first, String last, String blaze, String category) throws IOException {
//        BufferedWriter output;
//        try {
//            output = new BufferedWriter(new FileWriter("uabEmployee.txt", true));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        if (category.equals("F")){
//            System.out.println("Please enter department: ");
//            String department = input.next();
//            System.out.println("Please enter number of courses: ");
//            int courses = input.nextInt();
//            faculties[fCounter] = new Faculty(first, last, blaze, department, courses);
//            output.append("\n").append(faculties[fCounter].toString());
//            output.close();
//            ++fCounter;
//            ++counter;
//        } else if (category.equals("S")){
//            System.out.println("Please enter student level: ");
//            String level = input.next();
//            System.out.println("Please enter student major: ");
//            String major = input.next();
//            System.out.println("Please enter student GPA");
//            float gpa = input.nextFloat();
//            students[sCounter] = new Student(first, last, blaze, level, major, gpa);
//            output.append("\n").append(students[sCounter].toString());
//            output.close();
//            ++sCounter;
//            ++counter;
//        } else if (category.equals("T")){
//            System.out.println("Please enter role: ");
//            String role = input.next();
//            System.out.println("Please enter department: ");
//            String department = input.next();
//            staffs[tCounter] = new Staff(first, last, blaze, department, role);
//            output.append("\n").append(staffs[tCounter].toString());
//            output.close();
//            ++tCounter;
//            ++counter;
//        } else if (category.equals("A")){
//            System.out.println("Please enter department: ");
//            String department = input.next();
//            System.out.println("Undergraduate or Graduate students?");
//            String clients = input.next();
//            advisors[aCounter] = new Advisor(first, last, blaze, department, clients);
//            output.append("\n").append(advisors[aCounter].toString());
//            output.close();
//            ++aCounter;
//            ++counter;
//        } else if (category.equals("I")){
//            System.out.println("Please enter role: ");
//            String role = input.next();
//            iTstaffs[iCounter] = new ITstaff(first, last, blaze, role);
//            output.append("\n").append(iTstaffs[tCounter].toString());
//            output.close();
//            ++iCounter;
//            ++counter;
//        }
//    }


    //creates a new txt file and copies all employees except employee to delete and then renames file to uabEmployee
    public static void deleteEmployee(String employeeToRemove) throws IOException {
        File inputFile = new File("uabEmployee.txt");
        File tempFile = new File("tempUabEmployee.txt");

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        String currentLine;

        while((currentLine = reader.readLine()) != null) {
            // trim need to trim the line and the employee line when comparing just in case
            String trimmedLine = currentLine.trim();
            if(trimmedLine.equalsIgnoreCase(employeeToRemove.trim()) || trimmedLine.equals("\n") || trimmedLine.equals("")) continue;
            writer.write(currentLine + System.getProperty("line.separator"));
        }
        writer.close();
        reader.close();
        tempFile.renameTo(inputFile);
    }

    //creates a new array and copies all objects to that array other than employee to delete and then sets original
    // array to the new array. also returns the String of the employee to delete to assist in removing them from the
    // txt file
    public static String deleteArray(String category, String blaze) {
        int indexToRemove = 0;

        if (category.equals("F")) {
            for (int j = 0; j < fCounter; j++) {
                if (blaze.equalsIgnoreCase(faculties[j].getBlazerID())) {
                    Faculty[] facultiesTemp = new Faculty[faculties.length];
                    for (int i = 0, k = 0; i < fCounter; i++){
                        if (i == indexToRemove){
                            continue;
                        } else {
                            facultiesTemp[k++] = faculties[i];
                        }
                    }
                    String removed = faculties[indexToRemove].toString();
                    faculties = facultiesTemp;
                    --fCounter;
                    --counter;
                    return removed;
                } else {
                    ++indexToRemove;
                }
            }
        } else if (category.equals("S")) {
            for (int j = 0; j < sCounter; j++) {
                if (blaze.equalsIgnoreCase(students[j].getBlazerID())) {
                    Student[] studentsTemp = new Student[students.length];
                    for (int i = 0, k = 0; i < sCounter; i++){
                        if (i == indexToRemove){
                            continue;
                        } else {
                            studentsTemp[k++] = students[i];
                        }
                    }
                    String removed = students[indexToRemove].toString();
                    students = studentsTemp;
                    --sCounter;
                    --counter;
                    return removed;
                } else {
                    ++indexToRemove;
                }
            }
        } else if (category.equals("T")) {
            for (int j = 0; j < tCounter; j++) {
                if (blaze.equalsIgnoreCase(staffs[j].getBlazerID())) {
                    Staff[] staffsTemp = new Staff[staffs.length];
                    for (int i = 0, k = 0; i < tCounter; i++){
                        if (i == indexToRemove){
                            continue;
                        } else {
                            staffsTemp[k++] = staffs[i];
                        }
                    }
                    String removed = staffs[indexToRemove].toString();
                    staffs = staffsTemp;
                    --tCounter;
                    --counter;
                    return removed;
                } else {
                    ++indexToRemove;
                }
            }
        } else if (category.equals("A")) {
            for (int j = 0; j < aCounter; j++) {
                if (blaze.equalsIgnoreCase(advisors[j].getBlazerID())) {
                    Advisor[] advisorsTemp = new Advisor[faculties.length];
                    for (int i = 0, k = 0; i < aCounter; i++){
                        if (i == indexToRemove){
                            continue;
                        } else {
                            advisorsTemp[k++] = advisors[i];
                        }
                    }
                    String removed = advisors[indexToRemove].toString();
                    advisors = advisorsTemp;
                    --aCounter;
                    --counter;
                    return removed;
                } else {
                    ++indexToRemove;
                }
            }
        } else if (category.equals("I")) {
            for (int j = 0; j < iCounter; j++) {
                if (blaze.equalsIgnoreCase(iTstaffs[j].getBlazerID())) {
                    ITstaff[] iTstaffsTemp = new ITstaff[iTstaffs.length];
                    for (int i = 0, k = 0; i < iCounter; i++){
                        if (i == indexToRemove){
                            continue;
                        } else {
                            iTstaffsTemp[k++] = iTstaffs[i];
                        }
                    }
                    String removed = iTstaffs[indexToRemove].toString();
                    iTstaffs = iTstaffsTemp;
                    --iCounter;
                    --counter;
                    return removed;
                } else {
                    ++indexToRemove;
                }
            }
        }
        return "There is no employee with that classification and BlazerID and thus no one could be";
    }
}
