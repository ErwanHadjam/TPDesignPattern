
public class Substraction extends Operation {
	
	public Substraction(Expression fg, Expression fd){
		super();
		this.fd = fd;
		this.fg = fg;
	}

	public int evaluate(Context C) {
		return fg.evaluate(C) - fd.evaluate(C);
	}
	
	public String op(){
		return "-";
	}
	public Object accept(Visitor v) {
		return v.visitor(this);
	}

}
