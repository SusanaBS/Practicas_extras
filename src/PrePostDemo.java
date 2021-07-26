//En el siguiente programa, explique por qué el valor "6" se imprime dos veces seguidas:

public class PrePostDemo {

    public static void main(String[] args){
        int i = 3;
        i++;
        System.out.println(i);    // "4"
        ++i;
        System.out.println(i);    // "5"
        System.out.println(++i);  // "6"
        System.out.println(i++);  // "6"
        System.out.println(i);    // "7"
    }
}

//Imprime dos veces el 6 porque en la primeras hacer primero el incremento y después evaluá,
//el segundo "6" es porque primero evalúa y después realiza el incremento