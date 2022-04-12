package toto.com.example;

/*
Controller의 종류가 여러개더라.
초기화 - 같은코드
실행  - 다른 코드?
마무리 - 같은 코드

 */
public abstract class Controller {
    //final을 통해 오버라이딩 금지
    //protected 같은 package이거나 상속일떄 접근가능
    protected final void init(){
        System.out.println("초기화 하는코드");
     

    }

    protected final void close(){
        System.out.println("마무리ㅐ하는코드");
    }
    protected abstract void run(); //매번다른 코드


    //내가 가지고 있는 메소드를 호출한다
    //어떤 순서를 가지고 있다. 이런 메소드를 템플릿 메소드라고 한다.
    public void execute(){
        this.init();   //this. 생략가능
        this.run();
        this.close();
    }


    //초기화
    //실행
    //마무리
}
