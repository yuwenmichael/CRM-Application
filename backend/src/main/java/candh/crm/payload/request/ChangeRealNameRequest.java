package candh.crm.payload.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter

/**
 * Request body parameters for /user/changeRealName.
 */
public class ChangeRealNameRequest
{
    @NotBlank
    private String id;
    @NotBlank
    private String first_name;
    @NotBlank
    private String last_name;
}
