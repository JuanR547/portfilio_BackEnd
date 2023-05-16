
package com.portfolioJR.jr.Security.Repository;

import com.portfolioJR.jr.Security.Entity.Rol;
import com.portfolioJR.jr.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
