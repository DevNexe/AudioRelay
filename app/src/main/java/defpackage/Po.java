package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class Po {
    public static final rb1 a;

    public static final class QnHx {
        public static final rb1 a = new rb1(new Handler(Looper.getMainLooper()));
    }

    static {
        try {
            rb1 rb1Var = QnHx.a;
            if (rb1Var == null) {
                throw new NullPointerException("Scheduler Callable returned null");
            }
            a = rb1Var;
        } catch (Throwable th) {
            throw uu0.d(th);
        }
    }

    public static rb1 a() {
        rb1 rb1Var = a;
        if (rb1Var != null) {
            return rb1Var;
        }
        throw new NullPointerException("scheduler == null");
    }
}
