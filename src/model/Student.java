package model;

public class Student {
    private String name;
    private int age;
    private String gender;
    private String id;

    public Student(String name,int age,String gender,String id){
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(String id) {
        this.id = id;
    }
}
