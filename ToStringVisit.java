
public class ToStringVisit implements Visitor{

	public Object visitor(Variable v) {
		String result = new String();
		result = String.valueOf(v);
		return result;
	}

	public Object visitor(IntegerCst c) {
		String result = new String();
		result = String.valueOf(c);
		return result;
	}
	
	public Object visitor(Addition p){
		return  p.getfg().accept(this)+ "" + p.getfd().accept(this) + "+";
	}
	public Object visitor(Substraction m){
		return  m.getfg().accept(this)+ "" + m.getfd().accept(this) + "-";
	}
	public Object visitor(Multiplication f){
		return  f.getfg().accept(this)+ "" + f.getfd().accept(this) + "*";
	}

	public Object visitor(Division d){
		return  d.getfg().accept(this)+ "" + d.getfd().accept(this) +"/";
	}

}
