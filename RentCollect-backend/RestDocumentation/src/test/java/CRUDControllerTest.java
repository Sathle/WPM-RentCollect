import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.restdocs.JUnitRestDocumentation;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

public class CRUDControllerTest {

	@Rule
	public JUnitRestDocumentation restDocumentation = new JUnitRestDocumentation("target/generated-snippets");


	@Autowired
	private WebApplicationContext context;
	 
	private MockMvc mockMvc;
	 
	@Before
	public void setUp(){
	    this.mockMvc = MockMvcBuilders.webAppContextSetup(this.context)
	      .apply(documentationConfiguration(this.restDocumentation))
	      .build();
	}

}
