abstract class Attachment

class AudioAttachment(val audio: Audio) : Attachment()
class DocumentAttachment(val doc: Document) : Attachment()
class PhotoAttachment(val photo: Photo) : Attachment()
class VideoAttachment(val video: Video) : Attachment()
class NoteAttachment(val note: Note) : Attachment()

class Note (val id: Int,
            val ownerId: Int,
            val title: String,
            val text: String,
            val date: Int,
            val comments: Int,
            val readComments: Int,
            val viewUrl: String
) {
}

class Video(val vid: Int,
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

class Photo(val id: Int,
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

class Document(val id: Int,
               val ownerId: Int,
               val title: String,
               val size: Int,
               val ext: String,
               val url: String,
               val date: Int,
               val type: Int
) {
}


class Audio(val id: Int,
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
