/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iticket.grupo4.Service;


import iticket.grupo4.Entity.Concierto;
import iticket.grupo4.Repository.ConciertoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author yulien
 */

@Service
public class ConciertoService implements IConciertoService{

    @Autowired
    private ConciertoRepository conciertoRepository;
    
    @Override
    public List<Concierto> getAllConcierto() {
     return (List<Concierto>)conciertoRepository.findAll();
    }

    @Override
    public Concierto getConciertoById(long id) {
     return conciertoRepository.findById(id).orElse(null);
    }

    @Override
    public void saveConcierto(Concierto concierto) {
       conciertoRepository.save(concierto);
    }

    @Override
    public void delete(long id) {
      conciertoRepository.deleteById(id);
    }
    
    
    
}
