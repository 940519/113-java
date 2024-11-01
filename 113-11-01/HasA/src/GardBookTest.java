public class GradeBookTest {
    public static  void main(String[] args){
        final int NUMBER_OF_STUDENTS =2;
        Student[] students =new Student[NUMBER_OF_STUDENTS];
        students[0]=new Student("2222222","jj");
        students[1]=new Student("55454545","xc");

        GradeBook gradeBook = new GradeBook("Java程式設計",students,NUMBER_OF_STUDENTS);
        gradeBook.processStudentsGrades();
        gradeBook.displayGradeReport();
    }
}