package module08.question02.ds;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Optional;

@EqualsAndHashCode
@ToString
public class BookingResult {

    private final BookingState bookingState;

    private final Reservation reservation;

    private BookingResult(BookingState bookingState, Reservation reservation) {
        this.bookingState = bookingState;
        this.reservation = reservation;
    }

    public BookingState getBookingState() {
        return bookingState;
    }

    public Optional<Reservation> getReservation() {
        return Optional.ofNullable(reservation);
    }

    public static BookingResult createRoomBookedResult(Reservation reservation) {
        return new BookingResult(BookingState.ROOM_BOOKED, reservation);
    }

    public static BookingResult createNoRoomAvailableResult() {
        return new BookingResult(BookingState.NO_ROOM_AVAILABLE, null);
    }

    public enum BookingState {
        ROOM_BOOKED,
        NO_ROOM_AVAILABLE
    }
}
