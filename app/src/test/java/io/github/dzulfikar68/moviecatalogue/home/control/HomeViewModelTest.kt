package io.github.dzulfikar68.moviecatalogue.home.control

import io.github.dzulfikar68.moviecatalogue.main.entity.MovieResult
import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertNotNull
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.mock

class HomeViewModelTest {

    private var viewModel: HomeViewModel? = null
    private lateinit var listResult: List<MovieResult>
    private var movieResult: MovieResult? = null
    private var tvResult: MovieResult? = null

    @Before
    fun setUp() {
        viewModel = HomeViewModel()
    }

    @Test
    fun requestMovies() {
        viewModel?.run()
        listResult = viewModel?.getMovies() ?: listOf()
        assertNotNull(listResult)
        assertEquals(10, listResult.size)
    }

    @Test
    fun requestMoviesById() {
        viewModel?.run()
        movieResult = viewModel?.getMoviesById(1)
        assertNotNull(movieResult)
        assertEquals("Memento", movieResult?.original_title)
    }

    @Test
    fun requestTvs() {
        viewModel?.run()
        listResult = viewModel?.getTvs() ?: listOf()
        assertNotNull(listResult)
        assertEquals(10, listResult.size)
    }

    @Test
    fun requestTvsById() {
        viewModel?.run()
        tvResult = viewModel?.getTvsById(11)
        assertNotNull(tvResult)
        assertEquals("Gotham", tvResult?.original_title)
    }

    @Test
    fun getById() {
        viewModel?.run()
        val result = viewModel?.getById(2)
        assertNotNull(result)
        assertEquals("Taxi Driver", result?.original_title)
    }
}