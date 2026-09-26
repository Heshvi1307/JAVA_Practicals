class Notification
    {
        public static void main(String[] args)
        {
            Notifier email = (message)->System.out.println("Email : " + message); //lamda expressions
            Notifier sms = (message)->System.out.println("SMS : " + message);
            Notifier urgmail = new UrgentNotifier(email); 
            Notifier[] senders = {urgmail,sms};
            String message = "Java practicals is ongoing currently in Lab-01.";
            for(Notifier sender:senders)
                {
                    sender.send(message);
                    if(sender instanceof Urgent)
                    {
                        System.out.println("This sender is Urgent...");
                        sender.send(message);
                    }
                }
        }
    }
@FunctionalInterface
    interface Notifier
    {
        void send(String message);
    }
interface Urgent    //marker interface
    {
    }
class UrgentNotifier implements Notifier,Urgent
    {
        private Notifier notify;
        UrgentNotifier(Notifier notify)
        {
            this.notify=notify;
        }
        public void send(String message)
        {
            notify.send(message);
        }
    }






