package cogent_batch65;
import gl.itp.hyd65.cs65.Travis.*;

public class GreeterTest {

	public static void main(String[] args) {
		
		if(args.length==0) {
			System.out.println("Please enter command line arguments");
		}else {
			for(int i=0;i<args.length;i++) {
				Greeter g=new Greeter(args[i]);
				System.out.println(g.sayHello());				
			}
			Advisor a=new Advisor();
			System.out.println(a.getAdvice());
			
			for(int j=args.length-1;j>-1;j--) {
				Greeter g=new Greeter(args[j]);
				System.out.println(g.sayGoodbye());
			}
			
		}
	}

}
