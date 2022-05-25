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

