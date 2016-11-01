package sandbox.grails244

class CaseSensitiveController {

    def index() {
        render("I'm a case sensitive controller by default")
    }

    def caseSensitivity() {
        render("I'm case sensitive action by default")
    }

}
