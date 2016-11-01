package sandbox.grails244
import grails.rest.Resource
/**
 *
 */
@Resource(uri='/users2')
class User2 {

    UUID id

    static constraints = {
    }

    static mapping = {
        id generator: "uuid2" // generates a UUID
    }

}
