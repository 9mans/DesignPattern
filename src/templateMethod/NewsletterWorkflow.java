package templateMethod;

public class NewsletterWorkflow extends DocumentWorkflow {

    // 뉴스레터의 추상메서드 재정의
    @Override
    protected void writeContent() {
        System.out.println("Writing concise and engaging newsletter content...");
    }
    // 뉴스레터의 추상메서드 재정의
    @Override
    protected void publishDocument() {
        System.out.println("Publishing the newsletter to the website.");
    }
}
