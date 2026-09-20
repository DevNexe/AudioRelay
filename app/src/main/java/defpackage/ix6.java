package defpackage;

import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class ix6 implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int w = 1;
    public final /* synthetic */ String x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public ix6(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcfVar, m16 m16Var, String str) {
        this.A = appMeasurementDynamiteService;
        this.y = zzcfVar;
        this.z = m16Var;
        this.x = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.w;
        Object obj = this.z;
        Object obj2 = this.y;
        Object obj3 = this.A;
        switch (i) {
            case 0:
                u07 u07VarQ = ((dy6) obj3).a.q();
                u07VarQ.e();
                u07VarQ.f();
                u07VarQ.q(new h07(u07VarQ, (AtomicReference) obj2, this.x, (String) obj, u07VarQ.n(false)));
                break;
            default:
                u07 u07VarQ2 = ((AppMeasurementDynamiteService) obj3).w.q();
                zzcf zzcfVar = (zzcf) obj2;
                m16 m16Var = (m16) obj;
                u07VarQ2.e();
                u07VarQ2.f();
                dq6 dq6Var = u07VarQ2.a;
                m37 m37Var = dq6Var.l;
                dq6.f(m37Var);
                m37Var.getClass();
                if (oa1.b.c(m37Var.a.a, 12451000) == 0) {
                    u07VarQ2.q(new zz6(u07VarQ2, m16Var, this.x, zzcfVar));
                } else {
                    bi6 bi6Var = dq6Var.i;
                    dq6.h(bi6Var);
                    bi6Var.i.b("Not bundling data. Service unavailable or out of date");
                    m37 m37Var2 = dq6Var.l;
                    dq6.f(m37Var2);
                    m37Var2.z(zzcfVar, new byte[0]);
                }
                break;
        }
    }

    public ix6(dy6 dy6Var, AtomicReference atomicReference, String str, String str2) {
        this.A = dy6Var;
        this.y = atomicReference;
        this.x = str;
        this.z = str2;
    }
}
