package templateMethod;

public class ReportWorkflow extends DocumentWorkflow {
    // 리포트의 추상메서드 재정의
    @Override
    protected void writeContent() {
        System.out.println("Writing detailed report content...");
    }
    // 리포트의 추상메서드 재정의
    @Override
    protected void publishDocument() {
        System.out.println("Publishing the report as a PDF file.");
    }
}
