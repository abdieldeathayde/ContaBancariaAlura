package org.example;

import java.util.ArrayList;

public class ContaBancaria {
    private String nomeTitular;
    private int numeroConta;
    private int saldo;

    public ContaBancaria(String nomeTitular, int numeroConta, int saldo) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public int getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "nomeTitular='" + nomeTitular + '\'' +
                ", numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                '}';
    }

    public static void main(String[] args) {
        int maior = -5;

        ContaBancaria conta = new ContaBancaria("Abdiel", 1234596, 500);
        ContaBancaria contaEmanoel = new ContaBancaria("Emanoel", 12365478, 2000);
        ContaBancaria contaMatheus = new ContaBancaria("Matheus", 789546321, 5000);
        ArrayList<ContaBancaria> listaContas = new ArrayList<>();
        listaContas.add(conta);
        listaContas.add(contaEmanoel);
        listaContas.add(contaMatheus);

        ContaBancaria contaComMaiorSaldo = null;


        for (ContaBancaria item : listaContas) {
            if (contaComMaiorSaldo == null || item.getSaldo() > contaComMaiorSaldo.getSaldo()) {
                contaComMaiorSaldo = item;
            }

            if (contaComMaiorSaldo != null) {
                System.out.println("Conta com maior saldo: " + contaComMaiorSaldo);
            }
        }

    }

}
