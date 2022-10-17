package Day1017;

public class RightTriangle {

    private char a;

    public RightTriangle(){

    }

    public RightTriangle(char a) {
        this.a = a;
    }

    public void printStar(int n) {
        for(int i =1; i<=n; i++){
            for (int j=0; j<i; j++)
                System.out.print(a);
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        RightTriangle rt = new RightTriangle('@');

        int n=10;
        rt.printStar(n);

    }
}
