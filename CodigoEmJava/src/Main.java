import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void tarefa1Soma(){
        int indice = 13;
        int soma = 0, k = 0;

        while (k<indice){
            k+=1;
            soma+=k;
        }

        System.out.println("Valor da soma: "+soma);
    }

    public static void tarefa2Fibonacci(int numero){
        List<Integer> listaFibonacci = new ArrayList<>(Arrays.asList(0,1));

        while (listaFibonacci.getLast()<=numero){
            int valor1 = listaFibonacci.getLast();
            int valor2 = listaFibonacci.get(listaFibonacci.size()-2);
            listaFibonacci.add(valor1+valor2);
        }

        if (listaFibonacci.contains(numero)){
            System.out.println("O número fornecido ["+numero+"] EXISTE na sequência de fibonacci");
        }else{
            System.out.println("O número fornecido ["+numero+"] NÃO existe na sequência de fibonacci");
        }
    }

    public static void stringInvertida(String string){
        StringBuilder invertida = new StringBuilder();

        if (string.length()>1) {
            for (int i = string.length() - 1; i >= 0; i--) {
                invertida.append(string.charAt(i));
            }
        }else {
            invertida.append(string);
        }

        System.out.println("A string ["+string+"] de trás pra frente é: "+invertida);
    }

    public static void main(String[] args) {

        tarefa1Soma();

        tarefa2Fibonacci(21);

        stringInvertida("ola");

    }
}