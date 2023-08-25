public class Dishwasher implements IAppliance{
    int volt;

    public Dishwasher() {
        this.volt = 220;
    }

    @Override
    public int plugAndPlay() {
        System.out.println("Bulaşık makinesi çalışıyor...");
        return volt;
    }
}
