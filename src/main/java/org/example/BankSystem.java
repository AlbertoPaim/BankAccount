package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class BankSystem {

    HashMap<String, BankAccount> accounts;
    Scanner scanner;

    public BankSystem(HashMap<String, BankAccount> accounts, Scanner scanner) {
        this.accounts = accounts;
        this.scanner = scanner;
    }

    public static void main(String[] args) {

        HashMap<String, BankAccount> accounts = new HashMap<String, BankAccount>();
        Scanner scanner = new Scanner(System.in);

        BankSystem bankSystem = new BankSystem(accounts, scanner);

        int option;
        do {
            System.out.println("Seja bem vindo ao Banco");
            System.out.println("1. Login");
            System.out.println("2. Criar conta");
            System.out.println("3. Deletar conta");
            System.out.println("0. Sair");
            System.out.println("Digite a opção desejada:");

            option = scanner.nextInt();
            scanner.nextLine();


        } while (option != 0);

    }
}