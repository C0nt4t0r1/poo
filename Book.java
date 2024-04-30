public class Book {
    
    public static class Livro {
        
        private String Titulo;
        private String Autor;
        private int AnoPublicacao;
        private boolean Emprestado;

        public Livro(String Titu, String Aut, int AnoP) {
            this.Titulo = Titu;
            this.Autor = Aut;
            this.AnoPublicacao = AnoP;
            this.Emprestado();
        }

        public String getTitulo() {
            return this.Titulo;
        }

        public void setTitulo(String Titu) {
            this.Titulo = Titu;
        }

        public String getAutor() {
            return this.Autor;
        }

        public void setAutor(String Aut) {
            this.Autor = Aut;
        }

        public int getAnoPublicacao() {
            return this.AnoPublicacao;
        }

        public void setAnoPublicacao(int AnoP) {
            this.AnoPublicacao = AnoP;
        }

        public void Emprestado() {
            this.Emprestado = true;
        }

        public void Devolver() {
            this.Emprestado = false;
        }

        public void ExibirInformacoes() {
            System.out.println("Sobre o livro:");
            System.out.println("Titulo: " + this.getTitulo());
            System.out.println("Autor: " + this.getAutor());
            System.out.println("Ano de publicacao: " + this.getAnoPublicacao());
            System.out.println("Foi emprestado? " + this.Emprestado);
        }

    }

    public static void main(String[] args) {
        Livro sla = new Livro("Limbo", "VelhoVamp", 2023);
        sla.ExibirInformacoes();
    }
}
