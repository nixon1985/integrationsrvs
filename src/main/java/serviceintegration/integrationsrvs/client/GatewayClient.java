package serviceintegration.integrationsrvs.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import serviceintegration.integrationsrvs.model.AccOpeningBalanceDTO;

import java.util.List;

@FeignClient(name = "GENERAL-ERP")
public interface GatewayClient {

    @GetMapping("/api/v1/fas/accOpeningBalanceController/getAll/{companyId}/{finYearId}")
    List<AccOpeningBalanceDTO> getOpeningBalanceByFinYear(@PathVariable Integer companyId, @PathVariable Integer finYearId);
}
