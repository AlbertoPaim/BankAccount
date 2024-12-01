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

    public void createAccount() {
        System.out.println("digite seu nome:");
        String name = scanner.nextLine();

        System.out.println("digite seu endereço:");
        String address = scanner.nextLine();

        System.out.println("digite uma senha");
        String password = scanner.nextLine();

        System.out.println("Valor do deposito inicial?:");
        Integer balance = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite 1 para criar conta pessoa física e 2 para pessoa jurídica");
        int tipoConta = scanner.nextInt();
        scanner.nextLine();

        if (tipoConta == 1) {
            System.out.println("Digite seu cpf");
            String cpf = scanner.nextLine();
            PersonalAccount personalAccount = new PersonalAccount(name, address, balance, password, cpf);
            accounts.put(cpf, personalAccount);
            System.out.println("Conta criada com sucesso!");
        } else if (tipoConta == 2) {
            System.out.println("Digite seu cnpj");
            String cnpj = scanner.nextLine();
            BusinessAccount businessAccount = new BusinessAccount(name, address, balance, password, cnpj);
            accounts.put(cnpj, businessAccount);
            System.out.println("Conta criada com sucesso!");

        } else {
            System.out.println("Dados inválidos");
        }

    }

    public void login(String identifier, String password) {
    if(accounts.containsKey(identifier)){
    BankAccount bankAccount = accounts.get(identifier);
    boolean matchedPassword = bankAccount.verifyPassword(identifier);




    } else {
        System.out.println("Conta não encontrada");
    }
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

            if (option == 0) {
                System.out.println("Saindo...");
            } else if (option == 1) {

            } else if (option == 2) {

            } else {
                System.out.println("Resposta inválida");
            }
        } while (option != 0);

    }
}