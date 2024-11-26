package templateMethod;

abstract class DocumentWorkflow {

    // 템플릿 메서드 : 문서 작성의 공통된 흐름을 정의한 메서드
    // 알고리즘의 흐름을 정의한 메서드이다. 이 메서드가 실행되면 알고리즘의 흐름이 동작한다.
    public final void createDocument() {

        gatherRequirements();
        writeContent();
        reviewDocument();
        publishDocument();
    }
    // 공통 단계 : 모든 서브클래스에서 동일한 메서드
    protected void gatherRequirements() {
        System.out.println("Gathering requirements for the document...");
    }
    protected void reviewDocument() {
        System.out.println("Reviewing the document...");

    }
    // 추상 메서드: 서브클래스에서 구체적으로 구현해야 함
    protected abstract void writeContent();

    protected abstract void publishDocument();
}
