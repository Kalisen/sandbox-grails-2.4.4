package sandbox.grails244

class Author {
    String name
    Book masterPiece
//    List<Book> books

    static constraints = {
        masterPiece nullable: true
    }

    static mapping = {
        masterPiece cascade: "all-delete-orphan"
    }
}
