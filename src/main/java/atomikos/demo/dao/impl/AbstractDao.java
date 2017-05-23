package atomikos.demo.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;

import atomikos.demo.dao.DAO;
import atomikos.demo.util.StringUtil;

/**
 * @author InJavaWeTrust
 * @version 1.0.0.0  
 */

public abstract class AbstractDao<E> implements DAO<E> {

	protected abstract SqlSessionTemplate getSqlSessionTemplate();

	protected abstract String getNamespace();
	
	public String getSequence() {
		return StringUtil.getUUID();
	}
	
	public int insert(E entity) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("entity", entity);
		return getSqlSessionTemplate().insert(getNamespace() + ".insert",
				params);
	}

}
