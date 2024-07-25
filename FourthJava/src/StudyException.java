public class StudyException {
    public static void main(String[] args) {
        OurClass ourClass = new OurClass();

        // try ~ catch ~ finally 구문
        // try : 시도하다
        // catch : 잡다
        // finally : 마침내

        // 일단 시도하고 그리고, 예외가 발생하면 그걸 잡아!!(catch),
        // 그리고, 정상적으로 수행되든, 예외가 발생하든 결국, 마침내 수행돼야 하는 로직을 'finally' 수행

        try {
            // 일단 시도

            // 메서드 뒤에 throws가 붙은걸 실행하는 경우
            // ourClass.thisMethodIsDangerous();
            // 시도하는 곳 안에서 예외를 발생시키는 경우
            throw new OurBadException();
        } catch (OurBadException e) {
            // 예외상황을 캐치해서 실행되는 곳
            // Exception , Error 등등
            System.out.println(e.getMessage());
        } finally {
            // 위 로직이 다 끝나도 여기는 무조건 수행
            System.out.println("우리는 방금 예외를 handling 했습니다!");
        }

    }
}