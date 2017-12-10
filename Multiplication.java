
public class Multiplication extends Operation {
	
	public Multiplication(Expression fg, Expression fd){
		super();
		this.fd = fd;
		this.fg = fg;
	}

	public int evaluate(Context C) {
		return fg.evaluate(C) * fd.evaluate(C);
	}
	
	public String op(){
		return "*";
	}
	public Object accept(Visitor v) {
		return v.visitor(this);
	}

}
