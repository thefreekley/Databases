package ua.iot.tfk.model.entity;


import javax.persistence.*;


@Entity(name = "TouristDestination")
@Table(name = "tourist_destination")
public class TouristDestination {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tourist_destination")
    private Integer idTouristDestination;

    @Column(name = "travel_date")
    private String travelDate;

    @Column(name = "id_tourist")
    private Integer idTourist;

    @Column(name = "id_hotel")
    private Integer idHotel;

    @Column(name = "id_tour")
    private Integer idTour;

    public TouristDestination(){}

    public TouristDestination(String travelDate, Integer idTourist, Integer idHotel, Integer idTour) {
        this(-1,travelDate,idTourist,idHotel,idTour);
    }

    public TouristDestination(Integer idTouristDestination, String travelDate,
                              Integer idTourist, Integer idHotel, Integer idTour) {
        this.idTouristDestination = idTouristDestination;
        this.travelDate = travelDate;
        this.idTourist = idTourist;
        this.idHotel = idHotel;
        this.idTour = idTour;
    }

    public Integer getId() {
        return idTouristDestination;
    }

    public void setId(Integer idTouristDestination) {
        this.idTouristDestination = idTouristDestination;
    }


    public String getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(String travelDate) {
        this.travelDate = travelDate;
    }

    public Integer getIdTourist() {
        return idTourist;
    }

    public void setIdTourist(Integer idTourist) {
        this.idTourist = idTourist;
    }

    public Integer getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(Integer idHotel) {
        this.idHotel = idHotel;
    }

    public Integer getIdTour() {
        return idTour;
    }

    public void setIdTour(Integer idTour) {
        this.idTour = idTour;
    }

    @Override
    public String toString() {
        return "TouristDestination{" +
                "idTouristDestination=" + idTouristDestination +
                ", travelDate='" + travelDate + '\'' +
                ", idTourist=" + idTourist +
                ", idHotel='" + idHotel + '\'' +
                ", idTour='" + idTour + '\'' +
                '}'+ "\n";
    }
}
