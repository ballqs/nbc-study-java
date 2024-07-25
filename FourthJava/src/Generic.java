
// 1.제네릭은 클래스 또는 메서드에 사용 가능!
// <>안에 들어가야 할 타입을 명시
public class Generic<T , U> extends GenericSample<Integer> {

    private T t;
    private U u;

    public T get() {
        return this.t;
    }

    public void set(T t) {
        this.t = t;
    }

    public static void main(String[] args){
        Generic<String , Integer> stringGeneric = new Generic<>();

        stringGeneric.set("Test");

        String str = stringGeneric.get();

        System.out.println(str);

        System.out.println(stringGeneric.calc(50));
    }

    // GenericSample<T> 꺽쇠안에 선언해놓은 데이터타입으로 오버라이딩해서 사용
    // 추상클래스로 해놓으면 더 편하게 가능할지도?
    @Override
    Integer calc(Integer integer) {
        Integer result = integer + 10;
        return result;
    }
}
