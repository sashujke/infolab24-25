/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author Studente
 */
public class TestComputer {

    public static void main(String[] args) {
        PcFisso pcFisso = new PcFisso("HP", "EliteDesk", 16, 512, "Windows 10", "Mini Tower");
        Desktop desktop = new Desktop("Dell", "XPS", 32, 1024, "Windows 11", "Full Tower", "NVIDIA RTX 3080");
        Server server = new Server("IBM", "PowerEdge", 64, 2048, "Linux", "Rack", 8, true);
        PcPortatile pcPortatile = new PcPortatile("Apple", "MacBook Pro", 16, 512, "macOS", 1.4, 1.56, 35.8, 24.1, 16);
        Notebook notebook = new Notebook("Asus", "ZenBook", 8, 256, "Windows 11", 1.2, 1.49, 32.5, 22.6, 14);

        System.out.println(pcFisso);
        System.out.println(desktop);
        System.out.println(server);
        System.out.println(pcPortatile);
        System.out.println(notebook);
    }
}
