import java.util.NoSuchElementException;

public class Variable implements Expression{

	private String v;
	public Variable(String v){
		this.v=v;
	}
	
	public int evaluate(Context C){
		int result = C.find(this.v);
		return result;
	}
		
	
	public String toString(){
		String result = new String();
		result = String.valueOf(this.v);
		return result;
	}
	
	public NodeIterator getPostfixe(){
		return new NodeIterator(){
		boolean first = true;
		public boolean hasNext(){return first;}
		public Expression next() throws NoSuchElementException{
			if(!first){throw new NoSuchElementException("Pb");}
			first = false;
			return Variable.this;
		}
	};
	}
	public Object accept(Visitor v) {
		return v.visitor(this);
	}
}
