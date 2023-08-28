package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		/*System.out.println("\n==== TEST 5: department update ====");
		Department = departmentDao.findById(1);
		department.setName("Martha Waine");
		departmentDao.update(department);
		System.out.println("Update completed");*/
		
		/*System.out.println("\n==== Test 4: department Insert ==== ");
		Department department = new Department(7, "Toys");
		departmentDao.insert(department);
		System.out.println("Inserted! New id = " + department.getId());*/
		
		/*System.out.println("\n==== Test 1: Department findById ==== ");
		Department department = departmentDao.findById(2);
		System.out.println(department);*/
		
		/*System.out.println("\n==== TEST 6: Department delete ====");
		System.out.println("Enter id fot delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");*/
		
		System.out.println("\n==== Test 3: Department findAll ==== ");
		List<Department> list = departmentDao.findAll();
		list = departmentDao.findAll();
		
		for(Department obj : list) {
			System.out.println(obj);
		}
		
		sc.close();

	}

}
