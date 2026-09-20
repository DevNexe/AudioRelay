package defpackage;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class m97 implements Handler.Callback {
    public final /* synthetic */ ca7 w;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.w.d) {
                try {
                    i57 i57Var = (i57) message.obj;
                    t67 t67Var = (t67) this.w.d.get(i57Var);
                    if (t67Var != null && t67Var.a.isEmpty()) {
                        if (t67Var.c) {
                            t67Var.g.f.removeMessages(1, t67Var.e);
                            ca7 ca7Var = t67Var.g;
                            ca7Var.g.c(ca7Var.e, t67Var);
                            t67Var.c = false;
                            t67Var.b = 2;
                        }
                        this.w.d.remove(i57Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        synchronized (this.w.d) {
            i57 i57Var2 = (i57) message.obj;
            t67 t67Var2 = (t67) this.w.d.get(i57Var2);
            if (t67Var2 != null && t67Var2.b == 3) {
                String strValueOf = String.valueOf(i57Var2);
                Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(strValueOf), new Exception());
                ComponentName componentName = t67Var2.f;
                if (componentName == null) {
                    i57Var2.getClass();
                    componentName = null;
                }
                if (componentName == null) {
                    String str = i57Var2.b;
                    oa3.h(str);
                    componentName = new ComponentName(str, "unknown");
                }
                t67Var2.onServiceDisconnected(componentName);
            }
        }
        return true;
    }
}
