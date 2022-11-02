public class Carro {
    String marca;
    String modelo;
    int velocidade;

    Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        velocidade = 0;
    }

    void printStatus() {
        System.out.println(
                "Carro [marca=" + this.marca + ", modelo=" + this.modelo + ", velocidade=" + this.velocidade + "]");
    }

    void acelerar(int addvel) {
        int soma = this.velocidade + addvel;
        if (soma >= 200) {
            soma = 200;
        }
        System.out.println(this.velocidade + " + " + addvel + " > " + soma);
        this.velocidade = soma;
    }

    void frear(int remvel) {
        int subt = this.velocidade - remvel;
        if (subt <= 0) {
            subt = 0;
        }
        System.out.println(this.velocidade + " - " + remvel + " > " + subt);
        this.velocidade = subt;
    }
}
