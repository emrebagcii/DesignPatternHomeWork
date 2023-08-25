public class Socket {
    public void giveElectric(IAppliance iAppliance) {
        int volt = iAppliance.plugAndPlay();
        System.out.println("Prizden " + volt + " volt elektrik alınıyor...");
    }
}
