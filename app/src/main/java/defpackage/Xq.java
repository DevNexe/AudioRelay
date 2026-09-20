package defpackage;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class Xq extends Handler {
    public static final Xq a = new Xq();

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int i;
        int iMin;
        CopyOnWriteArraySet<Logger> copyOnWriteArraySet = Oe.a;
        String loggerName = logRecord.getLoggerName();
        if (logRecord.getLevel().intValue() > Level.INFO.intValue()) {
            i = 5;
        } else {
            i = logRecord.getLevel().intValue() == Level.INFO.intValue() ? 4 : 3;
        }
        String message = logRecord.getMessage();
        Throwable thrown = logRecord.getThrown();
        String strZ = Oe.b.get(loggerName);
        if (strZ == null) {
            strZ = pv4.Z(23, loggerName);
        }
        if (Log.isLoggable(strZ, i)) {
            if (thrown != null) {
                message = message + '\n' + ((Object) Log.getStackTraceString(thrown));
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                int iE = mv4.E(message, '\n', i2, false, 4);
                if (iE == -1) {
                    iE = length;
                }
                while (true) {
                    iMin = Math.min(iE, i2 + 4000);
                    Log.println(i, strZ, message.substring(i2, iMin));
                    if (iMin >= iE) {
                        break;
                    } else {
                        i2 = iMin;
                    }
                }
                i2 = iMin + 1;
            }
        }
    }
}
