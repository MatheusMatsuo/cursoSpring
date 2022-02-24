package com.educandoweb.cursoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.cursoSpring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
/*Para essa interface n será necessario implementar a interface,
 * pois já vem uma implementação padrão se JpaRepository<Entidade, Tipo Id da entidade>
 */
}
