import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        double p1,e1,imc;
        System.out.println("Escriba el peso: ");
        p1=teclado.nextDouble();
        System.out.println("Escriba la estatura: ");
        e1=teclado.nextDouble();
        imc=p1/(e1*2);
        System.out.println("El indice de masa es: "+imc);
        if(imc<=18.4){
            System.out.println("El peso es bajo");
        }
        if(imc>=18.5 && imc<=24.9){
            System.out.println("Peso normal");
        }
        if(imc>=25 && imc<=26.9){
            System.out.println("Sobre peso grado 1");
        }
        if(imc>=27 && imc<=29.9){
            System.out.println("Sobre peso grado 2");
        }
        if(imc>=30 && imc<=34.9){
            System.out.println("Obesidad tipo 1");
        }
        if(imc>=35 && imc<=39.9){
            System.out.println("Obesidad tipo 2");
        }
        if(imc>=40 && imc<=40.9){
            System.out.println("Obesidad morbida");
        }
        if(imc>=50){
            System.out.println("Obesidad extrema");
        }
    }
}