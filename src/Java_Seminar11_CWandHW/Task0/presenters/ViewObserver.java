package Java_Seminar11_CWandHW.Task0.presenters;

import java.util.Date;

public interface ViewObserver {

    public void onReservationTable(Date reservationDate, int tableNo, String name);


}
