package Day1012;

public class Calculator2 {
    public void multi(){
        for(int i=2; i<10; i++){
            for(int j=1;j<10; j++){
                System.out.println(i+"*"+j+"="+i*j);
            }
        }
    }

    public static void main(String[] args) {
        Calculator2 calculator2 = new Calculator2();
        calculator2.multi();
    }
}
