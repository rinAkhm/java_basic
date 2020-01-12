package topic3.abstraction.library.users;

import topic3.abstraction.library.skills.IAdmin;
import topic3.abstraction.library.skills.IReader;

public class Admin extends Users implements IAdmin {
    @Override
    public void findBook() {

    }

    @Override
    public void pickUpBook(IReader reader) {

    }

    @Override
    public void overdueNotification(IReader reader) {

    }

    @Override
    public void doWorking() {

    }
}