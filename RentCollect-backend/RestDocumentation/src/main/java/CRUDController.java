import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
@RequestMapping("/crud")
public class CRUDController {
     
    @GetMapping
    public List<CrudInput> read(@RequestBody CrudInput crudInput) {
        List<CrudInput> returnList = new ArrayList<CrudInput>();
        returnList.add(crudInput);
        return returnList;
    }
     
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public HttpHeaders save(@RequestBody CrudInput crudInput) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setLocation(
          linkTo(CRUDController.class).slash(crudInput.getTitle()).toUri());
        return httpHeaders;
    }
     
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id) {
        // delete
    }
}