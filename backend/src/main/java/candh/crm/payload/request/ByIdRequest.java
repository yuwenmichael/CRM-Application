package candh.crm.payload.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter

public class ByIdRequest
{
    @NotBlank
    private String id;

    public ByIdRequest(String userId) {
        this.id = id;
    }
}
