package sandbox.grails244

import grails.converters.JSON

class BookController {
    def index() {
        OtherBook b = new OtherBook(title: "Dune", author: "Frank Herbert")
        render b as JSON
    }
}


class OtherBook {
    String title
    String author
}