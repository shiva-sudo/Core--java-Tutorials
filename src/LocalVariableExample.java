/*
local variables are declared inside a method of the class.
Their scope is limited to the method which means that You can’t change their
values and access them outside of the method.
*/
public class LocalVariableExample {
    public int  sum(int n){
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        LocalVariableExample obj = new LocalVariableExample();
        int sum = obj.sum(10);
        System.out.println("Sum of first 10 natural numbers is: " + sum);
    }
}

