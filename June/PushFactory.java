
package June;


public class PushFactory extends NotificationFactory{

    @Override
    Notification createNotification() {
        return new PushNotification();
    }
}
