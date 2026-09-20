package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.zzee;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class fz6 implements Runnable {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ u07 B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int w = 0;
    public final /* synthetic */ String x;
    public final /* synthetic */ String y;
    public final /* synthetic */ p97 z;

    public fz6(u07 u07Var, String str, String str2, p97 p97Var, boolean z, zzcf zzcfVar) {
        this.B = u07Var;
        this.x = str;
        this.y = str2;
        this.z = p97Var;
        this.A = z;
        this.C = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        AtomicReference atomicReference;
        Bundle bundle;
        dq6 dq6Var;
        switch (this.w) {
            case 0:
                p97 p97Var = this.z;
                String str = this.x;
                Object obj = this.C;
                u07 u07Var = this.B;
                Bundle bundle2 = new Bundle();
                try {
                    try {
                        zzee zzeeVar = u07Var.d;
                        String str2 = this.y;
                        if (zzeeVar == null) {
                            bi6 bi6Var = u07Var.a.i;
                            dq6.h(bi6Var);
                            bi6Var.f.d(str, "Failed to get user properties; not connected to service", str2);
                            dq6Var = u07Var.a;
                            m37 m37Var = dq6Var.l;
                            dq6.f(m37Var);
                            m37Var.y((zzcf) obj, bundle2);
                            return;
                        }
                        oa3.h(p97Var);
                        List<d37> listM0 = zzeeVar.m0(str, str2, this.A, p97Var);
                        bundle = new Bundle();
                        if (listM0 != null) {
                            for (d37 d37Var : listM0) {
                                String str3 = d37Var.A;
                                String str4 = d37Var.x;
                                if (str3 != null) {
                                    bundle.putString(str4, str3);
                                } else {
                                    Long l = d37Var.z;
                                    if (l != null) {
                                        bundle.putLong(str4, l.longValue());
                                    } else {
                                        Double d = d37Var.C;
                                        if (d != null) {
                                            bundle.putDouble(str4, d.doubleValue());
                                        }
                                    }
                                }
                            }
                        }
                        try {
                            u07Var.p();
                            m37 m37Var2 = u07Var.a.l;
                            dq6.f(m37Var2);
                            m37Var2.y((zzcf) obj, bundle);
                            return;
                        } catch (RemoteException e) {
                            e = e;
                            bundle2 = bundle;
                            bi6 bi6Var2 = u07Var.a.i;
                            dq6.h(bi6Var2);
                            bi6Var2.f.d(str, "Failed to get user properties; remote exception", e);
                            dq6Var = u07Var.a;
                            m37 m37Var3 = dq6Var.l;
                            dq6.f(m37Var3);
                            m37Var3.y((zzcf) obj, bundle2);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            m37 m37Var4 = u07Var.a.l;
                            dq6.f(m37Var4);
                            m37Var4.y((zzcf) obj, bundle);
                            throw th;
                        }
                    } catch (RemoteException e2) {
                        e = e2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bundle = bundle2;
                }
                break;
            default:
                synchronized (((AtomicReference) this.C)) {
                    try {
                        try {
                            u07 u07Var2 = this.B;
                            zzee zzeeVar2 = u07Var2.d;
                            if (zzeeVar2 == null) {
                                bi6 bi6Var3 = u07Var2.a.i;
                                dq6.h(bi6Var3);
                                bi6Var3.f.e("(legacy) Failed to get user properties; not connected to service", null, this.x, this.y);
                                ((AtomicReference) this.C).set(Collections.emptyList());
                                ((AtomicReference) this.C).notify();
                                return;
                            }
                            if (TextUtils.isEmpty(null)) {
                                oa3.h(this.z);
                                ((AtomicReference) this.C).set(zzeeVar2.m0(this.x, this.y, this.A, this.z));
                            } else {
                                ((AtomicReference) this.C).set(zzeeVar2.m(null, this.x, this.y, this.A));
                            }
                            this.B.p();
                            atomicReference = (AtomicReference) this.C;
                            atomicReference.notify();
                            return;
                        } catch (RemoteException e3) {
                            bi6 bi6Var4 = this.B.a.i;
                            dq6.h(bi6Var4);
                            bi6Var4.f.e("(legacy) Failed to get user properties; remote exception", null, this.x, e3);
                            ((AtomicReference) this.C).set(Collections.emptyList());
                            atomicReference = (AtomicReference) this.C;
                        }
                    } catch (Throwable th3) {
                        ((AtomicReference) this.C).notify();
                        throw th3;
                    }
                }
                break;
        }
    }

    public fz6(u07 u07Var, AtomicReference atomicReference, String str, String str2, p97 p97Var, boolean z) {
        this.B = u07Var;
        this.C = atomicReference;
        this.x = str;
        this.y = str2;
        this.z = p97Var;
        this.A = z;
    }
}
