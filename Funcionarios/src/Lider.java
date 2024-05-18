public class Lider extends Funcionario {
    private static final double BONUS_LIDER = 0.02;

    public Lider(String nome, double valorHora, int horasTrabalhadas) {
        super(nome, valorHora, horasTrabalhadas);
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() * (1 + BONUS_LIDER);
    }
}