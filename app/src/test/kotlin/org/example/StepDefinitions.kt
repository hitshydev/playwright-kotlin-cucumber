package org.example

import com.microsoft.playwright.*
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import java.nio.file.Paths
import kotlin.test.assertNotNull


class StepDefinitions {
    @Given("I have {int} cukes in my belly")
    fun `I have x cukes in my belly`(cukes: Int) {
        Playwright.create().use { playwright ->
            val browser = playwright.firefox().launch()
            val page: Page = browser.newPage()
            page.navigate("https://google.de/")
            page.screenshot(Page.ScreenshotOptions().setPath(Paths.get("example.png")))
        }
        assert(false)
    }

    @When("I wait {int} hour")
    fun `I wait x hour`(hours: Int) {
        assert(false)
    }

    @Then("my belly should growl")
    fun `my belly should growl`() {
        assert(false)
    }
}
