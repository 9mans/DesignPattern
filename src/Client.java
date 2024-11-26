public class Client {

    public static void main(String[] args) {

        // 싱글턴 객체를 불러오는 메서드 사용
        // 최초 사용되는 객체는 객체를 생성하기에 객체가 생성된다고 출력된다.
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();

        // 같은 인스턴스를 참조하고 있다.
        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton3);
        
        System.out.println(singleton2 == singleton3);
        System.out.println(singleton1 == singleton3);


    }
}
