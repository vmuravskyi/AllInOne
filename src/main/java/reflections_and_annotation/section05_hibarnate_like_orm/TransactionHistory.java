package reflections_and_annotation.section05_hibarnate_like_orm;

import reflections_and_annotation.section05_hibarnate_like_orm.annotations.Column;
import reflections_and_annotation.section05_hibarnate_like_orm.annotations.PrimaryKey;

public class TransactionHistory {

    @PrimaryKey
    long transactionId;

    @Column
    int accountNumber;

    @Column
    String name;

    @Column
    String transactionType;

    @Column
    double amount;

    public TransactionHistory(int accountNumber, String name, String transactionType, double amount) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    public TransactionHistory() {
        // default
    }

    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "TransactionHistory{" +
                "transactionId=" + transactionId +
                ", accountNumber=" + accountNumber +
                ", name='" + name + '\'' +
                ", transactionType='" + transactionType + '\'' +
                ", amount=" + amount +
                '}';
    }

}
