package practicalWork15;

public class MVCPatternDemo {
    public Student retriveStudentFromDtabase(){
        return null;
    }

    public static void main(String[] args) {
        StudentController studentController = new StudentController(new Student("Vladimir", "abcd1234"));
        studentController.updateView();
        System.out.println(studentController.getStudentName());
        System.out.println(studentController.getStudentRollNo());
    }
}
