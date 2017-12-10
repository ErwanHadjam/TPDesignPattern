
public interface Expression {
	int evaluate(Context C);	
	String toString();
	NodeIterator getPostfixe();
	Object accept(Visitor v);
}
