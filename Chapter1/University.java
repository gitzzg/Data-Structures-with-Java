package io.github.gitzzg.Chapter1;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class University {
	private static class Department {
		final String name;
		Set<Professor>members;
		
		public Department(String name) {
			this.name = name;
			this.members = new HashSet<Professor>();
		}
		
		public void add(Professor professor) {
			members.add(professor);
		}
	}
	
	private final String name;
	private Map<String, Department>departments;
	
	public University(String name) {
		this.name = name;
		this.departments = new TreeMap<String, Department>();
	}
	
	public String getName() {
		return new String(name);
	}
	
	public void addDepartment(String name, Set<Professor>members) {
		Department dept = new Department(name);
		departments.put(name, dept);
		for (Professor prof:members) {
			dept.add(prof);
		}
	}
	
	public void add(Professor prof, String deptName) {
		Department dept = departments.get(deptName);
		if(dept==null) {
			throw new RuntimeException(deptName + " does not exits.");
		} else {
			dept.add(prof);
		}
	}
	
	public Set<String>departments() {
		return departments.keySet();
	}
}
