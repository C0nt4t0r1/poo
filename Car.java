public class Car {
    
    public static class Carro {

        private String Marca;
        private String Modelo;
        private int Ano;
        private String Color;
        private double velocidadeAtual;

        public Carro(String Mar, String Mod, int Ano, String Col) {
            this.Marca = Mar;
            this.Modelo = Mol;
            this.Ano = Ano;
            this.Color = Col;
            this.velocidadeAtual = 0;
        }

        public String getMarca() {
            return this.Marca;
        }

        public void setMarca(String Mar) {
            this.Marca = Mar;
        }

        public String getModelo() {
            return this.Modelo;
        }

        public void setModelo(String Mod) {
            this.Modelo = Mod;
        }

        public int getAno() {
            return this.Ano;
        }

        public void setAno(int Ano) {
            this.Ano = Ano;
        }

        public String getColor() {
            return this.Color;
        }

        public void setColor(String Col) {
            this.Color = Col;
        }

        public void Acelerar(double valor) {
            this.velocidadeAtual += valor;
        }

        public void Frear(double valor) {
            if (this.velocidadeAtual > 0) {
                this.velocidadeAtual -= valor;
                if (this.velocidadeAtual < 0) {
                    this.velocidadeAtual = 0;
                }
            } else {
                System.out.println("Velocidade do carro nao pode ser negativa");
            }
        }

        public void ExibirInformacoes() {
            System.out.println("Informacoes do carro: ");
            System.out.println("Marca do carro: " + getMarca());
            System.out.println("Modelo do carro: " + getModelo());
            System.out.println("Ano do carro: " + getAno());
            System.out.println("Cor do carro: " + getColor());
            System.out.println("Velocidade do carro: " + this.velocidadeAtual + "km/h");
        }

    }

    public static void main(String[] args) {
        Carro IsThatA = new Carro("Toyota", "Supra", 1998, "Branca");
        IsThatA.Acelerar(240);
        IsThatA.Frear(140);
        IsThatA.ExibirInformacoes();
    }
}
