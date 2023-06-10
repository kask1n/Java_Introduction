package Java_Seminar11_CWandHW.Task0.presenters;

import Java_Seminar11_CWandHW.Task0.models.Table;

import java.util.Collection;

public interface View {

    void setObserver(ViewObserver observer);

    void updateTablesView(Collection<Table> tables);

    void updateReservationTableResult(int reservationNo);
}
