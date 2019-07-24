package com.api.integtation.serviceintegration;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.Test;
import org.springframework.web.client.RestTemplate;

public class SampleAPITest {

  private RestTemplate restTemplate = new RestTemplate();

  @Test
  public void shouldVerifySampleEndpoint(){
    String result = restTemplate
        .getForObject("https://humming-hypnotisation.cfapps.io", String.class);

    assertThat(result).isEqualTo("Hello from the review environment");
  }

}
