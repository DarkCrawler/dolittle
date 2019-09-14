package sample.tags.bootandreact.loadersandwriters;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import sample.tags.bootandreact.domain.Employee;

import java.io.IOException;
import java.util.List;

@Component
@Slf4j
public class DataLoaders {
   public List<Employee> getEmpDataFromFile() throws IOException {
      ObjectMapper objectMapper = new ObjectMapper();
      log.info("!!Loading data from file .....EmpTempDB.json");
      List<Employee> empList = objectMapper.readValue(getClass().getClassLoader().getResourceAsStream("datarepos/EmpTempDB.json"), new TypeReference<List<Employee>>() {
      });
      log.info("Total Employee data loaded ... {}", empList.size());
      return empList;
   }
}
