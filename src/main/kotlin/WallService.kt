object WallService {
    private var posts = emptyArray<Post>()
    private var Id = 0
    private var comments = emptyArray<Comment>()


    fun add(post: Post): Post {
        Id++
        post.id = Id
        posts += post
        return posts.last()
    }

    fun createComment(postId: Int, comment: Comment) : Comment{

        for((index, post) in posts.withIndex()){
            if(post.id == postId){
                comments += comment
                posts[index] = post.copy(comments = comments)
            } else throw PostNotFoundException("Пост не найден")
        }
        return comment
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
                    comments= comments,
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

class PostNotFoundException(message: String) : RuntimeException() {

}
