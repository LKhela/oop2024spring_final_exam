package finalexam.task4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LogisticsCompany implements LegalEntity {
    private String address;
    private String vatNumber;
    private List<Shipment> shipments = new ArrayList<>();

    public LogisticsCompany(String address, String vatNumber) {
        this.address = address;
        this.vatNumber = vatNumber;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getVatNumber() {
        return vatNumber;
    }

    public void addShipment(Shipment shipment) {
        shipments.add(shipment);
    }

    public boolean deleteShipment(Shipment shipment) {
        return shipments.remove(shipment);
    }

    public void printShipments() {
        System.out.println("Shipment List:");
        for (Shipment shipment : shipments) {
            System.out.println(shipment);
        }
    }

    public void saveShipmentsToFile(String filename) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(shipments);
        }
    }

    public void loadShipmentsFromFile(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            shipments = (List<Shipment>) ois.readObject();
        }
    }
}
