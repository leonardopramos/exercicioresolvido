public abstract class Conta{

    private int numeroConta;
    private double saldo;


    public Conta(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }
    
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double valor) {
        if(valor < 0.0){
            valor = 0;
        }
        saldo = valor;
    }

    public void deposito(double valor){
        if(valor < 0){
            valor = 0;
        }
        saldo += valor;
    }
    public abstract void saque(double valor);

    @Override
    public boolean equals(Object outro){
        if(outro instanceof Conta){
            Conta outraConta = (Conta)outro;
            if(this.numeroConta == outraConta.getNumeroConta()){
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString() {
        return "Conta [numeroConta=" + numeroConta + ", saldo=" + saldo + "]";
    }
}
