public class StrategyPatternDemo {
    public static void main(String[] args) {
    Context context1 = new Context(new OperationAdd());
    Context context2 = new Context(new OperationSubstruct());
    Context context3 = new Context(new OperationMultiply());
    Context context4 = new Context (new OperationDivide());
    System.out.println(context1.executeStrategy(5,4));
    System.out.println(context2.executeStrategy(5,4));
    System.out.println(context3.executeStrategy(5,4));
    System.out.println(context4.executeStrategy(5,4));
    }
    }
    
    class Context {
    private IStrategy strategy;
    public Context(IStrategy strategy){
    this.strategy = strategy;
    }
    public int executeStrategy(int num1, int num2){
    return strategy.doOperation(num1,num2);
    }
    }
    
    interface IStrategy {
    int doOperation(int a, int b);
    }
    
    class OperationAdd implements IStrategy {
    
    @Override
    public int doOperation(int a, int b) {
    return a+b;
    }
    }
    
    class OperationSubstruct implements IStrategy {
    
    @Override
    public int doOperation(int a, int b) {
    return a-b;
    }
    }
    
    class OperationMultiply implements IStrategy{
    
    @Override
    public int doOperation(int a, int b){
    return a*b;
    
    }
    
    }
    
    class OperationDivide implements IStrategy{
    
    @Override
    public int doOperation(int a, int b){
    return a/b;    
    } 
    }