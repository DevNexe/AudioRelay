package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.internal.QnHx;
import com.google.android.gms.measurement.internal.zzec;
import com.google.android.gms.measurement.internal.zzee;

/* JADX INFO: loaded from: classes3.dex */
public final class s07 implements ServiceConnection, QnHx.InterfaceC0075QnHx, QnHx.CQf {
    public volatile boolean a;
    public volatile nh6 b;
    public final /* synthetic */ u07 c;

    public s07(u07 u07Var) {
        this.c = u07Var;
    }

    @Override // com.google.android.gms.common.internal.QnHx.InterfaceC0075QnHx
    public final void onConnected(Bundle bundle) {
        oa3.d("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                oa3.h(this.b);
                zzee zzeeVar = (zzee) this.b.getService();
                ro6 ro6Var = this.c.a.j;
                dq6.h(ro6Var);
                ro6Var.m(new tb7(this, zzeeVar, 11));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.b = null;
                this.a = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.QnHx.CQf
    public final void onConnectionFailed(z50 z50Var) {
        oa3.d("MeasurementServiceConnection.onConnectionFailed");
        bi6 bi6Var = this.c.a.i;
        if (bi6Var == null || !bi6Var.b) {
            bi6Var = null;
        }
        if (bi6Var != null) {
            bi6Var.i.c(z50Var, "Service connection failed");
        }
        synchronized (this) {
            this.a = false;
            this.b = null;
        }
        ro6 ro6Var = this.c.a.j;
        dq6.h(ro6Var);
        ro6Var.m(new zw6(this, 1));
    }

    @Override // com.google.android.gms.common.internal.QnHx.InterfaceC0075QnHx
    public final void onConnectionSuspended(int i) {
        oa3.d("MeasurementServiceConnection.onConnectionSuspended");
        u07 u07Var = this.c;
        bi6 bi6Var = u07Var.a.i;
        dq6.h(bi6Var);
        bi6Var.m.b("Service connection suspended");
        ro6 ro6Var = u07Var.a.j;
        dq6.h(ro6Var);
        ro6Var.m(new o17(this, 7));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        oa3.d("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.a = false;
                bi6 bi6Var = this.c.a.i;
                dq6.h(bi6Var);
                bi6Var.f.b("Service connected with null binder");
                return;
            }
            Object zzecVar = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    zzecVar = iInterfaceQueryLocalInterface instanceof zzee ? (zzee) iInterfaceQueryLocalInterface : new zzec(iBinder);
                    bi6 bi6Var2 = this.c.a.i;
                    dq6.h(bi6Var2);
                    bi6Var2.n.b("Bound to IMeasurementService interface");
                } else {
                    bi6 bi6Var3 = this.c.a.i;
                    dq6.h(bi6Var3);
                    bi6Var3.f.c(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                bi6 bi6Var4 = this.c.a.i;
                dq6.h(bi6Var4);
                bi6Var4.f.b("Service connect failed to get IMeasurementService");
            }
            if (zzecVar == null) {
                this.a = false;
                try {
                    e60 e60VarB = e60.b();
                    u07 u07Var = this.c;
                    e60VarB.c(u07Var.a.a, u07Var.c);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                ro6 ro6Var = this.c.a.j;
                dq6.h(ro6Var);
                ro6Var.m(new ta7(this, zzecVar, 15));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        oa3.d("MeasurementServiceConnection.onServiceDisconnected");
        u07 u07Var = this.c;
        bi6 bi6Var = u07Var.a.i;
        dq6.h(bi6Var);
        bi6Var.m.b("Service disconnected");
        ro6 ro6Var = u07Var.a.j;
        dq6.h(ro6Var);
        ro6Var.m(new iq5(12, this, componentName));
    }
}
