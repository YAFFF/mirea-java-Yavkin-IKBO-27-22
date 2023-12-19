package practicalWork15;

public class StudentController {
    private Student model;
    private StudentView view = new StudentView();

    public StudentController() {}

    public StudentController(Student model) {
        this.model = model;
    }

    public void setStudentName(String name){
        model.setName(name);
    }

    public String getStudentName(){
        return model.getName();
    }

    public void setStudentRollNo(String rollNo){
        model.setRollNo(rollNo);
    }

    public String getStudentRollNo(){
        return model.getRollNo();
    }

    public void updateView(){
        view.printStudentDetails(model);
    }
}
