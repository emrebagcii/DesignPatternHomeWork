public class MobilePhone implements IMobilePhone{
    int volt;

    public MobilePhone() {
        this.volt = 15;
    }

    @Override
    public int takeCharge() {
        System.out.println("Telefon şarj cihazı çalışıyor...");
        return volt;
    }
}
