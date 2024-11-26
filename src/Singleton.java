
public class Singleton {

    // 정적 참조 변수(싱글턴 객체를 담을 변수)
    private static Singleton singletonObj;

    // private 생성자
    private Singleton() {

    }

    // 인스턴스를 생성하거나 반환하는 메서드
    public static Singleton getInstance() {
        if (singletonObj == null) {
            singletonObj = new Singleton();
            System.out.println("지연초기화 객체를 최초로 사용하여 객체를 생성한다.");
        }

        System.out.println("생성된 객체를 반환한다.");
        return singletonObj;
    }

}
