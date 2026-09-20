package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.Bt;
import defpackage.a32;
import defpackage.d32;
import defpackage.hk1;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements hk1<d32> {
    @Override // defpackage.hk1
    public final List<Class<? extends hk1<?>>> a() {
        return Collections.emptyList();
    }

    @Override // defpackage.hk1
    public final d32 b(Context context) {
        if (!Bt.c(context).b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily. \nPlease ensure that you have: \n<meta-data\n    android:name='androidx.lifecycle.ProcessLifecycleInitializer' \n    android:value='androidx.startup' /> \nunder InitializationProvider in your AndroidManifest.xml");
        }
        if (!a32.a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new a32.QnHx());
        }
        EQ eq = EQ.E;
        eq.getClass();
        eq.A = new Handler();
        eq.B.f(YKK.CQf.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new FJCM(eq));
        return eq;
    }
}
