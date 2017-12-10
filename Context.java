
public class Context {
	
	private String[][] C;
	public Context(String[][] C){
		this.C = C;
	}
	
	public int find(String variable){
		boolean found = true;
		int i = 0;
		int result = 0;
		while(found){
			if(this.C[i][0].equals(variable)){
				result = Integer.parseInt(this.C[i][1]);
				found = false;
				
			}
			i++;
		}
		return result;
	}

}
