package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
public final class au4 {
    public static final ReentrantLock c = new ReentrantLock();

    @GuardedBy("sLk")
    public static au4 d;
    public final ReentrantLock a = new ReentrantLock();

    @GuardedBy("mLk")
    public final SharedPreferences b;

    public au4(Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static au4 a(Context context) {
        oa3.h(context);
        ReentrantLock reentrantLock = c;
        reentrantLock.lock();
        try {
            if (d == null) {
                d = new au4(context.getApplicationContext());
            }
            return d;
        } finally {
            reentrantLock.unlock();
        }
    }
}
