package serviceintegration.integrationsrvs.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccOpeningBalanceDTO implements Serializable {
    private Long obId;
    private Integer obFyId;
    private String obCaId;
    private String obProject;
    private Double obDebit;
    private Double obCredit;
    private String obCurrency;
    private String obDate;
    private Integer companyId;
    private String createdBy;
}
