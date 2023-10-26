import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentTester {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> students = readFile();
        for (Student student : students){
            System.out.println(student.toString());
        }
        writeFile(students);
    }

    public static ArrayList<Student> readFile() throws IOException {
        ArrayList<Student> students = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(Paths.get("studentList.txt"))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }

                String[] strings = line.split(",");
                students.add(new Student(strings[0], Integer.parseInt(strings[1]),
                        Integer.parseInt(strings[2]), Integer.parseInt(strings[3])));

            }
        } catch (Exception e){
            e.printStackTrace();
        }

        return students;
    }

    public static void writeFile(ArrayList<Student> students){
        try (PrintWriter pw = new PrintWriter("studentGrades.txt")){
            for (Student student : students){
                pw.println(student.toString());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}


