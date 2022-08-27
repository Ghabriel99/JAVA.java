import java.util.Scanner;

public class Scan {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        int n1=0, n2=0,n3=0,soma=0;
        final int MEDIA=60;
        String nome="", res="";

        System.out.println("Digite o nome do aluno: ");
        nome=scan.nextLine();

        System.out.println("Digite a primeira nota: ");
        n1=scan.nextInt();

        System.out.println("Digite a segunda nota: ");
        n2=scan.nextInt();

        System.out.println("Digite a terceira nota: ");
        n3=scan.nextInt();

        soma= n1+n2+n3;

        if(soma >= MEDIA){
            res="aprovado";
        }else{
            res="reprovado";
        }
        System.out.printf("Aluno %s foi %s , c,om a nota %d", nome,res,soma);
    }
}
