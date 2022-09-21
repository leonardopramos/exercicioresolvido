import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        //Conta c = new Conta(12948, 199999.9);
        //Conta c2 = new Conta(12948, 199999.9);

        //if(c.equals(c2)){
        //    System.out.println("São iguais");
        //} else {
        //    System.out.println("São diferentes");
        //}

        Integer numero = 1000;

        ArrayList<Object> lst = new ArrayList<>();
        //lst.add(c);
        lst.add("Isso é string");
        //lst.add(c2);
        lst.add(numero);

        System.out.println(lst.toString());

        ContaSimples c1 = new ContaSimples(4235, 3000);

        System.out.println(c1.getSaldo());

        c1.saque(1500);

        System.out.println(c1.getSaldo());
    }
}
