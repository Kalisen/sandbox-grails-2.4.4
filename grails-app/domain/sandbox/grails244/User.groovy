package sandbox.grails244

import grails.rest.Resource
import org.hibernate.type.UUIDCharType

/**
 *
 */
@Resource(uri='/users')
class User {

    Date dateCreated // must be defined to get automatically populated
    Date lastUpdated // must be defined to get automatically populated
    UUID id
    UUID otherId // nothing to do to map to a binary(16)
    UUID anotherId

    static constraints = {
    }

    static mapping = {
        autoTimestamp true // default is true
        id generator: "assigned" // to take over the automatic id generation, works only for ids
        anotherId type: UUIDCharType // to map the UUID to a varchar(36)
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("version=").append(version);
        sb.append(", id=").append(id);
        sb.append(", otherId=").append(otherId);
        sb.append(", anotherId=").append(anotherId);
        sb.append('}');
        return sb.toString();
    }
}
