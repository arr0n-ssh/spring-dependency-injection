package net.jnah.metier;

import net.jnah.doa.IDao;
import org.springframework.stereotype.Service;

@Service
public class MetierImpl implements IMetier {
    private IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double data = dao.getData();

        return data * 12 *Math.PI/2 *Math.cos(data);
    }
}
