package object.method.test;

import object.Person;
import object.method.Student;

public class MainTest {
    public static void main(String[] args) {
        //创建一个person对象
        Person person = new Person();
        person.setAge(10);
        person.setName("小明");
        person.run();

        System.out.println(person);
        //创建一个student对象
        Student student = new Student();
        student.setName("小刚");
        student.setAge(10);
        student.setScore(100);
        System.out.println(student);
        student.run();
        /*
        对象的转换，只能向上兼容不能向下转换

         */
        Object obj  = "HELLO";
        if (obj instanceof String){
            String s = (String) obj;
            System.out.println(s.toUpperCase());
            System.out.println(s.toLowerCase());
        }
    }
}
