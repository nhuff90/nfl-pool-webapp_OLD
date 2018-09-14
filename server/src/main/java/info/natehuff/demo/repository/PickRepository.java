package info.natehuff.demo.repository;

import info.natehuff.demo.dto.Pick;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PickRepository extends JpaRepository<Pick, Long> {
}