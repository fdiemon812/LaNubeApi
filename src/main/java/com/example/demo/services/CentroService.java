package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Centro;
import com.example.demo.repository.AulaRepo;
import com.example.demo.repository.CentroRepo;
import com.example.demo.model.Aula;



/**
 * Servicio encargado de la logica que ocurre sobre los centros
 * @author estudiante
 *
 */
@Service
public class CentroService {

	@Autowired
	CentroRepo centroRepo;
	
	@Autowired
	AulaRepo aulaRepo;
	
	
	
	/**
	 * Modifica los datos de un centro. Añade un aula si no la tenia respetando los anteriores. 
	 * @param centro1
	 * @param centro2
	 * @return
	 */
	public Centro modificarCentro(Centro centro1, Centro centro2) {
		
		List<Aula> aulas= new ArrayList<>();
		
		aulas.addAll(centro1.getAulas());
		
//		System.out.println(aulas.contains(centro2.getAulas().get(0)));
//		
//		if(!aulas.contains(centro2.getAulas().get(0))) {
//			
//			aulas.add(centro2.getAulas().get(0));
//		}
//		
		centro1.setAulas(aulas);
		centro1.setDireccion(centro2.getDireccion());
		centro1.setEmail(centro2.getEmail());
		centro1.setNombre(centro2.getNombre());
		centro1.setTlf(centro2.getTlf());
		
		
		return centro1;
		
	}
	/**
	 * Borra un aula en un centro
	 * @param id
	 * @param idAula
	 */
	public void borrarAula(int id, int idAula) {


		Centro centro = centroRepo.getById(id);
		int posicion = centro.getAulas().indexOf(new Aula(idAula));
		centro.getAulas().remove(posicion);
		centroRepo.save(centro);
	}
	
}
