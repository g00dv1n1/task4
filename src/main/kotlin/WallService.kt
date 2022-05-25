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