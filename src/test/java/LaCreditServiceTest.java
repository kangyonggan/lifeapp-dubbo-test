import com.shhxzq.fin.lifeapp.model.credit.dto.QueryProvCityAreaResponse;
import com.shhxzq.fin.lifeapp.service.credit.LaCreditService;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * @author kangyonggan
 * @since 4/5/17
 */
public class LaCreditServiceTest extends AbstractServiceTest {

    @Resource
    private LaCreditService laCreditService;

    @Test
    public void testQueryProvCityArea() {
        QueryProvCityAreaResponse response = laCreditService.queryProvCityArea();

        log.info("response：{}", response);

        log.info("code:{}", response.getRespCode());
        log.info("msg:{}", response.getRespMsg());
        log.info("tranSt:{}", response.getTranState());
        log.info("list:{}", response.getProvCityAreaList());
        log.info("list.size:{}", response.getProvCityAreaList().size());
    }

}
