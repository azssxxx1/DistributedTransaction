package atomikos.demo.dao.impl;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import atomikos.demo.dao.CallLogDao;
import atomikos.demo.po.CallLogPO;

/**
 * @author InJavaWeTrust
 * @version 1.0.0.0  
 */

@Repository("callLogDao")
public class CallLogDaoImpl extends AbstractDao<CallLogPO> implements CallLogDao {
	
	@Resource
    private SqlSessionTemplate scottSqlSessionTemplate;

	@Override
	protected SqlSessionTemplate getSqlSessionTemplate() {
		return scottSqlSessionTemplate;
	}
	
	@Override
	protected String getNamespace() {
		return "atomikoscallLogDAO";
	}

	@Override
	public String getSequence() {
		return super.getSequence();
	}

	public int insert(CallLogPO entity) {
		return super.insert(entity);
	}
	
}
