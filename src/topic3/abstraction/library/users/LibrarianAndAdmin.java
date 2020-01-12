package topic3.abstraction.library.users;

import topic3.abstraction.library.skills.IAdmin;
import topic3.abstraction.library.skills.ILibrarian;
import topic3.abstraction.library.skills.IReader;
import topic3.abstraction.library.skills.ISupplier;

public class LibrarianAndAdmin extends Users implements IAdmin, ILibrarian {
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

    @Override
    public void orderBooks(ISupplier supplier) {

    }
}
