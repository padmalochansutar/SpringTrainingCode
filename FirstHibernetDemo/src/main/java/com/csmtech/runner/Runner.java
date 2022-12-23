bpackage com.csmtech.runner;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.csmtech.entity.Employees;



public class Runner {

	public static void main(String[] args) {
		
		//final String hql="from Book where bookPrice>300";//for all records
		//final String hql="select bookPrice from Book";
		//final String hql="select bookId,bookName,bookPrice from Book";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter department id");
		Long did=sc.nextLong();
		final String hql="select employeeId,empLastName,salary,departmentid from Employees where departmentid=:did";
		Configuration cnf = new Configuration();
		cnf.addAnnotatedClass(Employees.class);
		SessionFactory sessionfactory = cnf.buildSessionFactory();
		Session session = sessionfactory.openSession();

		System.out.println(session);

//		Book b = new Book();
//		b.setBookName("let us c");
//		b.setBookName("let us c++");
//		b.setBookName("java");
//		b.setBookName("php");
////		/// query execute here:-
////
////		// read particular book..by its id
////		Book b1 = session.get(Book.class, 3l);
////		System.out.println(b1);
////		//b1.setBookName("complete reference java");
////		// for DML purpose we uesd Transaction..
////		Transaction tx = session.getTransaction();
////
////		tx.begin();
////		//session.save(b);
////		//session.update(b1);
////		session.delete(b1);
////		tx.commit();
//		
//		//all the books select

	
//		Book b1 = session.get(Book.class, 4l);
//		System.out.println(b1);

		//all records book//bluckrow operation
//		Query<Book> query=session.createQuery(hql);
//		List<Book> bookList=query.list();
//		for(Book b:bookList)
//			System.out.println(b);
		
		//book name all
//		Query<String> query=session.createQuery(hql);
//		List<String> bookList=query.list();
//		for(String b:bookList)
//			System.out.println(b);
		//book price
//		Query<Double> query=session.createQuery(hql);
//		List<Double> bookList=query.list();
//		for(Double b:bookList)
//			System.out.println(b);
		//more than element
		Query<Object[]> query=session.createQuery(hql);
		query.setParameter("did", did);
		List<Object[]> bookList=query.list();
		for(Object[] obj:bookList)//because data come different data type so we can store it only object of array
			System.out.println(obj[0]+" - "+obj[1]+" - "+obj[2]+"  -"+obj[3]);
	
	}

}