package hello.core.singleton;

public class SingletonService {

    // 자기 자신 클래스를 내부에 인스턴스 생성(static 이라서 공유가 가능)
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService(){

    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }

    public static void main(String[] args) {

    }
}
