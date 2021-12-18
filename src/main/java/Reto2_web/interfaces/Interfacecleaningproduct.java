
package Reto2_web.interfaces;

import Reto2_web.modelo.cleaningproduct;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface Interfacecleaningproduct extends MongoRepository<cleaningproduct, String>{
    
}
