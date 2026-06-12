
package June;


public class MainNotificationFactoryMethod {
    public static void main(String[] args) {
        NotificationFactory emailFactory=new EmailFactory();
        Notification email=emailFactory.createNotification();
        email.sendMessage();
        
        NotificationFactory smsFactory=new SMSFactory();
        Notification sms=smsFactory.createNotification();
        sms.sendMessage();
        
        NotificationFactory pushFactory=new PushFactory();
        Notification push=pushFactory.createNotification();
        push.sendMessage();
    }
  
}
