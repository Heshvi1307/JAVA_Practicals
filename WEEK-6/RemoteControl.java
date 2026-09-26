class RemoteControl
{
    public static void main(String[] args)
    {
        Switchable[] devices = {new Fan(), new Light()};

        for(Switchable device : devices)
        {
            device.toggle();
        }

        Permission per = new Permission()      // anonymous class
        {
            public boolean switchon(Switchable device, int hour)
            {
                System.out.println("Checking permission for " 
                                   + device.getClass().getSimpleName() 
                                   + " at " + hour + ":00");

                if(hour >= 6 && hour <= 12)
                {
                    System.out.println(device.getClass().getSimpleName() 
                                       + " can be switched ON at " + hour + ":00");
                    return true;
                }
                else
                {
                    System.out.println(device.getClass().getSimpleName() 
                                       + " cannot be switched ON at " + hour + ":00");
                    return false;
                }
            }
        };

        System.out.println(per.switchon(new Fan(), 7));
        System.out.println(per.switchon(new Light(), 13));

        // Lambda expression
        Permission per2 = (device, hour) -> 
        {
            if(hour >= 6 && hour <= 12)
            {
                System.out.println(device.getClass().getSimpleName() 
                                   + " can be switched ON at " + hour + ":00");
                return true;
            }
            else
            {
                System.out.println(device.getClass().getSimpleName() 
                                   + " cannot be switched ON at " + hour + ":00");
                return false;
            }
        };

        System.out.println(per2.switchon(new Fan(), 7));
        System.out.println(per2.switchon(new Light(), 13));
    }
}

interface Switchable
{
    void on();
    void off();

    default void toggle()
    {
        on();
    }
}

class Fan implements Switchable
{
    public void on()
    {
        System.out.println("Fan is on.");
    }

    public void off()
    {
        System.out.println("Fan is off.");
    }
}

class Light implements Switchable
{
    public void on()
    {
        System.out.println("Light is on.");
    }

    public void off()
    {
        System.out.println("Light is off.");
    }
}

@FunctionalInterface
interface Permission
{
    boolean switchon(Switchable device, int hour);
}


