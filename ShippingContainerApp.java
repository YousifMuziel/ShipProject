import java.util.ArrayList;
import java.util.Scanner;

public class ShippingContainerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ShipContainer> containers = new ArrayList<>();

        while (true) {
            System.out.println("Choose type of details entering method:");
            System.out.println("M)anual container entry.");
            System.out.println("R)FID container entry.");
            System.out.println("P)rint Shipping container's details.");
            System.out.println("Q)uit.");
            System.out.print("Choice: ");
            String choice = scanner.nextLine().toLowerCase();

            if (choice.equals("m")) {
                System.out.print("Enter the container contents: ");
                String contents = scanner.nextLine();
                containers.add(new ManualContentList(containers.size() + 1));
                ((ManualContentList) containers.get(containers.size() - 1)).setContents(contents);
            } else if (choice.equals("r")) {
                ShippingContainerRFID container = new ShippingContainerRFID(containers.size() + 1);
                do {
                    System.out.print("Scan an RFID (Enter the container contents): ");
                    String item = scanner.nextLine();
                    container.setContents(item);
                    System.out.print("Would you like to scan another RFID? (Y/N): ");
                    choice = scanner.nextLine().toLowerCase();
                } while (choice.equals("y"));
                containers.add(container);
            } else if (choice.equals("p")) {
                System.out.println("****** Shipping Container's details ******");
                for (int i = 0; i < containers.size(); i++) {
                    ShipContainer container = containers.get(i);
                    System.out.println("Container " + container.getContainerID() + " contains " +
                            container.containerContentList());
                }
            } else if (choice.equals("q")) {
                break;
            } else {
                System.out.println("Invalid option. Please enter a valid choice.");
            }
        }
    }
}
