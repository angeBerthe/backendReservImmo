package ci.digitalacademy.reservationimmobiliere.services.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private Long id;
    private String email;
    private String password;
    private boolean rememberMe;


    private RoleDTO role;

}
