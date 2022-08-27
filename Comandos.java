

public class Comandos {
    public static void main (String ags []){

        // == > < >= <= != !  (true/false)

        int nota=90;
        int faltas=5;
        int maxFaltas=5;
        int media=60;

        // tabela da verdade AND &&
        /*
            V V = V
            V F = F
            F V = F
            F F = F
        */    

        // tabela da verdade OR ||
        /*
            V V = V
            V F = V
            F V = V
            F F = F
        */    
    

        if((nota >= media) && (faltas <= maxFaltas)){
            System.out.println("Aprovado!");
            
        }else if(nota>= 40){
            System.out.println("Recuperacao");
        }
        
        else{
            System.out.println("Reprovado");
        }
        

        System.out.println("Fim do programa");
        
    }
}
