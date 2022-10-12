package Day1012.PlusMultiGuGu;

public class Calculator2 {
    public void printGugudanTemplate(int dan,String operator, Operation operation){
        for(int i=1; i<10; i++){
            System.out.printf("%d %s %d = %d\n",dan,operator,i,operation.operation(dan,i));
        }
    }
    public void printPlusGugu(int dan){

        printGugudanTemplate(dan, "+", new Operation() {
            @Override
            public int operation(int a, int b) {
                return a+b;
            }
        });

    }

    public void printMuitiGugu(int dan){

        printGugudanTemplate(dan, "*", new Operation() {
            @Override
            public int operation(int a, int b) {
                return a*b;
            }
        });

    }


    public static void main(String[] args) {
        Calculator2 calculator2 = new Calculator2();
        for(int i=2; i<10; i++){
            calculator2.printMuitiGugu(i);
        }
    }
}
