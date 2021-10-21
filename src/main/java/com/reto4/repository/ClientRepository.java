package com.reto4.repository;

// Importaciones
import com.reto4.modelo.Category;
import com.reto4.modelo.Client;
import com.reto4.repository.crud.ClientCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Alexander Sánchez Osorio
 */
@Repository
public class ClientRepository {
    /**
     * Atributo autowired client
     */
    @Autowired
    private ClientCrudRepository clientCrudRepository;

    /**
     * método para obtener todos los client
     * @return
     */
    public List<Client> getAll(){
        return (List<Client>) clientCrudRepository.findAll();
    }

    /**
     * Método para obtener un client por id
     * @param id
     * @return
     */
    public Optional<Client> getClient(int id){
        return clientCrudRepository.findById(id);
    }

    /**
     * método save para client
     * @param client
     * @return
     */
    public Client save(Client client){
        return clientCrudRepository.save(client);
    }

    /**
     * método para borrar un client
     * @param client
     */
    public void delete(Client client){
        clientCrudRepository.delete(client);
    }
}
