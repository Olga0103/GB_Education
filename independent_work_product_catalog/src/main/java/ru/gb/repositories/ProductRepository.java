package ru.gb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gb.models.Product;

import java.util.UUID;


@Repository
public interface ProductRepository extends JpaRepository<Product, UUID>{

}