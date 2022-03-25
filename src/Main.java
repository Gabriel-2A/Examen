import java.util.Scanner;

public class Main {
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args){

        Calculadora basica = new Calculadora("Patito", false);
        Calculadora cientifica = new Calculadora("Casio", true);

        basica.setPrimerValor(284.9);
        basica.setSegundoValor(0.0);

        cientifica.setPrimerValor(45.83);
        cientifica.setSegundoValor(13.6);

        System.out.println("La suma de " + basica.getPrimerValor() + " + " + basica.getSegundoValor() +
                " = ["+ basica.suma() +"]");
        System.out.println("La resta de " + basica.getPrimerValor() + " - " + basica.getSegundoValor() +
                " = ["+ basica.resta() +"]");
        System.out.println("La multiplicasion de " + basica.getPrimerValor() + " * " + basica.getSegundoValor() +
                " = ["+ basica.multiplicasion() +"]");
        System.out.println("La division de " + basica.getPrimerValor() + " / " + basica.getSegundoValor() +
                " = ["+ basica.division() +"]");
        System.out.println("La Potencia de " + basica.getPrimerValor() + " ^ " + basica.getSegundoValor() +
                " = [ Su claculadora es cientifica asi que no puede realizar esta operacion ]");
        System.out.printf(basica.toString());

        System.out.printf("\n\n");
        System.out.println("La suma de " + cientifica.getPrimerValor() + " + " + cientifica.getSegundoValor() +
                " = ["+ cientifica.suma() +"]");
        System.out.println("La resta de " + cientifica.getPrimerValor() + " - " + cientifica.getSegundoValor() +
                " = ["+ cientifica.resta() +"]");
        System.out.println("La multiplicasion de " + cientifica.getPrimerValor() + " * " + cientifica.getSegundoValor() +
                " = ["+ cientifica.multiplicasion() +"]");
        System.out.println("La division de " + cientifica.getPrimerValor() + " / " + cientifica.getSegundoValor() +
                " = ["+ cientifica.division() +"]");
        System.out.println("La Potencia de " + basica.getPrimerValor() + " ^ " + basica.getSegundoValor() +
                " = ["+ cientifica.elevarPotencia() +"]");
        System.out.printf(cientifica.toString());

    }
}
