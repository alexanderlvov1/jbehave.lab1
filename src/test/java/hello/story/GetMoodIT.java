package hello.story;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.springframework.web.client.RestTemplate;
import se.lf.service.common.test.story.camel.JsonClientWOAuthentication;
import se.lf.service.common.test.story.json.JSONUtil;
import se.lf.service.common.test.story.junit.Story;

import static org.junit.Assert.assertTrue;

public class GetMoodIT extends Story {
    private JSONUtil jsonUtil = new JSONUtil();
    private JsonClientWOAuthentication jsonClient;
    private String response;
    private boolean hasRun = false;
    private RestTemplate restTemplate = new RestTemplate();

    @Given("any user")
    public void given() {
     //   jsonClient = new JsonClientWOAuthentication(new GetQuoteConfig(this.getClass()));
    }

    @When("colour is retrieved")
    public void when() {
        response = restTemplate.getForObject("http://localhost:8080/getMood?name=RED", String.class);
        hasRun = true;
    }

    @Then("the mood should be <mood>")
    public void then(String mood) {
        assertTrue(response.contains(mood));
    }

 /*   @After
    public void failIfNotRun() {
        assertTrue(hasRun);
    }*/
}
