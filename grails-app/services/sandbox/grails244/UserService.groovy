package sandbox.grails244

import grails.transaction.Transactional

@Transactional
class UserService {

    def log

    def serviceMethod() {
        log.info("some test message")
        return true
    }
}
