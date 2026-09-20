package defpackage;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzee;

/* JADX INFO: loaded from: classes3.dex */
public final class kz6 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ p97 x;
    public final /* synthetic */ u07 y;

    public /* synthetic */ kz6(u07 u07Var, p97 p97Var, int i) {
        this.w = i;
        this.y = u07Var;
        this.x = p97Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.w;
        u07 u07Var = this.y;
        p97 p97Var = this.x;
        switch (i) {
            case 0:
                zzee zzeeVar = u07Var.d;
                dq6 dq6Var = u07Var.a;
                if (zzeeVar != null) {
                    try {
                        oa3.h(p97Var);
                        zzeeVar.A(p97Var);
                    } catch (RemoteException e) {
                        bi6 bi6Var = dq6Var.i;
                        dq6.h(bi6Var);
                        bi6Var.f.c(e, "Failed to reset data on the service: remote exception");
                    }
                    u07Var.p();
                } else {
                    bi6 bi6Var2 = dq6Var.i;
                    dq6.h(bi6Var2);
                    bi6Var2.f.b("Failed to reset data on the service: not connected to service");
                }
                break;
            default:
                zzee zzeeVar2 = u07Var.d;
                dq6 dq6Var2 = u07Var.a;
                if (zzeeVar2 == null) {
                    bi6 bi6Var3 = dq6Var2.i;
                    dq6.h(bi6Var3);
                    bi6Var3.f.b("Discarding data. Failed to send app launch");
                } else {
                    try {
                        oa3.h(p97Var);
                        zzeeVar2.J(p97Var);
                        dq6Var2.n().k();
                        u07Var.i(zzeeVar2, null, p97Var);
                        u07Var.p();
                    } catch (RemoteException e2) {
                        bi6 bi6Var4 = dq6Var2.i;
                        dq6.h(bi6Var4);
                        bi6Var4.f.c(e2, "Failed to send app launch to the service");
                        return;
                    }
                }
                break;
        }
    }
}
