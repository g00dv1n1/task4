fun main() {

    val like = Like()
    val comment = Comment()
    val repost = Repost()

    val post = Post(id = 1, likes = like, reposts = repost)
    val newPost = Post(id = 1, likes = like, reposts = repost)

    println(WallService.add(post))
    println(WallService.update(newPost))
    println(WallService.createComment(postId = 1, comment = comment))
    println(WallService.view())
}

