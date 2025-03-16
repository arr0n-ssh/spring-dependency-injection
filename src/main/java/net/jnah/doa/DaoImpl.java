package net.jnah.doa;

import org.springframework.stereotype.Repository;

@Repository
public class DaoImpl implements IDao {

    @Override
    public double getData() {
        System.out.println("Database version");
        return 34;
    }
}
