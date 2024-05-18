public class Gerente extends Funcionario {
    private static final double BONUS_GERENTE = 0.05;

    public Gerente(String nome, double valorHora, int horasTrabalhadas) {
        super(nome, valorHora, horasTrabalhadas);
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() * (1 + BONUS_GERENTE);
    }
}