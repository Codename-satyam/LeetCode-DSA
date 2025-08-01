import java.util.Stack;
class Spanner{
    Stack<Integer> stack = new Stack<>();
    public void StockSpanner(){
        stack = new Stack<>();
    }
    public int next(int price) {
        int span=1;
        while(!stack.isEmpty() && stack.peek()>=price){
            span += stack.pop();
        }
        stack.push(span);
        return span;
    }
}