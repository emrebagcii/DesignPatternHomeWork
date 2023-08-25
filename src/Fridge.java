public class Fridge implements IAppliance{
    int volt;

    public Fridge() {
        this.volt = 220;
    }

    @Override
    public int plugAndPlay() {
        System.out.println("Buzdolabı çalışıyor...");
        return volt;
    }
}
