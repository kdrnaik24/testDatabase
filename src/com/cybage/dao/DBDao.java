package com.cybage.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cybage.dto.IssueDetails;
import com.cybage.model.DBModel;

@Repository
public class DBDao 
{
	protected EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}
	
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	
	@Transactional
	public void addIssueDetails(DBModel dbmodel) {
		try{
			System.out.println(entityManager);
            entityManager.persist(dbmodel);
            
            entityManager.flush();
      }catch(Exception ex){
            System.out.println("Exception occured while saving project"+ex.getMessage());
            System.out.println(dbmodel);
            
            ex.printStackTrace();
      }
	}
	
	
	/*public ProjectModel getProject(int projectId) {
		System.out.println("In Dao" +projectId);
	
		ProjectModel project = entityManager.find(ProjectModel.class, projectId);
		return project;
	}
	
	
	
	public List<ProjectModel> getAllProjects() {
		TypedQuery<ProjectModel> qt = entityManager.createQuery("SELECT e FROM ProjectModel e", ProjectModel.class);
		List<ProjectModel> projectlist = (List<ProjectModel>)qt.getResultList();
		System.out.println("project "+projectlist);
		return projectlist;
	}*/

	
}
