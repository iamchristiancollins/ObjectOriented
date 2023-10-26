public class Student {
    private String name;
    private int exam1, exam2, examFinal;
    private double finalGrade;
    private String letter;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExam1() {
        return exam1;
    }

    public void setExam1(int exam1) {
        this.exam1 = exam1;
    }

    public int getExam2() {
        return exam2;
    }

    public void setExam2(int exam2) {
        this.exam2 = exam2;
    }

    public int getExamFinal() {
        return examFinal;
    }

    public void setExamFinal(int examFinal) {
        this.examFinal = examFinal;
    }

    public double getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(double finalGrade) {
        this.finalGrade = finalGrade;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public Student(String name, int exam1, int exam2, int examFinal) {
        this.name = name;
        this.exam1 = exam1;
        this.exam2 = exam2;
        this.examFinal = examFinal;
        this.finalGrade = this.setFinalGrade();
        this.letter = this.setLetterGrade();
    }

    public double setFinalGrade(){
        return (.25*this.exam1+.25*this.exam2+.5*this.examFinal);
    }

    public String setLetterGrade(){
        if (this.finalGrade >= 90){
            return "A";
        } else if (this.finalGrade >= 80){
            return "B";
        } else if (this.finalGrade >= 70){
            return "C";
        } else {
            return "F";
        }
    }

    @Override
    public String toString() {
        return this.getName() + " received a grade of " + this.getFinalGrade() + ": " + this.getLetter();
    }
}
