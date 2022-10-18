package Day1018;

public class Rectangle {
    public void printStar(int x,int y){
        for(int i=0; i<y; i++){ //세로
            for(int j=0; j<x; j++){  //가로
                System.out.print("*");
            }
            System.out.printf("\n");
        }
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.printStar(3,4);  //가로가 3 세로가 4

    }
}
