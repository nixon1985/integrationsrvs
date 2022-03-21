package serviceintegration.integrationsrvs.config;

import com.nimbusds.oauth2.sdk.token.AccessToken;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import java.util.Arrays;

public class CommonConfig {

    public static String getApiGatewayUrl(){
        return "http://GENERAL-ERP/";
        //return "http://103.129.200.58:8088/";
    }

//    public static HttpEntity<Object> getHttpEntity(){
//        HttpHeaders httpHeaders = new HttpHeaders();
//        httpHeaders.add("Authorization", AccessToken.getAccessToken());
//        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//        HttpEntity<Object> entity = new HttpEntity<>(httpHeaders);
//        return entity;
//    }
}
