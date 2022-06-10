package reflections_and_annotation.section05_hibarnate_like_orm;

public class Application {

    public static void main(String[] args) throws Exception {

        TransactionHistory volodymyr = new TransactionHistory(15331, "Volodymyr", "Credit", 10000);
        TransactionHistory john = new TransactionHistory(12465, "John", "Credit", 7000);
        TransactionHistory michael = new TransactionHistory(54412, "Michael", "Credit", 2000);
        TransactionHistory jack = new TransactionHistory(43255, "Jack", "Credit", 4250);

        Hibernate<TransactionHistory> hibernate = Hibernate.getConnection();

        hibernate.write(volodymyr);

    }

}
