package ru.gb.iw.product_catalog.repositories.data;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.gb.iw.product_catalog.models.Category;


@RepositoryRestResource(path = "category", collectionResourceRel = "category")
public interface CategoryDataRestRepository extends PagingAndSortingRepository<Category, String>{

}