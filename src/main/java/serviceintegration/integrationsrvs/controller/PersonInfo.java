package serviceintegration.integrationsrvs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.*;
import serviceintegration.integrationsrvs.config.CommonConfig;

// import org.general.erp.hrm.controller;


@RestController
@RequestMapping("/indata")
public class PersonInfo {



    @Autowired
    private RestTemplate restTemplate;


    // RestTemplate restTemplate;
//    @Autowired
//    public PersonInfo(RestTemplate restTemplate) {
//        this.restTemplate = restTemplate;
//    }

//    @Autowired
//    HrmDepartmentsController hrmDepartmentsController;

    @GetMapping("/person")
    public String getPersonInfo(){
        System.out.println("Hello 2022");
        // return hrmDepartmentsController.findAll();
        String url = "http://HRM-SRVS/api/v1/hrm/hrmDepartmentsController/getAll";

        String result = restTemplate.getForObject(url, String.class);
        return result;
    }

//    @GetMapping("/getAllDepartment")
//    public ResponseEntity<Object[]> getAllDepartment(){
//        //Object[] accCa = new CommonProperties(restTemplate).getRestResponse("api/v1/fas/acc-ca/acc-ca-list-alais", "ObjectArray");
//        ResponseEntity<Object[]> deptList = restTemplate.exchange(CommonConfig.getApiGatewayUrl() + "api/v1/hrm/hrmDepartmentsController/getAll", HttpMethod.GET, CommonConfig.getHttpEntity(), Object[].class);
//        return deptList;
//    }
}
