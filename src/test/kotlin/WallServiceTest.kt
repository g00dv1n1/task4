import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {
        val like = Like()
        val comment = Comment()
        val repost = Repost()
        val post = Post(id = 1, likes = like, reposts = repost, comments = comment)
        val expectedCode = 1

        val expectedPost = WallService.add(post)
        val actualCode = expectedPost.id

        assertEquals(expectedCode, actualCode)
    }

    @Test
    fun updateTrue() {
        val like = Like()
        val comment = Comment()
        val repost = Repost()

        val post = Post(id = 1, likes = like, reposts = repost, comments = comment)
        val newPost = Post(id = 1, likes = like, reposts = repost, comments = comment)

        WallService.add(post)
        val result = WallService.update(newPost)
        assertTrue(result)
    }

    @Test
    fun updateFalse() {
        val like = Like()
        val comment = Comment()
        val repost = Repost()

        val post = Post(id = 1, likes = like, reposts = repost, comments = comment)
        val newPost = Post(id = 2, likes = like, reposts = repost, comments = comment)

        WallService.add(post)
        val result = WallService.update(newPost)
        assertFalse(result)
    }
}