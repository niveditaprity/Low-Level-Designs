package SOLID_Principle.DIP.With;

class NotificationManager {
    private NotificationService notificationService;

    // Dependency Injection through Constructor
    public NotificationManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notify(String message) {
        notificationService.sendNotification(message);
    }
}
