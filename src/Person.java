//Dado el siguiente programa, anula el método equals para obtener el resultado:
//false
//true

import java.lang.reflect.Type;

class Person {}

class Student {
    int id;

    Student(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        // Write your code here,

        boolean result = true;

        if(this.getClass() == obj.getClass()) {
            if (this.id == ((Student)obj).id) {
                result = true;

            } else {
                result = false;
            }
        }
        else {
            result = false;
        }

        return result;
    }

}

class Test {
    public static void main(String[] args) {
        Person p = new Person();
        Student s1 = new Student(1001);
        Student s2 = new Student(1002);
        System.out.println(s1.equals(p));
        System.out.println(s1.equals(s2));
    }
}