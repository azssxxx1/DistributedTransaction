package atomikos.demo.dao.impl;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import atomikos.demo.dao.TestDao;
import atomikos.demo.po.TestPO;
import atomikos.demo.util.StringUtil;

/**
 * @author InJavaWeTrust
 * @version 1.0.0.0  
 */

@Repository("testDao")
public class TestDaoImpl extends AbstractDao<TestPO> implements TestDao {
	
	@Resource
    private SqlSessionTemplate testSqlSessionTemplate;

	@Override
	protected SqlSessionTemplate getSqlSessionTemplate() {
		return testSqlSessionTemplate;
	}

	@Override
	protected String getNamespace() {
		return "atomikostestDAO";
	}

	@Override
	public String getSequence() {
		return StringUtil.getUUID();
	}
	
	public int insert(TestPO entity) {
		return super.insert(entity);
	}

}
