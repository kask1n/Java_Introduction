package Java_Seminar11_CWandHW.models;

import Java_Seminar11_CWandHW.presenters.Model;

import java.util.*;

public class TableModel implements Model {

    private Collection<Table> tables;

    /**
     * Получение списка всех столиков.
     *
     * @return
     */
    public Collection<Table> loadTables() {
        if (tables == null) {  // Один раз проинициализировали, а потом всегда возвращаем.
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }

        return tables;
    }

    /**
     * Бронирование столика
     *
     * @param reservationDate Дата бронирования
     * @param tableNo         Номер столика
     * @param name            Имя клиента
     * @return
     */
    public int reservationTable(Date reservationDate, int tableNo, String name) {
        for (Table table : tables) {
            if (table.getNo() == tableNo) {
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        // Возбуждение исключения - перекладывание ответственности
        // за корректную работу класса на плечи того, кто будет пользоваться этим классом.
//        throw new RuntimeException("Некорректный номер столика.");
        System.out.printf("\nСтолик с номером #%d не найден.", tableNo);
        return -1;
    }

    public int changeReservationTable(int oldReservationId, Date reservationDate, int tableNo, String name) {

        Reservation r = null;
        for (Table table : tables) {
            for (Reservation reservation : table.getReservations()) {
                if (reservation.getId() == oldReservationId) {
                    r = reservation;
                    break;
                }
            }

            if (r != null) {
                table.getReservations().remove(r);
                System.out.printf("\n-> УДАЛЕНА БРОНЬ #%d.", r.getId());
                break;
            }
        }

        if (r != null) {
            return reservationTable(reservationDate, tableNo, name);
        } else {
            System.out.printf("\nБронь с номером #%d не найдена.", oldReservationId);
            return -1;
        }

//        Optional<Table> oldTable = tables.stream().filter(t -> t.getNo() == oldTableNo).findFirst();
//        if (oldTable.isPresent()) {
//            Optional<Reservation> oldReservation =
//                    oldTable.get().getReservations().stream().filter(res -> res.getId() == oldReservationId).findFirst();
//            if (oldReservation.isPresent() && oldTable.get().getReservations().remove(oldReservation.get())) {
//                return reservationTable(reservationDate, tableNo, name);
//            } else {
//                System.out.printf("Бронь с номером #%d не найдена.", oldReservationId);
//                return -1;
//            }
//        } else {
//            System.out.printf("Столик с номером #%d не найден.", oldTableNo);
//            return -1;
//        }
    }
}