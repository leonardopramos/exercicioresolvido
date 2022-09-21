public class ContaSimples extends Conta{

    public ContaSimples(int numeroConta, double saldo) {
        super(numeroConta, saldo);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void saque(double valor){
        if(valor < 0){
            valor = 0;
        } else {
            if(getSaldo() - valor < 0){
                return;
            } else{
                setSaldo(getSaldo() - valor);
            }
        }
    }


    
}
