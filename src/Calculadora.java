public class Calculadora {
    private String marca;
    private boolean esCientifica;
    private double primerValor;
    private double segundoValor;

    public Calculadora(String marca, boolean esCientifica) {
        this.marca = marca;
        this.esCientifica = esCientifica;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEsCientifica() {
        return esCientifica;
    }

    public void setEsCientifica(boolean esCientifica) {
        this.esCientifica = esCientifica;
    }

    public double getPrimerValor() {
        return primerValor;
    }

    public void setPrimerValor(double primerValor) {
        this.primerValor = primerValor;
    }

    public double getSegundoValor() {
        return segundoValor;
    }

    public void setSegundoValor(double segundoValor) {
        this.segundoValor = segundoValor;
    }


    //Metodos
    public double suma(){
        return primerValor + segundoValor;
    }

    public double resta(){
        return primerValor - segundoValor;
    }

    public double multiplicasion(){
        return primerValor * segundoValor;
    }

    public double division(){
        if((segundoValor == 0)){
            return 0.0;
        }

        return primerValor / segundoValor;
    }

    public double elevarPotencia(){
        return Math.pow(primerValor,segundoValor);
    }

    @Override
    public String toString() {
        if(esCientifica == true) {
           return "La calculadora es de maraca [" + marca + "] y [es cientifica]";
        }else
            return "La calculadora es de marca [" + marca + "] y [no es cientifica]";
    }
}
