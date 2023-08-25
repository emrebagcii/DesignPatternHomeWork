
public class Main {
    public static void main(String[] args) {
        Socket socket=new Socket();

        Fridge fridge=new Fridge();
        Dishwasher dishwasher=new Dishwasher();

        socket.giveElectric(fridge);
        socket.giveElectric(dishwasher);

        MobilePhone mobilePhone=new MobilePhone();
        ChargeAdapter adapter=new ChargeAdapter(mobilePhone);
        socket.giveElectric(adapter);

    }
}