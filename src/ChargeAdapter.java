public class ChargeAdapter implements IAppliance{
    private MobilePhone phone;

    public ChargeAdapter(MobilePhone phone) {
        this.phone = phone;
    }

    @Override
    public int plugAndPlay() {
        return phone.takeCharge();
    }
}
