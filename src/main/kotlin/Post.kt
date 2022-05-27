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
    val comments: Array<Comment>? = emptyArray(),
    val likes: Like,
    val reposts: Repost,
    val canDelete: Boolean = true,
    val canEdit: Boolean = true,
    val attachments: Array<Attachment>? = emptyArray()
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Post

        if (!attachments.contentEquals(other.attachments)) return false

        return true
    }

    override fun hashCode(): Int {
        return attachments.contentHashCode()
    }
}