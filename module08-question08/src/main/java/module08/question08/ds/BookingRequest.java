package module08.question08.ds;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
public class BookingRequest {

    private Guest guest;

    private LocalDate bookingDate;
}
