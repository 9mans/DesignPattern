package templateMethod;

public class Client {

    public static void main(String[] args) {

        System.out.println("리포트");
        DocumentWorkflow report = new ReportWorkflow();
        report.createDocument();

        System.out.println("----------------------------------");

        System.out.println("뉴스레터");
        DocumentWorkflow newsletter = new NewsletterWorkflow();
        newsletter.createDocument();
    }
}
