package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.measurement.zzbp;
import com.google.android.gms.internal.measurement.zzbq;
import com.google.android.gms.internal.measurement.zzbr;

/* JADX INFO: loaded from: classes3.dex */
public final class hk6 implements ServiceConnection {
    public final String a;
    public final /* synthetic */ lk6 b;

    public hk6(lk6 lk6Var, String str) {
        this.b = lk6Var;
        this.a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        lk6 lk6Var = this.b;
        if (iBinder == null) {
            bi6 bi6Var = lk6Var.a.i;
            dq6.h(bi6Var);
            bi6Var.i.b("Install Referrer connection returned with null binder");
            return;
        }
        try {
            int i = zzbq.w;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            Object zzbpVar = iInterfaceQueryLocalInterface instanceof zzbr ? (zzbr) iInterfaceQueryLocalInterface : new zzbp(iBinder);
            if (zzbpVar == null) {
                bi6 bi6Var2 = lk6Var.a.i;
                dq6.h(bi6Var2);
                bi6Var2.i.b("Install Referrer Service implementation was not found");
            } else {
                bi6 bi6Var3 = lk6Var.a.i;
                dq6.h(bi6Var3);
                bi6Var3.n.b("Install Referrer Service connected");
                ro6 ro6Var = lk6Var.a.j;
                dq6.h(ro6Var);
                ro6Var.m(new vr5(this, zzbpVar, this, 1));
            }
        } catch (RuntimeException e) {
            bi6 bi6Var4 = lk6Var.a.i;
            dq6.h(bi6Var4);
            bi6Var4.i.c(e, "Exception occurred while calling Install Referrer API");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        bi6 bi6Var = this.b.a.i;
        dq6.h(bi6Var);
        bi6Var.n.b("Install Referrer Service disconnected");
    }
}
