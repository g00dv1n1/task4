fun main() {

    val like = Like()
    val comment = Comment()
    val repost = Repost()

    val post = Post(id = 1, likes = like, reposts = repost, comments = comment)
    val newPost = Post(id = 1, likes = like, reposts = repost, comments = comment)

    println(WallService.add(post))
    println(WallService.update(newPost))
    println(WallService.view())
}

data class Post(
    var id: Int,
    val ownerId: Int = 7,
    val fromId: Int = 7,
    val createdBy: Int = 7,
    val date: Int = 1312,
    val text: String = "Пост номер 1",
    val replyOwnedId: Int = 0,
    val replyPostId: Int = 0,
    val friendsOnly: Boolean = true,
    val comments: Comment,
    val likes: Like,
    val reposts: Repost,
    val canDelete: Boolean = true,
    val canEdit: Boolean = true
) {
}

class Repost (val count: Int = 1, val userReposted: Int = 1)  {
}

class Like (val count: Int = 1,
            val userLikes: Boolean = true,
            val canLike: Boolean = true,
            val canPublish: Boolean = true) {
}

class Comment (val count: Int = 1,
               val canPost: Boolean = true,
               val groupCanPost: Boolean = true,
               val canClose: Boolean = true,
               val canOpen: Boolean = true) {
}

object WallService {
    private var posts = emptyArray<Post>()
    private var Id = 0

    fun add(post: Post): Post {
        Id++
        post.id = Id
        posts += post
        return posts.last()
    }

    fun update(post: Post) : Boolean {
        val id = post.id
        var result = false
        for ((index, post) in posts.withIndex()) {
            if(post.id == id) {
                posts[index] = post.copy(id=1,
                    fromId=8,
                    createdBy=8,
                    text= "Пост номер 2",
                    replyOwnedId=1,
                    replyPostId=1,
                    friendsOnly=true,
                    comments= Comment(),
                    likes=Like(),
                    reposts=Repost(),
                    canDelete=true,
                    canEdit=true)
                result = true
            }
        }
        return result
    }

    fun view() : Post {
        return posts.last()
    }
}