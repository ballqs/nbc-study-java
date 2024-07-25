class OurClass {
    private final Boolean just = true;



    // 신규 문법 throws!
    // 메서드 이름 뒤에 붙어 이 메서드가 어떠한 예외사항을 던질 수 있는지 알려주는 예약어
    public void thisMethodIsDangerous() throws OurBadException {
        if (just) {
            // 신규 문법 throw!
            // 메서드 안에서, 실제로 예외 객체를 던질 때 사용하는 예약어
            throw new OurBadException();
        }
    }
}