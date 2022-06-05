package java_object_oriented_programming.section03_object_oriented_programming_concepts.lesson11_data_hiding;

import java.math.BigDecimal;

public class BankAccount {
    private BigDecimal balance = new BigDecimal(100_000);
    private String username = "user";
    private String password = "password";

    public BigDecimal getBalance(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password)) {
            return balance;
        } else {
            throw new IllegalArgumentException("Incorrect username or password");
        }
    }

}
