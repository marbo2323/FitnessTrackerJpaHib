package com.pluralsight.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;

@Repository("goalRepository")
public class GoalRepositoryImpl implements GoalRepository {

	@PersistenceContext
	private EntityManager em;
	
	public Goal save(Goal goal) {
		
		if (goal.getId() == null) {
			em.persist(goal);
			em.flush();
		} else {
			goal = em.merge(goal);
		}
		
		return goal;
	}
	
	public List<Goal> loadAll() {
		
		TypedQuery<Goal> query = em.createNamedQuery(Goal.FIND_ALL_GOALS, Goal.class);
		
		return query.getResultList();
	}
	
	public List<GoalReport> fidAllGoalReports() {
		
		TypedQuery<GoalReport> query = em.createNamedQuery(Goal.FIND_GOAL_REPORTS, GoalReport.class);
		
		return query.getResultList();
	}

}
