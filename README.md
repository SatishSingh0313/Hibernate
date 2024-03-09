# Hibernate

1. add (persistence.xml).
   
<persistence xmlns="http://xmlns.jcp.org/xml/ns/persistence"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence
  http://xmlns.jcp.org/xml/ns/persistence/persistence_2_1.xsd"
	version="2.1">

	<persistence-unit name="satish">
		<provider>org.hibernate.jpa.HibernatePersistenceProvider</provider>
		<properties>
			<property name="javax.persistence.jdbc.driver"
				value="com.mysql.cj.jdbc.Driver" />
			<property name="javax.persistence.jdbc.url"
				value="jdbc:mysql://localhost:3306/watches" />
			<property name="javax.persistence.jdbc.user"
				value="root" />
			<property name="javax.persistence.jdbc.password"
				value="root" />
			<property name="hibernate.show_sql" value="true" />


			<property name="hibernate.hbm2ddl.auto" value="update" />
			<property name="hibernate.dialect" value="org.hibernate.dialect.MySQL8Dialect"/>
  			
		</properties>
	</persistence-unit>
</persistence>

2. add dependencies inside (pom.xml)
   
<dependencies>
  <!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.28</version>
</dependency>

<!-- https://mvnrepository.com/artifact/org.hibernate/hibernate-core -->
<dependency>
    <groupId>org.hibernate</groupId>
    <artifactId>hibernate-core</artifactId>
    <version>5.6.10.Final</version>
</dependency>
  </dependencies>
