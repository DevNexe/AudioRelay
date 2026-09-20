package defpackage;

import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: Uk€K, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class UkK implements Runnable {
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public UkK(Object obj, Object obj2) {
        this.w = obj;
        this.x = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Method method = HR47.d;
            Object obj = this.x;
            Object obj2 = this.w;
            if (method != null) {
                method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
            } else {
                HR47.e.invoke(obj2, obj, Boolean.FALSE);
            }
        } catch (RuntimeException e) {
            if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                throw e;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}
