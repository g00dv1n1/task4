abstract class Attachment(open val type: String) {
}

class AudioAttachment(val audio: Audio, type: String): Attachment(type){
    override val type: String = "audio"
}
class DocumentAttachment(val doc: Document, type: String) : Attachment(type){
    override val type: String = "document"
}
class PhotoAttachment(val photo: Photo, type: String) : Attachment(type){
    override val type: String = "photo"
}
class VideoAttachment(val video: Video, type: String) : Attachment(type){
    override val type: String = "video"
}
class NoteAttachment(val note: Note, type: String) : Attachment(type){
    override val type: String = "note"
}

data class Note (val id: Int,
            val ownerId: Int,
            val title: String,
            val text: String,
            val date: Int,
            val comments: Int,
            val readComments: Int,
            val viewUrl: String
) {
}

data class Video(val vid: Int,
            val ownerId: Int,
            val title: String,
            val description: String,
            val duration: Int,
            val link: String,
            val image: String,
            val imageMedium: String,
            val date: Int,
            val player: String
) {
}

data class Photo(val id: Int,
            val albumId: Int,
            val ownerId: Int,
            val userId: Int,
            val text: String,
            val date: Int,
            val sizes: Array<Size>,
            val width: Int,
            val height: Int
) {
}

class Size {
}

data class Document(val id: Int,
               val ownerId: Int,
               val title: String,
               val size: Int,
               val ext: String,
               val url: String,
               val date: Int,
               val type: Int
) {
}


data class Audio(val id: Int,
            val ownerId: Int,
            val artist: String,
            val title: String,
            val duration: Int,
            val url: String,
            val lyricsId: Int?,
            val albumId: Int?,
            val genreId: Int,
            val date: Int,
            val noSearch: Int?,
            val isHq: Int?
) {
}
