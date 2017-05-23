package atomikos.demo.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import atomikos.demo.dao.CallLogDao;
import atomikos.demo.po.CallLogPO;
import atomikos.demo.service.CallLogService;

/**
 * @author InJavaWeTrust
 * @version 1.0.0.0  
 */

@Service
public class CallLogServiceImpl implements CallLogService {
	
	@Autowired
	private CallLogDao callLogDao;
	
	public int insert() {
		CallLogPO entity = new CallLogPO();
		entity.setCallLogId(callLogDao.getSequence());
		entity.setCallLogName("A");
		entity.setCallResult("测试");
		entity.setCallSTime(new Date());
		entity.setCallETime(new Date());
		entity.setCallNbr("007");
		return callLogDao.insert(entity);
	}

}
