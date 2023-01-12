import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework17 extends BaseTest {
    @Test
    public static void addSongToPlaylist() throws InterruptedException {
        navigateToPage("https://bbb.testpro.io/");

        // Login to the Homepage Koel
        provideEmail("shalinibaronia@gmail.com");
        providePassword("te$t$tudent");
        clickSubmit();
        Thread.sleep(2000);

        // Search and select the song
        searchASong("Take My Hand");
        Thread.sleep(2000);
        viewAllSearchResult();
        selectSong();

        // Add the song to playlist
        clickAddToButton();
        selectPlaylistName();

        // Verify that song is added to the playlist
        WebElement addedSongAlert = driver.findElement(By.cssSelector("div.success.show"));
        Assert.assertTrue(addedSongAlert.isDisplayed());
    }
}
