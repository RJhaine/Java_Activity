uthor User
 */
public class datas implements Operations {
    public int num1;
    public  int num2;

//    Constructor
    
    public datas() {
    }

    public datas(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    

    @Override
    public void add() {
        int answer  = num1 + num2;
        System.out.println(answer);
    }

    @Override
    public void subtract() {
        int answer  = num1 - num2;
        System.out.println(answer);
    }
    
    
    
}
