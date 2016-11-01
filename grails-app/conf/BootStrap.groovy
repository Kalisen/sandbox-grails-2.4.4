import grails.converters.JSON
import sandbox.grails244.User
import sandbox.grails244.User2
import sandbox.grails244.User3

class BootStrap {

    def init = { servletContext ->
//        createTestObjects()
        registerObjectMarshallers()
    }


    def destroy = {
    }

    void createTestObjects() {

        UUID someId = UUID.randomUUID();
        User user = new User(otherId: someId, anotherId: someId);
        user.setId(someId);
        println user;
        user = user.save(failOnError: true);
        println user;

        User2 user2 = new User2();
        user2 = user2.save(failOnError: true)
        println user2;

        User3 user3 = new User3();
        user3 = user3.save(failOnError: true)
        println user3;
    }

    void registerObjectMarshallers() {
        JSON.registerObjectMarshaller(User) { User it ->
            return [
                    id: it.id.toString(),
                    otherId: it.otherId.toString(),
                    anotherId: it.anotherId.toString(),
            ]
        }

    }
}
