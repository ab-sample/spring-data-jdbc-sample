package com.qwfys.sample.spring.data.jdbc.repository;


import com.qwfys.sample.spring.data.jdbc.domain.UserRo;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends ListCrudRepository<UserRo, Integer>, ListPagingAndSortingRepository<UserRo, Integer> {

}
