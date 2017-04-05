
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author kangyonggan
 * @since 4/5/17
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring-la-remote.xml"})
public abstract class AbstractServiceTest extends AbstractJUnit4SpringContextTests {

    protected Logger log = LogManager.getLogger(AbstractServiceTest.class);

}
