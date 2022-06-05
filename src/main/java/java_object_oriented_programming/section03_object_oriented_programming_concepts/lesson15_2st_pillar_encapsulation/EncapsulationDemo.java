package java_object_oriented_programming.section03_object_oriented_programming_concepts.lesson15_2st_pillar_encapsulation;

import java.math.BigDecimal;

class Account {

    private BigDecimal balance;

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        if (balance.compareTo(new BigDecimal("0")) < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        } else {
            this.balance = balance;
        }
    }

}

public class EncapsulationDemo {

    public static void main(String[] args) {

        Account account = new Account();
        account.setBalance(new BigDecimal("123.12"));
        System.out.println(account.getBalance());

        account.setBalance(new BigDecimal("-0.12"));
        System.out.println(account.getBalance());


    }


}
