package io.github.dzulfikar68.moviecatalogue.home.boundary

import android.content.Context
import android.content.Intent
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import io.github.dzulfikar68.moviecatalogue.R
import io.github.dzulfikar68.moviecatalogue.home.control.HomeViewModel
import io.github.dzulfikar68.moviecatalogue.ui.detail.DetailActivity
import io.github.dzulfikar68.moviecatalogue.ui.home.HomeActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class HomeActivityTest {

    @JvmField
    @Rule
    var mActivityRule: ActivityTestRule<HomeActivity> = object : ActivityTestRule<HomeActivity>(
        HomeActivity::class.java) {
        override fun getActivityIntent(): Intent {
            val viewModel = HomeViewModel()
            viewModel.run()
            val targetContext: Context = InstrumentationRegistry.getInstrumentation().targetContext
            val result = Intent(targetContext, HomeActivity::class.java)
            result.putExtra(DetailActivity.EXTRA_MOVIE, viewModel.getMovies()[0].id)
            return result
        }
    }

    @Test
    fun testMovieFragment() {
        onView(withId(R.id.contentListRecycleView)).check(matches(isDisplayed()))
        onView(withId(R.id.contentListRecycleView)).perform(actionOnItemAtPosition<MovieXAdapter.MovieViewHolder>(0, click()))
        onView(withId(R.id.titleTextView)).check(matches(isDisplayed()))
        onView(withId(R.id.titleTextView)).check(matches(withText("Memento")))
    }

    @Test
    fun testTvFragment() {
        onView(withId(R.id.navigation_tv)).check(matches(isDisplayed()))
        onView(withId(R.id.navigation_tv)).perform(click())
        onView(withId(R.id.contentListRecycleView)).check(matches(isDisplayed()))
        onView(withId(R.id.contentListRecycleView)).perform(actionOnItemAtPosition<MovieXAdapter.MovieViewHolder>(0, click()))
        onView(withId(R.id.titleTextView)).check(matches(isDisplayed()))
        onView(withId(R.id.titleTextView)).check(matches(withText("Gotham")))
    }
}