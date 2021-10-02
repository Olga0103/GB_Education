package ru.gb.repositories.data;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.gb.models.Discount;


@RepositoryRestResource(path = "discount", collectionResourceRel = "discount")
public interface DiscountDataRestRepository extends PagingAndSortingRepository<Discount, String> {

}