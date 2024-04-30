public class Escola {
    
    public static class Aluno {
        
        private String Nome;
        private String Matricula;
        private String Curso;
        private int AnoDeIngresso;

        public Aluno() {

        }

        public Aluno(String Nom, String Mat, String Cur, int ADI) {
            this.Nome = Nom;
            this.Matricula = Mat;
            this.Curso = Cur;
            this.AnoDeIngresso = ADI;
        }

        public String getNome() {
            return this.Nome;
        }

        public void setNome(String Nom) {
            this.Nome = Nom;
        }

        public String getMatricula() {
            return this.Matricula;
        }

        public void setMatricula(String Mat) {
            this.Matricula = Mat;
        }

        public String getCurso() {
            return this.Curso;
        }

        public void setCurso(String Cur) {
            this.Curso = Cur;
        }

        public int getAnoDeIngresso() {
            return this.AnoDeIngresso;
        }

        public void setAnoDeIngresso(int ADI) {
            this.AnoDeIngresso = ADI;
        }

        public int calcularTempoDeCurso(int anoAtual) {
            return anoAtual - this.AnoDeIngresso;
        }

        public void imprimirInfo() {
            System.out.println("Informacoes sobre o aluno: ");
            System.out.println("Nome do aluno: " + this.getNome());
            System.out.println("Matricula: " + this.getMatricula());
            System.out.println("Cursando: " + this.getCurso());
            System.out.println("Ano de ingresso: " + this.getAnoDeIngresso());
            System.out.println("O tempo de curso e de " + this.calcularTempoDeCurso(2024) + " anos");
        }

    }

    public static void main(String[] args) {
        Aluno student = new Aluno("Olavo de Carvalho", "1337g3x", "Filosofia", 1993);
        student.imprimirInfo();
    }
}
