package ua.iot.tfk.model.entity;


import javax.persistence.*;


@Entity(name = "Bus")
@Table(name = "bus")
public class Bus {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bus")
    private Integer idBus;

    @Column(name = "bus_name")
    private String busName;

    public Bus() {
    }

    public Bus(String busName){
        this(-1, busName);
    }

    public Bus(Integer idBus, String busName) {
        this.idBus = idBus;
        this.busName = busName;
    }

    public Integer getId() {
        return idBus;
    }

    public void setId(Integer idBus) {
        this.idBus = idBus;
    }

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }


    @Override
    public String toString() {
        return "Bus{" +
                "id=" + idBus +
                ", busName='" + busName + '\'' +
                '}' + "\n";
    }

}
