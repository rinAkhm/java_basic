package topic3.abstraction.library.skills;

public interface IAdmin {
    void findBook();
    void pickUpBook (IReader reader);
    void overdueNotification(IReader reader);
}
