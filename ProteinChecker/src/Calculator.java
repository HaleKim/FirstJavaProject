import java.util.Stack;

public class Calculator{//계산기 기능을 수행할 class
    private Stack<Double> history = new Stack<>();//계산 내역을 저장해 둘 arraylist
    
    public Stack sum(Double input) {//덧셈
        history.push(history.peek() + input);
        
        return history;
    }

    public Stack sub(Double input) {//뺄셈
        history.push(history.peek() - input);
        
        return history;
    }

    public Stack mul(Double input) {//곱셈
        history.push(history.peek() * input);
        
        return history;
    }

    public Stack div(Double input) {//나눗셈
        history.push(history.peek() / input);
        
        return history;
    }
    
    public void show() {//top값 출력
        System.out.println(history.peek());
    }

    public Stack push(Double a) {//입력받은 수 push
        history.push(a);
        
        return history;
    }
    
    public Stack pop() {//pop 수행
        history.pop();

        return history;
    }
}