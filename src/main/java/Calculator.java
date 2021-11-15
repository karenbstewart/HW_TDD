public class Calculator {

    public Calculator(){
    }

    public int add(int firstNum, int secondNum){
        int answer = firstNum + secondNum;
        return answer;
    }

    public int subtract(int firstNum, int secondNum) {
        int answer = firstNum - secondNum;
        return answer;
    }

    public int multiply(int firstNum, int secondNum) {
        int answer = firstNum * secondNum;
        return answer;
    }

    public int divide(double firstNum, double secondNum) {
        double answer = firstNum / secondNum;
        return (int) answer;
    }
}
