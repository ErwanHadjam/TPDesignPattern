import java.util.NoSuchElementException;

public abstract class Operation implements Expression {
	
	public Expression fg;
	public Expression fd;
	public Visitor v;
	
	
	public abstract int evaluate(Context C);
	
	public String toString(){
		return "(" + fg.toString() + op() + fd.toString() + ")";
	}
	
	public Expression getfd() {
		return this.fd;
	}
	
	public Expression getfg() {
		return this.fg;
	}
	
	abstract String op();
	
	public NodeIterator getPostfixe(){
		return new NodeIterator(){
		boolean first = true;
		private NodeIterator filsgauche = Operation.this.fg.getPostfixe();
		private NodeIterator filsdroit = Operation.this.fd.getPostfixe();
		public boolean hasNext(){return first;}
		public Expression next() throws NoSuchElementException{
			if(first){filsgauche.next();}
			if(first){filsdroit.next();}
			else{throw new NoSuchElementException("Pb2");}
			first = false;
			return Operation.this;
			
		}
	};
	}
}
