
public interface Visitor {
	Object visitor(Variable v);
	Object visitor(IntegerCst c);
	Object visitor(Addition p);
	Object visitor(Substraction m);
	Object visitor(Multiplication f);
	Object visitor(Division d);
}
