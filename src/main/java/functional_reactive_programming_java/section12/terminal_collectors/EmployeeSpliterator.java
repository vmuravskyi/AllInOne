package functional_reactive_programming_java.section12.terminal_collectors;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Spliterator;
import java.util.function.Consumer;

public class EmployeeSpliterator implements Spliterator<Employee> {

    private final Spliterator<String> wordSpliterator;
    private int id;
    private String name;
    private char gender;
    private Date dob;
    private String city;
    private String designation;
    private Date joiningDate;
    private double salary;

    public EmployeeSpliterator(Spliterator<String> wordSpliterator) {
        this.wordSpliterator = wordSpliterator;
    }

    @Override
    public boolean tryAdvance(Consumer<? super Employee> action) {
        if (this.wordSpliterator.tryAdvance(id -> this.id = Integer.parseInt(id))
                && this.wordSpliterator.tryAdvance(name -> this.name = name)
                && this.wordSpliterator.tryAdvance(gender -> this.gender = gender.charAt(0))
                && this.wordSpliterator.tryAdvance(dob -> {
            try {
                this.dob = new SimpleDateFormat("yyyy-MM-dd").parse(dob);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        })
                && this.wordSpliterator.tryAdvance(city -> this.city = city)
                && this.wordSpliterator.tryAdvance(designation -> this.designation = designation)
                && this.wordSpliterator.tryAdvance(joiningDate -> {
            try {
                this.joiningDate = new SimpleDateFormat("yyyy-MM-dd").parse(joiningDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        })
                && this.wordSpliterator.tryAdvance(salary -> this.salary = Double.parseDouble(salary))
        ) {
            action.accept(new Employee(this.id,
                    this.name,
                    this.gender,
                    this.dob,
                    this.city,
                    this.designation,
                    this.joiningDate,
                    this.salary
            ));
            return true;
        }
        return false;
    }

    @Override
    public Spliterator<Employee> trySplit() {
        return null;
    }

    @Override
    public long estimateSize() {
        return wordSpliterator.estimateSize() / 8;
    }

    @Override
    public int characteristics() {
        return wordSpliterator.characteristics();
    }
}
