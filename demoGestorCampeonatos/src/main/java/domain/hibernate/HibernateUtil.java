package domain.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.engine.spi.SessionFactoryImplementor;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	private <T> HibernateUtil(Class<T> clase){
		StandardServiceRegistry standardsServiceR = null;
		try {
			StandardServiceRegistryBuilder standardsServiceRB = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml");

			standardsServiceR = standardsServiceRB.build();

			MetadataSources mds = new MetadataSources(standardsServiceR);
			mds.addAnnotatedClass(clase);

			Metadata md = mds.buildMetadata();

			sessionFactory = md.buildSessionFactory();

		} catch (Throwable ex) {
			StandardServiceRegistryBuilder.destroy(standardsServiceR);
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static <T> SessionFactory getSessionFactory(Class<T> clase) {
		if(sessionFactory == null)
			new HibernateUtil(clase);
		return sessionFactory;
	}
}
