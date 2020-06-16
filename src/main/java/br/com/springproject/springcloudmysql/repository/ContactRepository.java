package br.com.springproject.springcloudmysql.repository;

import br.com.springproject.springcloudmysql.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
}
