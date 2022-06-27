import model.Student;

public class test {
    public static void main(String argv[]){
        Student s = new Student("William",23,"男","2022");
        System.out.print(s.getName());
        System.out.print(s.getId());
        System.out.print(s.getAge());
        System.out.print(s.getGender());
    }
}
