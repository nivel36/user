package es.nivel36.user;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserJpaRepository extends PagingAndSortingRepository<User, Long>, CrudRepository<User, Long> {

	User findByEmail(String name);

	Page<User> findByProfile(String profile, Pageable page);

	Page<User> findByCompany(String company, Pageable page);
}
