package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Cette classe fait le lien entre mon api et ma bdd
 * L'interface JpaRepository va permettre de créer toutes les requètes que je vais faire vers la base de donné
 * Aucune requète n'es écrite parceque l'interface JpaRepository vient avec certaines requètes déja écrite
 */
@Repository
public interface StudentRepository extends JpaRepository<Student,Long > {
}
