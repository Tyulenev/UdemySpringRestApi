//package ru.tyulenev.Rest.Configuration;
//
//import com.mchange.v2.c3p0.ComboPooledDataSource;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.orm.hibernate5.HibernateTransactionManager;
//import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//
//import javax.sql.DataSource;
//import java.beans.PropertyVetoException;
//import java.util.Properties;
//
//@Configuration
//@ComponentScan(basePackages = "ru.tyulenev.Rest")
//@EnableWebMvc
//@EnableTransactionManagement
//public class MyConfig {
////    connection with DB
//    @Bean
//    public DataSource dataSource() {
//        ComboPooledDataSource dataSource = new ComboPooledDataSource();
//        try {
//            dataSource.setDriverClass("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            dataSource.setJdbcUrl("jdbc:sqlserver://localhost:1433;databaseName=Test_AT_DB");
//            dataSource.setUser("sa");
//            dataSource.setPassword("123@dodjPemo");
//        } catch (PropertyVetoException e) {
//            e.printStackTrace();
//        }
//        return dataSource();
//    }
//
//    @Bean
//    public LocalSessionFactoryBean sessionFactory() {
//        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//        sessionFactory.setDataSource(dataSource());
//        sessionFactory.setPackagesToScan("ru.tyulenev.Rest.entity");
//
//        Properties hibernateProperties = new Properties();
//        hibernateProperties.setProperty("hibernate.dialect",
//                "org.hibernate.dialect.SQLServerDialect");
//        hibernateProperties.setProperty("hibernate.show_sql",
//                "true");
//
//        sessionFactory.setHibernateProperties(hibernateProperties);
//        return sessionFactory;
//    }
//
//    @Bean
//    public HibernateTransactionManager transactionManager() {
//        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
//        transactionManager.setSessionFactory(sessionFactory().getObject());
//        return transactionManager;
//    }
//}
