
package June;


public class EmailFactory extends NotificationFactory{

    @Override
    Notification createNotification() {
    return new EmailNotification();
    }
    
}
