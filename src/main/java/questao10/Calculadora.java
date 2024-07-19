package questao10;

public class Calculadora {

    // Atributes

    private float numero1;
    private float numero2;
    private float resultado;

    // Constructor

    public Calculadora(){

    }

    // Methods

    public void somar(float numero1,float numero2){
        resultado = numero1 + numero2;
        System.out.println(" A soma do " + numero1 + " com o " + numero2 + " é igual " + resultado);
    }

    public void dividir(){
        resultado = numero1 / numero2;
        System.out.println("A divisão do "+ numero1 + " com o " + numero2 + " é igual a " + resultado);
    }

    public float mutiplicar(){
        return numero1 * numero2;
    }

    public void subtrair(){
        resultado = numero1 - numero2;
        System.out.println("A subtração do " + numero1+ " com o " + numero2 + " é igual a " + resultado);
    }


    // Getters and Setters

    public float getNumero1() {
        return numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
}
