import java.util.NoSuchElementException;

public class IntegerCst implements Expression{

	private int v;
	
	public IntegerCst(int v){
		this.v=v;
	}
	
	public int evaluate(Context C){
		return this.v;
	}
	
	public String toString(){
		String result = new String();
		result = Integer.toString(this.v);
		return result;
	}
	
	public NodeIterator getPostfixe(){
		return new NodeIterator(){
		boolean first = true;
		public boolean hasNext(){return first;}
		public Expression next() throws NoSuchElementException{
			if(!first){throw new NoSuchElementException("Pb");}
			first = false;
			return IntegerCst.this;
		}
	};
	}

	@Override
	public Object accept(Visitor v) {
		// TODO Auto-generated method stub
		return null;
	}
}
