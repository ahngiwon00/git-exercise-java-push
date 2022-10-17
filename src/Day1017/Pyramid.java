package Day1017;

public class Pyramid {
    public void printStar(int n) {
        for(int i =1; i<=n; i++){
            for (int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }

            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        Pyramid pyramid =new Pyramid();
        pyramid.printStar(5);

    }
}
