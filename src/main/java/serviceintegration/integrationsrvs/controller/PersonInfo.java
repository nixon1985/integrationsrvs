package serviceintegration.integrationsrvs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.*;
import serviceintegration.integrationsrvs.client.GatewayClient;
import serviceintegration.integrationsrvs.model.AccOpeningBalanceDTO;

import java.util.List;
import java.util.Optional;

// import org.general.erp.hrm.controller;


@RestController
@RequestMapping(value = "/indata")
public class PersonInfo {

    private final GatewayClient gatewayClient;

    public PersonInfo(GatewayClient gatewayClient) {
        this.gatewayClient = gatewayClient;
    }

    @GetMapping("/oopBalance")
    public @ResponseBody
    List<AccOpeningBalanceDTO> getOopBalance() {
        return gatewayClient.getOpeningBalanceByFinYear(3,74);
    }


    // RestTemplate restTemplate;
//    @Autowired
//    public PersonInfo(RestTemplate restTemplate) {
//        this.restTemplate = restTemplate;
//    }

//    @Autowired
//    HrmDepartmentsController hrmDepartmentsController;

//    @GetMapping("/person")
//    public String getPersonInfo(){
//        System.out.println("Hello 2022");
//        // return hrmDepartmentsController.findAll();
//        String url = "http://HRM-SRVS/api/v1/hrm/hrmDepartmentsController/getAll";
//
//        String result = restTemplate.getForObject(url, String.class);
//        return result;
//    }

//    @GetMapping("/getAllDepartment")
//    public ResponseEntity<Object[]> getAllDepartment(){
//        //Object[] accCa = new CommonProperties(restTemplate).getRestResponse("api/v1/fas/acc-ca/acc-ca-list-alais", "ObjectArray");
//        ResponseEntity<Object[]> deptList = restTemplate.exchange(CommonConfig.getApiGatewayUrl() + "api/v1/hrm/hrmDepartmentsController/getAll", HttpMethod.GET, CommonConfig.getHttpEntity(), Object[].class);
//        return deptList;
//    }
}
