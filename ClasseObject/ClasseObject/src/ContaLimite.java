public class ContaLimite extends Conta{

    private double limite;

    public ContaLimite(int numeroConta, double saldo, double limite) {
        super(numeroConta, saldo);
        this.limite = limite;
    }

    @Override
    public void saque(double valor){
        if(valor <0.0){
            valor = 0.0;
        }
        if(getSaldo() + limite - valor < 0.0){
            return;
        } else {
            setSaldo(getSaldo() - valor);
        }
    }



}