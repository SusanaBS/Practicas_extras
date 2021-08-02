/*
Escriba el código que falta e invalide el método equals en la clase MyDate, para que pueda comparar
que cuando dos objetos MyDate tienen el mismo año, mes y día, el resultado es true, de lo contrario false.
El resultado esperado es:*/
//m1!=m2
//
//m1 is equal to m2
//
//m3 is not equal to m1 or m2

public class TestMyDate {
    public static void main(String[] args) {
        MyDate m1 = new MyDate(2,8,2019);
        MyDate m2 = new MyDate(2,8,2019);
        MyDate m3 = new MyDate(3,5,2015);

        if(m1==m2) {
            System.out.println("m1==m2");
        }else {
            System.out.println("m1!=m2");
        }

        if(m1.equals(m2)) {
            System.out.println("m1 is equal to m2");
        }else {
            System.out.println("m1 is not equal to m2");
        }

        // Compare if m3 is equals to m1 or m2

        if(m3.equals(m1) || m3.equals(m2)) {
            System.out.println("m3 is equal to m1 or m2");
        }else {
            System.out.println("m3 is not equal to m1 or m2");
        }
    }
}

