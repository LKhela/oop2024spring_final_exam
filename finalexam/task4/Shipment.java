package finalexam.task4;

import java.io.Serializable;

public class Shipment implements Serializable {
    private static final long serialVersionUID = 1L;

    private String shipmentId;
    private String description;
    private double weight;

    public Shipment(String shipmentId, String description, double weight) {
        this.shipmentId = shipmentId;
        this.description = description;
        this.weight = weight;
    }

    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Shipment{" +
                "shipmentId='" + shipmentId + '\'' +
                ", description='" + description + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shipment shipment = (Shipment) o;

        return shipmentId != null ? shipmentId.equals(shipment.shipmentId) : shipment.shipmentId == null;
    }

    @Override
    public int hashCode() {
        return shipmentId != null ? shipmentId.hashCode() : 0;
    }
}
