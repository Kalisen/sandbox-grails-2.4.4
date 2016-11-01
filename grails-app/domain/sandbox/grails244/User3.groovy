package sandbox.grails244
import grails.rest.Resource
/**
 *
 */
@Resource(uri='/users3')
class User3 {

    String id

    static constraints = {
    }

    static mapping = {
        id generator: "uuid" // generates a String
    }

}
