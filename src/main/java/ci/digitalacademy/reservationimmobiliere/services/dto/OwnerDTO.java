package ci.digitalacademy.reservationimmobiliere.services.dto;


import ci.digitalacademy.reservationimmobiliere.models.User;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class OwnerDTO extends PersonDTO{


    private UserDTO user;

}
