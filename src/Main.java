import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};

        String[] my_array2 = {
                "Java",
                "Python",
                "PHP",
                "JavaScript",
                "Ruby",
                "C#",
                "C Programming",
                "C++"};

        //Array 1
        System.out.println("my_array1 - Essa é a Array original: " + Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("my_array1 - Essa é a Array por ordem numérica crescente: " + Arrays.toString(my_array1));

        //Array 2
        System.out.println("my_array2 - Essa é a Array original: " + Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("my_array2 - Essa é a Array por ordem alfabética: " + Arrays.toString(my_array2));
    }
}
//Nesse projeto do dia 2, o desafio era criar dois prints com as Arrays criadas:
// 1 mostrando a Array original e o 2 precisava mostrar a Array ordenada (por ordem alfabética e numérica).