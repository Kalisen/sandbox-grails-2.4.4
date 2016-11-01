package sandbox.grails244

import grails.converters.JSON

class AuthorController {
    def index() {
        Author author = new Author(name: "Prashant")
        Book goodBook = new Book(title: "Good book")
//        goodBook = goodBook.save(failOnError: true)
        author.masterPiece = goodBook;
        author = author.save(failOnError: true)
        render author as JSON
    }
}
