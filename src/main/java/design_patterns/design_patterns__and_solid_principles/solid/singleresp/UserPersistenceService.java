package design_patterns.design_patterns__and_solid_principles.solid.singleresp;

public class UserPersistenceService {

    private Store store = new Store();

    public void saveUser(User user) {
        store.store(user);
    }

	
}
