class Student{
    String name;
    int age;
    int section;

    public Student(){
        System.out.println("Inside Default Constructor");
        this.name = "";
        this.age = 5;
        this.section = 1;
    }

//    public Student() {
//
//    }

    public Student(String name, int age, int section) {
        this.name = name;
        this.age = age;
        this.section = section;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", section=" + section +
                '}';
    }
}


public class Foo {
    public static void main(String ... args){
        Student student1 = new Student();
        System.out.println(student1);
        student1.setName("Demo_Student");
        System.out.println(student1);
        System.out.println(student1.getName());

        Student student2 = new Student("Patrik", 23, 11); // obj;
        System.out.println(student2);

        System.out.println(new Student("Patrik", 23, 11));

    }
}
