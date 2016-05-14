import java.util.*;
import java.io.IOException;

public class Test {
 
    public static void main(String[] args) {
        Student st1 = new Student("Алієв Віталій", 19, true, "2-ЕК", 4.5);
        Student st2 = new Student("Воловодівська Ольга", 19, false, "2-ЕК", 4.7);
        Student st3 = new Student("Зубко Лілія", 19, false, "2-ЕК", 4.2);
        Student st4 = new Student("Шумілова Дарія", 19, false, "2-ЕК", 4.2);
        Student st5 = new Student("Соснова Юлія", 18, false, "2-ЕК", 4.5);
        Student st6 = new Student("Чорна Яна", 19, false, "2-ЕК", 4.8);
        Student st7 = new Student("Андрухіна Євгенія", 18, false, "2-ЕК", 4.6);
 
        Teacher t1 = new Teacher("Ганна Борисівна", 18, false, "кандидат економічних наук", "системи моніторингу в економіці");
        Teacher t2 = new Teacher("Дмитро Миколайович", 32, true, "старший викладач", "ООП");
        Teacher t3 = new Teacher("Віктор Сергійович", 18, true, "кандидат економічних наук", "Функціональний аналіз");
        Teacher t4 = new Teacher("Володимир Миколайович", 18, true, "професор", "Економічна кібернетика");
 
        List<Student> students = Arrays.asList(st1, st2, st3, st4, st5, st6, st7);
        List<Teacher> teachers = Arrays.asList(t1, t2, t3, t4);
 
        UniversityManager manager = new UniversityManager();
 
        System.out.println("Список студентів групи 2-ЕК ");
        List<Student> FK = manager.getStudentsFromTheSameGroup(students, "2-ЕК");
        for (Student student : FK)
            System.out.println(student);
 
        System.out.println("Список доцентов ");
        List<Teacher> docents = manager.getDocents(teachers);
        for (Teacher teacher : docents)
            System.out.println(teacher);
           
        Person person = new Person();

       person.writeToFile("D:\\ЧНУ\\2 курс\\програмування\\OOP\\src\\json.txt");
       person.readFromFile("D:\\ЧНУ\\2 курс\\програмування\\OOP\\src\\json.txt");
       person.FromJson("D:\\ЧНУ\\2 курс\\програмування\\OOP\\src\\json.txt");
    }
}
