
public class EvaluateVisit implements Visitor{
	private Context Co;
	
	public EvaluateVisit(Context c){
		this.Co=c;
		
	}
	
	public Object visitor(Variable v){
		int result = Co.find("v");
		return result;
	}
	public Object visitor(IntegerCst c){
		return c;
	}
	public Object visitor(Addition p){
		return (int) p.getfg().accept(this) + (int) p.getfd().accept(this);
	}
	public Object visitor(Substraction m){
		return (int) m.getfg().accept(this) - (int) m.getfd().accept(this);
	}
	public Object visitor(Multiplication f){
		return (int) f.getfg().accept(this) * (int) f.getfd().accept(this);
	}
	public Object visitor(Division d){
		return (int) d.getfg().accept(this) / (int) d.getfd().accept(this);
	}

}
