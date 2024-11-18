package SOLID_Principle.DIP.With;

public class Main {
    public static void main(String[] args) {
        NotificationService emailService = new EmailService();
        NotificationService smsService = new SMSService();

        // Inject the dependency
        NotificationManager emailManager = new NotificationManager(emailService);
        emailManager.notify("Hello via Email!");

        NotificationManager smsManager = new NotificationManager(smsService);
        smsManager.notify("Hello via SMS!");
    }
}
