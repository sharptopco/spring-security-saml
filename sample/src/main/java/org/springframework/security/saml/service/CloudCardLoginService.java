package org.springframework.security.saml.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CloudCardLoginService {

    private final Logger log = LoggerFactory.getLogger(CloudCardLoginService.class);
    private static final String CLOUDCARD_API_BASE_URL = "https://test-api.onlinephotosubmission.com/api";  //TODO: change to prod
    private static final String API_KEY = "lftnmdgpud4linaeaqr9os0ccpilgiqd"; //TODO: delete this api key
    private final RestTemplate restTemplate = new RestTemplate();

    public String bacon() {

        return "Bacon!";

    }
}
