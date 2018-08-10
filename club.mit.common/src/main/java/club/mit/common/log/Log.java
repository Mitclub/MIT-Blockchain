package club.mit.common.log;

import ch.qos.logback.classic.Level;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public final class Log {

	// single log object
	private static final Logger m_Log = LoggerFactory.getLogger(Log.class.getName());

	// log levels
	private static final Map<String, Level> m_LogLevel = new HashMap<>();

	private Log() {
	}

	@Override
	public String toString() {
		return super.toString();
	}

	// 初始化日志等级
	static {
		m_LogLevel.put("DEBUG", Level.DEBUG);
		m_LogLevel.put("INFO", Level.INFO);
		m_LogLevel.put("WARN", Level.WARN);
		m_LogLevel.put("ERROR", Level.ERROR);
	}

	public static void debug(String msg, Object... objs) {
		if (m_Log.isDebugEnabled()) {
			String logContent = getLogTrace()  + ":" + msg;
			m_Log.debug(logContent, objs);
		}
	}

	public static void debug(String msg, Throwable throwable) {
		if (m_Log.isDebugEnabled()) {
			String logContent = getLogTrace()  + ":" + msg;

			m_Log.debug(logContent, throwable);
		}
	}

	public static void info(String msg) {
		String logContent = getLogTrace()  + ":" + msg;
		m_Log.info(logContent);
	}

	public static void info(String msg, Object... objs) {
		String logContent = getLogTrace()  + ":" + msg;
		m_Log.info(logContent, objs);
	}

	public static void info(String msg, Throwable throwable) {
		String logContent = getLogTrace()  + ":" + msg;
		m_Log.info(logContent, throwable);
	}

	public static void warn(String msg) {
		String logContent = getLogTrace()  + ":" + msg;
		m_Log.warn(logContent);
	}

	public static void warn(String msg, Object... objs) {
		String logContent = getLogTrace()  + ":" + msg;
		m_Log.warn(logContent, objs);
	}

	public static void warn(String msg, Throwable throwable) {
		String logContent = getLogTrace()  + ":" + msg;
		m_Log.warn(logContent, throwable);
	}

	public static void error(String msg) {
		String logContent = getLogTrace()  + ":" + msg;
		m_Log.error(logContent);
	}

	public static void error(String msg, Object... objs) {
		String logContent = getLogTrace()  + ":" + msg;
		m_Log.error(logContent, objs);
	}

	public static void error(String msg, Throwable throwable) {
		String logContent = getLogTrace()  + ":" + msg;
		m_Log.error(logContent, throwable);
	}

	public static void error(Throwable throwable) {
		String logContent = getLogTrace() + ":";

		m_Log.error(logContent, throwable);
	}

	public static void trace(String msg) {
		String logContent = getLogTrace()  + ":" + msg;
		m_Log.trace(logContent);
	}

	public static void trace(String msg, Throwable throwable) {
		String logContent = getLogTrace()  + ":" + msg;
		m_Log.trace(logContent, throwable);
	}

	/**
	 * 获取程序的执行记录
	 */
	private static String getLogTrace() {
		StringBuilder logTrace = new StringBuilder();
		StackTraceElement stack[] = Thread.currentThread().getStackTrace();
		if (stack.length > 1) {
			StackTraceElement ste = stack[3];
			if (ste != null) {
				logTrace.append(ste.getClassName());
				logTrace.append('.');
				logTrace.append(ste.getMethodName());
				logTrace.append('(');
				logTrace.append(ste.getFileName());
				logTrace.append(':');
				logTrace.append(ste.getLineNumber());
				logTrace.append(')');
			}
		}
		return logTrace.toString();
	}
}
