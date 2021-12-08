import java.util.Stack;

public class Calculator{//계산기 기능을 수행할 class
    private Stack<Double> history = new Stack<>();//계산 내역을 저장해 둘 arraylist

    //밑의 사칙연산들은 입력값을 history의 top과 연산한 값을 top에 push함
    
    public Stack<Double> sum(Double input) {//덧셈
        history.push(history.peek() + input);
        
        return history;
    }

    public Stack<Double> sub(Double input) {//뺄셈
        history.push(history.peek() - input);
        
        return history;
    }

    public Stack<Double> mul(Double input) {//곱셈
        history.push(history.peek() * input);
        
        return history;
    }

    public Stack<Double> div(Double input) {//나눗셈
        history.push(history.peek() / input);
        
        return history;
    }
    
    public void show() {//top값 출력
        System.out.println(history.peek());
    }

    public Stack<Double> push(Double a) {//입력받은 수 push
        history.push(a);
        
        return history;
    }
    
    public Stack<Double> pop() {//pop 수행
        history.pop();

        return history;
    }

    public Stack<Double> clear() {//clear 수행
        history.clear();

        return history;
    }
}