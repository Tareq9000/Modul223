package ticket;

import java.util.List;

public interface iDao {

    List<Ticket> getAll();
    List<Ticket> get(int id);
    int insert(Ticket t);
    boolean update(Ticket t);
    boolean delete(int id);

}
