package sample.tags.bootandreact.repo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import sample.tags.bootandreact.domain.Employee;
import sample.tags.bootandreact.loadersandwriters.DataLoaders;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
public class EmployeeRepo {
   private Map<Integer, Employee> _empRepo;

   public void _init() {
      try {
         DataLoaders _dataLoaders = new DataLoaders();
         List<Employee> empList = _dataLoaders.getEmpDataFromFile();
         _empRepo = empList.stream().collect(Collectors.toMap(e -> e.getId(), e -> e));
      } catch (IOException e) {
         log.error("Error in loading EMP data");
         e.printStackTrace();
      }
   }

   public Employee getById(Integer id) {
      return _empRepo.get(id);
   }

   public void addToRepo(Employee e) {
      _empRepo.put(e.getId(), e);
   }

   public void removeFromRepo(Employee e) {
      _empRepo.remove(e.getId());
   }

   public void reload() {
      _init();
   }

   public List<Employee> getAllEmployees() {
      return new ArrayList<>(_empRepo.values());
   }
}
