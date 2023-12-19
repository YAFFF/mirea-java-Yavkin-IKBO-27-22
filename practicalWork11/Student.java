package practicalWork11;

public class Student {
    private String name;
    private int id, age, gpa;
    public Student(String name, int age, int id, int gpa){
        this.name = name;
        this.age = age;
        this.id = id;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public int getGPA() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGPA(int gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "STUDENT. " +
                "Name: " + name +
                "; Age: " + age +
                "; Id: " + id +
                "; GPA: " + gpa + '.';
    }
}
