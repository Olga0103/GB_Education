package ru.gb.iw.product_catalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gb.iw.product_catalog.models.Product;

import java.util.UUID;


@Repository
public interface ProductRepository extends JpaRepository<Product, UUID>{

}