package service;

public class EmailNotificationThread extends Thread {
    private String email;
    private String message;

    public EmailNotificationThread(String email, String message) {
        this.email = email;
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println("Sending email to: " + email);
        try {
            Thread.sleep(2000); // simulate delay
            System.out.println("Email sent successfully with message: " + message);
        } catch (InterruptedException e) {
            System.out.println("Email sending interrupted.");
        }
    }
}
