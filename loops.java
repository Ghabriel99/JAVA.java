import java.util.Scanner;

public class loops {
    
    public static void main (String[] args){

         
        //FOR 
        /* 
        for(int cont=5; cont >0 ; cont--){

            System.out.println(cont  +  "CURSO JAVA");
        }
        System.out.println("END"); 
        */


        //WHILE
        /*Scanner scan=new Scanner(System.in);
        int max=scan.nextInt();
        int cont=0;

        while(cont<max){
            System.out.println(cont + " - Curso de java");
            cont++;
        }
        */
        
        int cont=0;
        
        do{
            System.out.println(cont + " - Curso de java");
            cont++;
        }while(cont <=0);
        
        System.out.println("the END"); 
    }

      
}
