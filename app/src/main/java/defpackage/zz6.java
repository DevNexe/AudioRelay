package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.zzee;

/* JADX INFO: loaded from: classes3.dex */
public final class zz6 implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int w;
    public final /* synthetic */ String x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public zz6(u07 u07Var, m16 m16Var, String str, zzcf zzcfVar) {
        this.w = 0;
        this.A = u07Var;
        this.y = m16Var;
        this.x = str;
        this.z = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        dq6 dq6Var;
        int i = this.w;
        String str = this.x;
        Object obj = this.y;
        Object obj2 = this.A;
        Object obj3 = this.z;
        switch (i) {
            case 0:
                byte[] bArrV0 = null;
                try {
                    try {
                        u07 u07Var = (u07) obj2;
                        zzee zzeeVar = u07Var.d;
                        if (zzeeVar == null) {
                            bi6 bi6Var = u07Var.a.i;
                            dq6.h(bi6Var);
                            bi6Var.f.b("Discarding data. Failed to send event to service to bundle");
                            u07 u07Var2 = (u07) obj2;
                            dq6Var = u07Var2.a;
                            obj2 = u07Var2;
                        } else {
                            bArrV0 = zzeeVar.v0((m16) obj, str);
                            ((u07) obj2).p();
                            u07 u07Var3 = (u07) obj2;
                            dq6Var = u07Var3.a;
                            obj2 = u07Var3;
                        }
                        break;
                    } catch (RemoteException e) {
                        bi6 bi6Var2 = ((u07) obj2).a.i;
                        dq6.h(bi6Var2);
                        bi6Var2.f.c(e, "Failed to send event to the service to bundle");
                        dq6Var = ((u07) obj2).a;
                    }
                    m37 m37Var = dq6Var.l;
                    return;
                } finally {
                    m37 m37Var2 = ((u07) obj2).a.l;
                    dq6.f(m37Var2);
                    m37Var2.z((zzcf) obj3, bArrV0);
                }
            default:
                j27 j27Var = (j27) obj2;
                r27 r27Var = j27Var.w;
                ((jg0) r27Var.b()).getClass();
                m16 m16VarK0 = j27Var.w.M().k0((String) obj, (Bundle) obj3, "auto", System.currentTimeMillis(), false);
                oa3.h(m16VarK0);
                r27Var.g(m16VarK0, str);
                return;
        }
    }

    public zz6(j27 j27Var, String str, Bundle bundle) {
        this.w = 1;
        this.A = j27Var;
        this.x = str;
        this.y = "_err";
        this.z = bundle;
    }
}
