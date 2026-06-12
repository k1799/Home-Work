
package June;


public class SMSFactory extends NotificationFactory{

    @Override
    Notification createNotification() {
    return new SMSNotification();
    }
    
}
