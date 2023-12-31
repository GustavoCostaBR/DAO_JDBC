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
        
        // TODO Auto-generated method stub
//        Department obj = new Department(1, "Books");
//        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.00, obj);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: department findByid ===");

        Department department = departmentDao.findById(3);

        System.out.println(department);

        
        System.out.println("=== TEST 2: department findAll ===");
        List<Department> list = departmentDao.findAll();
        for (Department obj : list) {
            System.out.println(obj);
        }
//        System.out.println("=== TEST 3: department insert ===");
//        Department newDepartment = new Department(null, "D4");
//        departmentDao.insert(newDepartment);
//        System.out.println("Inserted! New id = " + newDepartment.getId());
//        
        System.out.println("=== TEST 4: department update ===");
        department = departmentDao.findById(7);
        department.setName("Drugarye");
        departmentDao.update(department);
        System.out.println("Update completed!");
//        
        System.out.println("=== TEST 5: department delete ===");
        System.out.println("Enter the Id you would like to delete: ");
        int id = sc.nextInt();
//        for (int id = 11; id <= 21; id++) {
//            sellerDao.deleteById(id);
//            System.out.println("Delete completed!");
//        }
        departmentDao.deleteById(id);
        System.out.println("Delete completed!");
        
        sc.close();
        
    }

}
