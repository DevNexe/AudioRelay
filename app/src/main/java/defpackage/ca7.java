package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.T23;
import java.util.HashMap;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
public final class ca7 extends ma1 {

    @GuardedBy("connectionStatus")
    public final HashMap d = new HashMap();
    public final Context e;
    public volatile yx6 f;
    public final e60 g;
    public final long h;
    public final long i;

    public ca7(Context context, Looper looper) {
        m97 m97Var = new m97(this);
        this.e = context.getApplicationContext();
        this.f = new yx6(looper, m97Var);
        this.g = e60.b();
        this.h = 5000L;
        this.i = 300000L;
    }

    @Override // defpackage.ma1
    public final boolean c(i57 i57Var, T23 t23, String str, Executor executor) {
        boolean z;
        synchronized (this.d) {
            try {
                t67 t67Var = (t67) this.d.get(i57Var);
                if (t67Var == null) {
                    t67Var = new t67(this, i57Var);
                    t67Var.a.put(t23, t23);
                    t67Var.a(str, executor);
                    this.d.put(i57Var, t67Var);
                } else {
                    this.f.removeMessages(0, i57Var);
                    if (t67Var.a.containsKey(t23)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(i57Var.toString()));
                    }
                    t67Var.a.put(t23, t23);
                    int i = t67Var.b;
                    if (i == 1) {
                        t23.onServiceConnected(t67Var.f, t67Var.d);
                    } else if (i == 2) {
                        t67Var.a(str, executor);
                    }
                }
                z = t67Var.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
