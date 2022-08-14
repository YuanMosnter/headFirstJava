package object.method;

import object.Person;

public class Student extends Person {
    private int score ;




    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public Student() {

    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
    /*
    @Override
    public void run(){
        System.out.println("Student.run");
    }

     */
}
