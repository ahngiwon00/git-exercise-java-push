package Day1007.bigfile;

public class PopulationMoveReview {
    //인구이동 클래스
    private int fromSido;
    private int toSido;
    //생성자 생성(매개변수로는 전출도시,전입도시)
    public PopulationMoveReview(int fromSido, int toSido) {
        this.fromSido = fromSido;
        this.toSido = toSido;
    }
    //생성자 오버로딩
    //PopulationMove parse메소드를 실행하면 return 값이 String을 받기 위해 오버로딩을 함
    public PopulationMoveReview(String fromSido, String toSido) {
        this.fromSido = Integer.parseInt(fromSido);
        this.toSido = Integer.parseInt(toSido);
    }

    //fromsido,tosido를 쓰기 위해 getter 사용
    public int getFromSido() {
        return fromSido;
    }

    public int getToSido() {
        return toSido;
    }
}
