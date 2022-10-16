package com.xworkz.criminals.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.criminals.dto.CriminalDTO;

@Repository
public class CriminalsDAOImpl implements CriminalDAO{

	
	@Autowired
	private EntityManagerFactory factory;

	EntityManager manager;

	@Override
	public boolean save(CriminalDTO criminalDTO) {

		try {
			manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(criminalDTO);
			transaction.commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return true;
	}

	@Override
	public List<CriminalDTO> findAll() {
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findAll");
			List<CriminalDTO> resultList = query.getResultList();
			return resultList;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return findAll();
	}

	
}
