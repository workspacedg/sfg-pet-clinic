package alexdiaz.springframework.sfgpetclinic.repositories;

import alexdiaz.springframework.sfgpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality,Long> {
}
