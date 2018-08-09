package club.mit.db.access;

import java.io.File;
import java.io.IOException;
import java.util.Comparator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.iq80.leveldb.DB;
import org.iq80.leveldb.DBFactory;
import org.iq80.leveldb.Options;
import org.iq80.leveldb.impl.Iq80DBFactory;

import com.dyuproject.protostuff.runtime.RuntimeSchema;

import club.mit.db.consts.DBConsts;
import club.mit.db.model.BaseEntity;

public class DBAccess {
	private static final Map<Class, RuntimeSchema> SCHEMA_MAP = new ConcurrentHashMap<>();

	public static String getDataBaseName() {
		return DBConsts.M_DataBaseName;
	}

	public static Boolean init() {
		synchronized (DBAccess.class) {
			
			RuntimeSchema schema = RuntimeSchema.createFrom(BaseEntity.class);
			SCHEMA_MAP.put(BaseEntity.class, schema);

			// Init Database
			String dbPath = DBConsts.M_DataBasePath + File.separator + DBConsts.M_DataBaseName;
            File dir = new File(dbPath);
            if (!dir.exists()) {
                dir.mkdir();
            }
            String filePath = DBConsts.M_DataBasePath + File.separator + DBConsts.M_DataBaseName;
            try {
                DB db = openDB(filePath, true, null, null);
            } catch (IOException e) {
            }
            
			return true;
		}
	}
	
	private static DB openDB(String dbPath, boolean createIfMissing, Long cacheSize, Comparator<byte[]> comparator) throws IOException {
        File file = new File(dbPath);
        Options options = new Options().createIfMissing(createIfMissing);

        DBFactory factory = Iq80DBFactory.factory;
        return factory.open(file, options);
    }
}
