package SOLID_Principle.DIP.Without;

class NotificationManager {
    private EmailService emailService;
    private SMSService smsService;

    public NotificationManager() {
        this.emailService = new EmailService();
        this.smsService = new SMSService();
    }

    public void sendNotification(String message, String type) {
        if (type.equals("email")) {
            emailService.sendEmail(message);
        } else if (type.equals("sms")) {
            smsService.sendSMS(message);
        }
    }
}
