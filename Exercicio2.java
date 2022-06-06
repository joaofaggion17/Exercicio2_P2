import java.util.Random;

public class Exercicio2{

    public static void main(String [] args){
        
        Random random = new Random();

        
        int vetor [] = new int [5];
        for (int index = 0; index < vetor.length; index++) {
            vetor[index] = random.nextInt(50);
            System.out.println(vetor[index]);

            
        }
        System.out.println(vetor);
    }
}