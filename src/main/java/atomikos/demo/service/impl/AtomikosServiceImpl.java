package atomikos.demo.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import atomikos.demo.dao.CallLogDao;
import atomikos.demo.dao.TestDao;
import atomikos.demo.po.CallLogPO;
import atomikos.demo.po.TestPO;
import atomikos.demo.service.AtomikosService;

/**
 * @author InJavaWeTrust
 * @version 1.0.0.0  
 */

@Service
public class AtomikosServiceImpl implements AtomikosService {
	
	@Autowired
	private CallLogDao callLogDao;
	
	@Autowired
	private TestDao testDao;
	
	@Transactional
	public void testAtomikos() {
		//在Service中，调用事务的方法不能try-catch，否者不能回滚
//		try {
			CallLogPO entity = new CallLogPO();
			entity.setCallLogId(callLogDao.getSequence());
			entity.setCallLogName("A");
			entity.setCallResult("测试");
			entity.setCallSTime(new Date());
			entity.setCallETime(new Date());
			entity.setCallNbr("007");
			callLogDao.insert(entity);
			
			int i = 1 / 0;
			System.out.println(i);
			
			TestPO entity2 = new TestPO();
			entity2.setTestId(testDao.getSequence());
			entity2.setTestName("A");
			entity2.setTestResult("测试");
			entity2.setTestSTime(new Date());
			entity2.setTestETime(new Date());
			entity2.setTestNbr("008");
			testDao.insert(entity2);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}

}
