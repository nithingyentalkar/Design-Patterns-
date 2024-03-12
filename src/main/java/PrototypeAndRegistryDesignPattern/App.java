package PrototypeAndRegistryDesignPattern;

public class App {
    public static void main(String[] args) {

        //Creating instance of Registry class - performing registry Design Pattern
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student Itachi = studentRegistry.get("febBatchStudent").clone();
        Itachi.setName("Itachi Uchiha");
        Itachi.setAge(13);
        Itachi.setStudentPSP(99.99);

        Student Eren = studentRegistry.get("febBatchintelligentStudent").clone();
        Eren.setStudentPSP(100.00);
        Eren.setName("Eren Yeager");
        Eren.setAge(17);


        System.out.println("Eren" + Eren);
        System.out.println("Itachi" + Itachi);

    }

    private static void fillRegistry(StudentRegistry studentRegistry) {
        Student febBatchStudent = new Student();
        febBatchStudent.setBatch("Feb Batch 23");
        febBatchStudent.setAverageBactchPSP(85.0);

        IntelligentStudent BangaloreStudents = new IntelligentStudent();
        BangaloreStudents.setcity("Bangalore");
        BangaloreStudents.setBatch("Feb Batch 23");
        BangaloreStudents.setAverageBactchPSP(95.0);


        studentRegistry.Register("febBatchStudent", febBatchStudent);
        studentRegistry.Register("febBatchintelligentStudent", BangaloreStudents);
    }
}
