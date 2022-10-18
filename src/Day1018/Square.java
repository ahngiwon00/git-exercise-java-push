package Day1018;

public class Square {
    public void printStar(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("*");
            }
            System.out.printf("\n");
        }
    }
    public static void main(String[] args) {
        Square square = new Square();
        square.printStar(3);

    }
}
