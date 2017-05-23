package atomikos.demo.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import atomikos.demo.dao.TestDao;
import atomikos.demo.po.TestPO;
import atomikos.demo.service.TestService;

/**
 * @author InJavaWeTrust
 * @version 1.0.0.0  
 */

@Service
public class TestServiceImpl implements TestService {
	
	@Autowired
	private TestDao testDao;

	public int insert() {
		TestPO entity = new TestPO();
		entity.setTestId(testDao.getSequence());
		entity.setTestName("A");
		entity.setTestResult("测试");
		entity.setTestSTime(new Date());
		entity.setTestETime(new Date());
		entity.setTestNbr("008");
		return testDao.insert(entity);
	}

}
