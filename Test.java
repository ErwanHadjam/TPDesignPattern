
public class Test{
	public static void main(String args[]){
		//Context:x=1,y=2
		String[][] Cont = {{"x","5"},{"y","2"}};
		Context C = new Context(Cont);
		
		IntegerCst v9 = new IntegerCst(9);
		Variable v5 = new Variable("x");
		Addition Addition = new Addition(v5,v9);
		IntegerCst v5b = new IntegerCst(5);
		IntegerCst v3 = new IntegerCst(3);
		Substraction Substraction = new Substraction(v5b,v3);
		Division Division = new Division(Addition,Substraction);
		
		NodeIterator n = Division.getPostfixe();
		while(n.hasNext()){
			System.out.println(n.next().toString());
		}

		
		/*System.out.println("Addition.toString() = "+ Addition.toString());
		System.out.println("Addition.evaluate() = "+ Addition.evaluate(C));
		System.out.println("Substraction.toString() = "+ Substraction.toString());
		System.out.println("Substraction.evaluate() = "+ Substraction.evaluate(C));
		System.out.println("Division.toString() = "+ Division.toString());
		System.out.println("Division.evaluate() = "+ Division.evaluate(C));*/
		int expectValue = 7;
		if(expectValue!=Division.evaluate(C)){
			System.out.println("Expr failed");
		}
		else{System.out.println("Expr ok");
		
		}
		
		Visitor v = new ToStringVisit();
		String res = (String) Division.accept(v);
		System.out.println(Division.toString());

	}
}
