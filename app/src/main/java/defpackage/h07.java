package defpackage;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzee;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class h07 implements Runnable {
    public final /* synthetic */ u07 A;
    public final /* synthetic */ AtomicReference w;
    public final /* synthetic */ String x;
    public final /* synthetic */ String y;
    public final /* synthetic */ p97 z;

    public h07(u07 u07Var, AtomicReference atomicReference, String str, String str2, p97 p97Var) {
        this.A = u07Var;
        this.w = atomicReference;
        this.x = str;
        this.y = str2;
        this.z = p97Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.w) {
            try {
                try {
                    u07 u07Var = this.A;
                    zzee zzeeVar = u07Var.d;
                    if (zzeeVar == null) {
                        bi6 bi6Var = u07Var.a.i;
                        dq6.h(bi6Var);
                        bi6Var.f.e("(legacy) Failed to get conditional properties; not connected to service", null, this.x, this.y);
                        this.w.set(Collections.emptyList());
                        this.w.notify();
                        return;
                    }
                    if (TextUtils.isEmpty(null)) {
                        oa3.h(this.z);
                        this.w.set(zzeeVar.P(this.x, this.y, this.z));
                    } else {
                        this.w.set(zzeeVar.C(null, this.x, this.y));
                    }
                    this.A.p();
                    atomicReference = this.w;
                    atomicReference.notify();
                } catch (RemoteException e) {
                    bi6 bi6Var2 = this.A.a.i;
                    dq6.h(bi6Var2);
                    bi6Var2.f.e("(legacy) Failed to get conditional properties; remote exception", null, this.x, e);
                    this.w.set(Collections.emptyList());
                    atomicReference = this.w;
                }
            } catch (Throwable th) {
                this.w.notify();
                throw th;
            }
        }
    }
}
