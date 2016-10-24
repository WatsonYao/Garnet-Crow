package demo.kotlin.mathilda.love.watson.watsondemo

/**
 * Created by watson on 16/9/19.
 */
import android.util.Log

/**
 * 调试日志，发布正式版本时，请将logFlag置位成false
 *
 * @author Administrator
 */
class WLog private constructor(name: String) {

    private val logFlag = true
    val tag = "gcapp"
    private val logLevel = Log.VERBOSE
    private var mClassName: String = ""

    init {
        mClassName = name
    }

    companion object {
        fun log(): WLog = WLog("@")
    }


    /**
     * Get The Current Function Name
     *
     * @return
     */
    private fun getFunctionName(): String? {
        var sts = Thread.currentThread().stackTrace

        if (sts == null) {
            return null
        }

        for (st in sts) {
//

            if (st.isNativeMethod) {
                continue
            }

            if (st.className.equals(Thread::class.java.name)) {
                continue
            }
            if (st.className.equals(this.javaClass.name)) {
                continue
            }

            return mClassName + "[ " + Thread.currentThread().name + ": " + st.fileName + ":" + st.lineNumber + " " + st.methodName + " ]"
        }
        return null
    }

    /**
     * The Log Level:i
     *
     * @param str
     */
    fun i(str: Any) {
        if (logFlag) {
            if (logLevel <= Log.INFO) {
                val name = getFunctionName()
                if (name != null) {
                    Log.i(tag, name + " - " + str)
                } else {
                    Log.i(tag, str.toString())
                }
            }
        }

    }

    /**
     * The Log Level:d
     *
     * @param str
     */
    fun d(str: Any) {
        if (logFlag) {
            if (logLevel <= Log.DEBUG) {
                val name = getFunctionName()
                if (name != null) {
                    Log.d(tag, name + " - " + str)
                } else {
                    Log.d(tag, str.toString())
                }
            }
        }
    }

    /**
     * The Log Level:V
     *
     * @param str
     */
    fun v(str: Any) {
        if (logFlag) {
            if (logLevel <= Log.VERBOSE) {
                val name = getFunctionName()
                if (name != null) {
                    Log.v(tag, name + " - " + str)
                } else {
                    Log.v(tag, str.toString())
                }
            }
        }
    }

    /**
     * The Log Level:w
     *
     * @param str
     */
    fun w(str: Any) {
        if (logFlag) {
            if (logLevel <= Log.WARN) {
                val name = getFunctionName()
                if (name != null) {
                    Log.w(tag, name + " - " + str)
                } else {
                    Log.w(tag, str.toString())
                }
            }
        }
    }

    /**
     * The Log Level:e
     *
     * @param str
     */
    fun e(str: Any) {
        if (logFlag) {
            if (logLevel <= Log.ERROR) {
                val name = getFunctionName()
                if (name != null) {
                    Log.e(tag, name + " - " + str)
                } else {
                    Log.e(tag, str.toString())
                }
            }
        }
    }

    /**
     * The Log Level:e
     *
     * @param ex
     */
    fun e(ex: Exception) {
        if (logFlag) {
            if (logLevel <= Log.ERROR) {
                Log.e(tag, "error", ex)
            }
        }
    }

    /**
     * The Log Level:e
     *
     * @param log
     * @param tr
     */
    fun e(log: String, tr: Throwable) {
        if (logFlag) {
            val line = getFunctionName()
            Log.e(tag, "{Thread:" + Thread.currentThread().name + "}" + "[" + mClassName + line + ":] " + log + "\n", tr)
        }
    }
}