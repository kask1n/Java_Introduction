package Java_Seminar11_CWandHW.presenters;

import java.util.Date;

public interface ViewObserver {

    void onReservationTable(Date reservationDate, int tableNo, String name);
    void onChangeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);

}