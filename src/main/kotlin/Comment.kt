class Comment (val id: Int = 1,
               val fromId: Int = 7,
               val date: Int = 413413,
               val text: String = "Первый коммент",
               val replyToUser: Int? = 1,
               val replyToComment: Int? = 1,
               val atachments: Array<Attachment>? = emptyArray()
) {
}