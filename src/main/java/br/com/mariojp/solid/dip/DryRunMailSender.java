package br.com.mariojp.solid.dip;

public class DryRunMailSender implements MailSender {
    public void send(String to, String subject, String body) {
        System.out.println("--- DRY RUN EMAIL ---");
        System.out.println("To: " + to);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
        System.out.println("---------------------");
    }
}
