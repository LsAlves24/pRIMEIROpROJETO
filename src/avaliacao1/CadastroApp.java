package avaliacao1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CadastroApp {
    public static void main(String[] args) {
        Transacao transacao1 = new Transacao (20, "saque", 1200.00, LocalDateTime.now(), "finalizado" ); 
        Transacao transacao2 = new Transacao (30, "saque", 500.00, LocalDateTime.now(), "cancelado" );
        Transacao transacao3 = new Transacao (40, "depósito", 600.00, LocalDateTime.now(), "finalizado" );

        List<Transacao> transacoes = new  ArrayList<>(); 
        transacoes.add(transacao1);
        transacoes.add(transacao2);
        transacoes.add(transacao3); 
        
        ContaBancaria contaBancaria1 = new ContaBancaria(); 
        contaBancaria1.id = 20;
        contaBancaria1.titular = "José"; 
        contaBancaria1.numero = "12";
        contaBancaria1.agencia = "197";
        contaBancaria1.saldo = 2000.00;
        contaBancaria1.limite = 1500.00; 
        contaBancaria1.tipo = "corrente"; 
        contaBancaria1.transacoes = transacoes; 

        System.out.println("======ContaBancaria======");
        System.out.println("id: " + contaBancaria1.id);
        System.out.println("Titular: " + contaBancaria1.titular);
        System.out.println("Número: " + contaBancaria1.numero);
        System.out.println("Agencia: " + contaBancaria1.agencia);
        System.out.println("Saldo: " + contaBancaria1.saldo);
        System.out.println("Limite: " + contaBancaria1.limite);
        System.out.println("Tipo: " + contaBancaria1.tipo);

        System.out.println("\n");
        System.out.println("TRANSAÇÕES");
        System.out.println("\n");

            for (Transacao t: contaBancaria1.transacoes) {
                System.out.println("ID: " + t.id);
                System.out.println("Tipo: " + t.tipo);
                System.out.println("Valor: " + t.valor);
                System.out.println("Data e hora: " + t.dataHora);
                System.out.println("Status: " + t.status);
                System.out.println("\n");
            }
 


    }
}
