package SOLID_Principle.DIP.With;

class SMSService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("SMS sent: " + message);
    }
}
