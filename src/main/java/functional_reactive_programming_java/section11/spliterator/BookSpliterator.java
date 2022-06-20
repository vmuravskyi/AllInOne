package functional_reactive_programming_java.section11.spliterator;

import java.util.Spliterator;
import java.util.function.Consumer;

public class BookSpliterator implements Spliterator<Book> {

    private final Spliterator<String> baseSpliterator;
    private String name;
    private String author;
    private String genre;
    private double rating;

    public BookSpliterator(Spliterator<String> baseSpliterator) {
	this.baseSpliterator = baseSpliterator;
    }

    @Override
    public boolean tryAdvance(Consumer<? super Book> action) {
	if (this.baseSpliterator.tryAdvance(name -> this.name = name)
		&& this.baseSpliterator.tryAdvance(author -> this.author = author)
		&& this.baseSpliterator.tryAdvance(genre -> this.genre = genre)
		&& this.baseSpliterator.tryAdvance(rating -> this.rating = Double.parseDouble(rating))) {
	    action.accept(new Book(this.name, this.author, this.genre, this.rating));
	    return true;
	}
	return false;
    }

    @Override
    public Spliterator<Book> trySplit() {
	return null;
    }

    @Override
    public long estimateSize() {
	return baseSpliterator.estimateSize() / 4;
    }

    @Override
    public int characteristics() {
	return baseSpliterator.characteristics();
    }

}
