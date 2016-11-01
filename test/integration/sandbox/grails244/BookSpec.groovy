package sandbox.grails244

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Author)
class BookSpec extends Specification {

    void testSomething() {
        when:
        Author author = new Author(name: "Prashant")
        then:
        assert author.save(flush: true, failOnError: true) : "${author.errors}"
    }

    void testSomethingElse() {
        when:
        Book book = new Book([title: "My Title", author: "The Author"])
        Book book1 = new Book(title: "My Title", author: "The Author")
        Book book2 = new Book()
        book2.setTitle("My Title")
        book2.setAuthor("The Author")

        then:
        assert author.save(flush: true, failOnError: true) : "${author.errors}"
    }
}
