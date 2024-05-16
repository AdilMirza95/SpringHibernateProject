package az.spring.hibernate;

import az.spring.hibernate.config.SpringHibernateConfig;
import az.spring.hibernate.dao.EmployeeDao;
import az.spring.hibernate.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class HibernateApplocation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringHibernateConfig.class);
        EmployeeDao employeeDao = context.getBean(EmployeeDao.class);

        Employee employee = new Employee();
        employee.setName("Elsen");
        employee.setSurname("Huseynov");
        employee.setAge(30);
        employee.setSalary(1800);
        employee.setId(2);



       employeeDao.insert(employee);


    }


}
