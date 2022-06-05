package java_object_oriented_programming.section03_object_oriented_programming_concepts.lesson11_data_hiding;

import java.math.BigDecimal;

public class AccessAccount {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        BigDecimal balance = bankAccount.getBalance("user", "password");
        System.out.println(balance);

    }

}
