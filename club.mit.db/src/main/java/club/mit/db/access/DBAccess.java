package club.mit.db.access;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.dyuproject.protostuff.runtime.RuntimeSchema;

import club.mit.db.consts.DBConsts;
import club.mit.db.module.BaseEntity;

public class DBAccess {
	private static final Map<Class, RuntimeSchema> SCHEMA_MAP = new ConcurrentHashMap<>();

	public static String getDataBaseName() {
		return DBConsts.M_DataBaseName;
	}

	public static Boolean init() {
		synchronized (DBAccess.class) {
			RuntimeSchema schema = RuntimeSchema.createFrom(BaseEntity.class);
			SCHEMA_MAP.put(BaseEntity.class, schema);

			return true;
		}
	}
}
