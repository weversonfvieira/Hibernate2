package com.weverson.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Test {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		
		Empregado  empregado = new Empregado();
		
		empregado.setNome("Wadson F. Vieira");
		empregado.setSalario(1500);
		
		Endereco end = new Endereco();
		
		end.setCidade("São Lourenço");
		end.setEstado("PE");
		end.setPais("BR");
		
		
		empregado.setEndereco(end);
		end.setEmpregado(empregado);
		
		
		
		session.save(empregado);
		session.save(end);
		transaction.commit();
		
		session.close();
		
		System.out.println("Execução feita com sucesso");
		
		
	}

}
