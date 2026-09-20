package defpackage;

import android.content.Context;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.T23;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class ma1 {
    public static final Object a = new Object();
    public static ca7 b;
    public static HandlerThread c;

    public static ca7 a(Context context) {
        synchronized (a) {
            if (b == null) {
                b = new ca7(context.getApplicationContext(), context.getMainLooper());
            }
        }
        return b;
    }

    public final void b(String str, String str2, int i, T23 t23, boolean z) {
        i57 i57Var = new i57(str, i, str2, z);
        ca7 ca7Var = (ca7) this;
        synchronized (ca7Var.d) {
            t67 t67Var = (t67) ca7Var.d.get(i57Var);
            if (t67Var == null) {
                throw new IllegalStateException("Nonexistent connection status for service config: ".concat(i57Var.toString()));
            }
            if (!t67Var.a.containsKey(t23)) {
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(i57Var.toString()));
            }
            t67Var.a.remove(t23);
            if (t67Var.a.isEmpty()) {
                ca7Var.f.sendMessageDelayed(ca7Var.f.obtainMessage(0, i57Var), ca7Var.h);
            }
        }
    }

    public abstract boolean c(i57 i57Var, T23 t23, String str, Executor executor);
}
