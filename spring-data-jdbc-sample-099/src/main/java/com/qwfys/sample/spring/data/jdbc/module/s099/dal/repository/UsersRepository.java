package com.qwfys.sample.spring.data.jdbc.module.s099.dal.repository;


import com.qwfys.sample.spring.data.jdbc.module.s099.dal.domain.UserRo;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends ListCrudRepository<UserRo, Integer>, ListPagingAndSortingRepository<UserRo, Integer> {

}
