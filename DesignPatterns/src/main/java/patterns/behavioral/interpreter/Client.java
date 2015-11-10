package patterns.behavioral.interpreter;

/**
 * 
 * INTERPRETER
 * 
 * recognizeable by behavioral methods returning a structurally different instance/type of the given instance/type; 
 * note that parsing/formatting is not part of the pattern, determining the pattern and how to apply it is
 * 
 * - 由非终结符表达式和终结符表达式实例构成的一棵抽象语法树
 * 
 * @author LSK
 *
 */
public class Client {

	
	public static void main(String[] args) {
		
		// 构建表达式(z and (x or x))
		VarExp var1 = new VarExp("x");
		VarExp var2 = new VarExp("y");
		VarExp var3 = new VarExp("z");
		Exp exp = new AndExp(new OrExp(var1, var2), var3);
		
		// 初始化上下文环境变量
		Context ctx = new Context();
		ctx.put("x", false);
		ctx.put("y", true);
		ctx.put("z", true);
		
		// 解析表达式
		boolean result = exp.interpret(ctx);
		System.out.printf("Intepret the expression result is: %s.", result);

	}

}

class VarExp implements Exp {
	
	private String name;
	
	public VarExp(String name) {
		this.name = name;
	}
	
	@Override
	public boolean interpret(Context context) {
		return context.get(name);
	}

}

class AndExp implements Exp {
	
	private Exp var1;
	private Exp var2;
	
	public AndExp(Exp var1, Exp var2) {
		this.var1 = var1;
		this.var2 = var2;
	}

	@Override
	public boolean interpret(Context context) {
		return this.var1.interpret(context) && this.var2.interpret(context);
	}
	
}

class OrExp implements Exp {

	private Exp var1;
	private Exp var2;

	public OrExp(Exp var1, Exp var2) {
		this.var1 = var1;
		this.var2 = var2;
	}

	@Override
	public boolean interpret(Context context) {
		return this.var1.interpret(context) || this.var2.interpret(context);
	}

}

