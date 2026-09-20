package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzbr;
import com.google.android.gms.measurement.internal.zzee;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class vr5 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ vr5(Object obj, Object obj2, Object obj3, int i) {
        this.w = i;
        this.z = obj;
        this.x = obj2;
        this.y = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        switch (this.w) {
            case 0:
                x26 x26Var = (x26) this.z;
                x26Var.getClass();
                x26Var.getClass();
                x26Var.getClass();
                x26Var.getClass();
                x26Var.getClass();
                return;
            case 1:
                hk6 hk6Var = (hk6) this.z;
                lk6 lk6Var = hk6Var.b;
                zzbr zzbrVar = (zzbr) this.x;
                dq6 dq6Var = lk6Var.a;
                ro6 ro6Var = dq6Var.j;
                dq6.h(ro6Var);
                ro6Var.e();
                Bundle bundle = new Bundle();
                bundle.putString("package_name", hk6Var.a);
                try {
                    if (zzbrVar.zzd(bundle) == null) {
                        bi6 bi6Var = dq6Var.i;
                        dq6.h(bi6Var);
                        bi6Var.f.b("Install Referrer Service returned a null response");
                    }
                    break;
                } catch (Exception e) {
                    bi6 bi6Var2 = dq6Var.i;
                    dq6.h(bi6Var2);
                    bi6Var2.f.c(e.getMessage(), "Exception occurred while retrieving the Install Referrer");
                }
                ro6 ro6Var2 = dq6Var.j;
                dq6.h(ro6Var2);
                ro6Var2.e();
                throw new IllegalStateException("Unexpected call on client side");
            default:
                synchronized (((AtomicReference) this.x)) {
                    try {
                        try {
                            xj6 xj6Var = ((u07) this.z).a.h;
                            dq6.f(xj6Var);
                            if (xj6Var.k().f(hw5.ANALYTICS_STORAGE)) {
                                u07 u07Var = (u07) this.z;
                                zzee zzeeVar = u07Var.d;
                                if (zzeeVar != null) {
                                    oa3.h((p97) this.y);
                                    ((AtomicReference) this.x).set(zzeeVar.d((p97) this.y));
                                    String str = (String) ((AtomicReference) this.x).get();
                                    if (str != null) {
                                        dy6 dy6Var = ((u07) this.z).a.p;
                                        dq6.g(dy6Var);
                                        dy6Var.g.set(str);
                                        xj6 xj6Var2 = ((u07) this.z).a.h;
                                        dq6.f(xj6Var2);
                                        xj6Var2.f.b(str);
                                    }
                                    ((u07) this.z).p();
                                    atomicReference = (AtomicReference) this.x;
                                    atomicReference.notify();
                                    return;
                                }
                                bi6 bi6Var3 = u07Var.a.i;
                                dq6.h(bi6Var3);
                                bi6Var3.f.b("Failed to get app instance id");
                                atomicReference2 = (AtomicReference) this.x;
                            } else {
                                bi6 bi6Var4 = ((u07) this.z).a.i;
                                dq6.h(bi6Var4);
                                bi6Var4.k.b("Analytics storage consent denied; will not get app instance id");
                                dy6 dy6Var2 = ((u07) this.z).a.p;
                                dq6.g(dy6Var2);
                                dy6Var2.g.set(null);
                                xj6 xj6Var3 = ((u07) this.z).a.h;
                                dq6.f(xj6Var3);
                                xj6Var3.f.b(null);
                                ((AtomicReference) this.x).set(null);
                                atomicReference2 = (AtomicReference) this.x;
                            }
                            atomicReference2.notify();
                            return;
                        } catch (RemoteException e2) {
                            bi6 bi6Var5 = ((u07) this.z).a.i;
                            dq6.h(bi6Var5);
                            bi6Var5.f.c(e2, "Failed to get app instance id");
                            atomicReference = (AtomicReference) this.x;
                        }
                    } catch (Throwable th) {
                        ((AtomicReference) this.x).notify();
                        throw th;
                    }
                }
                break;
        }
    }
}
