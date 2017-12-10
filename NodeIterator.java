import java.util.NoSuchElementException;

public interface NodeIterator {
	public boolean hasNext();
	public Expression next() throws NoSuchElementException;
	}
