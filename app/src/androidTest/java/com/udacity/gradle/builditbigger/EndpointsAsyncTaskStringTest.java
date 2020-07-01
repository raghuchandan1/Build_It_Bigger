package com.udacity.gradle.builditbigger;

/*public class EndpointsAsyncTaskStringTest extends AndroidTestCase {
    public void testNonEmptyJokeReceived() {
        try {
            MainActivity.EndpointsAsyncTask endpointsAsyncTask = new MainActivity().new EndpointsAsyncTask();
            endpointsAsyncTask.execute(new Pair<Context, String>(getContext(), null));
            String joke = endpointsAsyncTask.get(30, TimeUnit.SECONDS);

            assertNotNull(joke);
            assertTrue(joke.length() > 0);
        } catch (Exception e) {
            fail("Null String Received");
        }

    }
}*/

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskStringTest {

    @Rule
    public ActivityTestRule<MainActivity> mRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void getJokes_emptyString() {
        onView(withId(R.id.button_tell_joke)).perform(click());
        onView(withId(R.id.joke_text_view)).check(matches(not(withText(""))));
    }
}