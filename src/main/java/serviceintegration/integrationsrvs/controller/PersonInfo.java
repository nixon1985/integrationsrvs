package serviceintegration.integrationsrvs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import serviceintegration.integrationsrvs.config.CommonConfig;

// import org.general.erp.hrm.controller;


@RestController
//@RequestMapping("/person")
public class PersonInfo {

//    @Autowired
//    RestTemplate restTemplate;

//    @Autowired
//    HrmDepartmentsController hrmDepartmentsController;

    @RequestMapping("/person")
    public String getPersonInfo(){
        System.out.println("Hello 2022");
        // return hrmDepartmentsController.findAll();
        return "dsfsdf";
    }

//    @GetMapping("/getAllDepartment")
//    public ResponseEntity<Object[]> getAllDepartment(){
//        //Object[] accCa = new CommonProperties(restTemplate).getRestResponse("api/v1/fas/acc-ca/acc-ca-list-alais", "ObjectArray");
//        ResponseEntity<Object[]> deptList = restTemplate.exchange(CommonConfig.getApiGatewayUrl() + "api/v1/hrm/hrmDepartmentsController/getAll", HttpMethod.GET, CommonConfig.getHttpEntity(), Object[].class);
//        return deptList;
//    }
}
