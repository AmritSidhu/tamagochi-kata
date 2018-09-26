import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TamagochiTest {

    @Test
    public void shouldBeAbleToFeedTamagochi(){
        Tamagochi bob = new Tamagochi();
        bob.feed();
        assertEquals(25, bob.getHunger());
    }

    @Test
    public void shouldBeAbleToFeedTamagochiUntilMax(){
        Tamagochi bob = new Tamagochi();
        bob.feed();
        bob.feed();
        bob.feed();
        bob.feed();
        bob.feed();
        assertEquals(100, bob.getHunger());
    }

    @Test
    public void shouldBeAbleToPlayWithTamagochi(){
        Tamagochi bob = new Tamagochi();
        bob.play();
        assertEquals(25, bob.getHappiness());
    }

    @Test
    public void shouldBeAbleToPlayWithTamagochiUntilMax(){
        Tamagochi bob = new Tamagochi();
        bob.play();
        bob.play();
        bob.play();
        bob.play();
        bob.play();
        assertEquals(100, bob.getHappiness());
    }

    @Test
    public void shouldGetTiredWhenPlayedWith(){
        Tamagochi bob = new Tamagochi();
        bob.play();
        assertEquals(25, bob.getTiredness());
    }

    @Test
    public void shouldBeAbleToPutTamagochiToBed(){
        Tamagochi bob = new Tamagochi();
        bob.play();
        bob.bed();
        assertEquals(0, bob.getTiredness());
    }

    @Test
    public void shouldBeAbleToMakeTamagochiPoop(){
        Tamagochi bob = new Tamagochi();
        bob.feed();
        bob.poop();
        assertEquals(0, bob.getHunger());
    }

    // #TODO find more efficient way to test time

//    @Test
//    public void shouldDecreasesStatsOverTime() throws InterruptedException {
//        Tamagochi bob = new Tamagochi();
//        bob.time();
//        bob.play();
//        bob.feed();
//        sleep(20000);
//        assertEquals(50, bob.getHunger());
//    }

}