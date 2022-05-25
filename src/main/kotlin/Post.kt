data class Post(
    var id: Int,
    val ownerId: Int = 7,
    val fromId: Int? = 7,
    val createdBy: Int = 7,
    val date: Int = 1312,
    val text: String = "Пост номер 1",
    val replyOwnedId: Int? = 0,
    val replyPostId: Int? = 0,
    val friendsOnly: Boolean = true,
    val comments: Comment,
    val likes: Like,
    val reposts: Repost,
    val canDelete: Boolean = true,
    val canEdit: Boolean = true
) {
}