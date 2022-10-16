package day33_Statics;

public class CydeoStudentObject {
    public static void main(String[] args) {

        CydeoStudent cydeoStudent1 = new CydeoStudent("İrfan", 47, 'M', 12, 'A', 8, 1);
        CydeoStudent cydeoStudent2 = new CydeoStudent("Aslı", 30, 'F', 13, 'A', 8, 1);

        System.out.println(cydeoStudent1);
        System.out.println(cydeoStudent2);

        CydeoStudent.printSchoolName();
        CydeoStudent.printProgLanguage();
    }
}
