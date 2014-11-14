package hello.story;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.After;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;
import se.lf.service.common.test.story.json.JSONUtil;
import se.lf.service.common.test.story.junit.Story;

import static org.junit.Assert.assertTrue;

public class GetMoodIT extends Story {
    private JSONUtil jsonUtil = new JSONUtil();
    private String response;
    private boolean hasRun = false;
    private RestTemplate restTemplate = new RestTemplate();


    @Given("any user")
    public void given() {
     //   jsonClient = new JsonClientWOAuthentication(new GetQuoteConfig(this.getClass()));
    }

    @When("a <colour> is retrieved")
    public void when(String colour) {
        HttpEntity<String> request = createRequest("{\"name\": \"" + colour +"\"}");
        response = restTemplate.postForObject("http://localhost:8080/getMood", request, String.class);
    }

    @Then("the mood should be <mood>")
    public void then(String mood) {
        assertTrue(response.contains(mood));
        hasRun = true;
    }

    private HttpEntity<String> createRequest(String requestJson) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> entity = new HttpEntity<String>(requestJson,headers);
        return entity;
    }

    @After
    public void failIfNotRun() {
        assertTrue(hasRun);
    }


}
