package defpackage;

import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes3.dex */
public final class xx6 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ zzcf x;
    public final /* synthetic */ AppMeasurementDynamiteService y;

    public /* synthetic */ xx6(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcfVar, int i) {
        this.w = i;
        this.y = appMeasurementDynamiteService;
        this.x = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.w;
        zzcf zzcfVar = this.x;
        AppMeasurementDynamiteService appMeasurementDynamiteService = this.y;
        boolean z = false;
        switch (i) {
            case 0:
                u07 u07VarQ = appMeasurementDynamiteService.w.q();
                u07VarQ.e();
                u07VarQ.f();
                u07VarQ.q(new d76(u07VarQ, u07VarQ.n(false), zzcfVar, 4));
                break;
            default:
                m37 m37Var = appMeasurementDynamiteService.w.l;
                dq6.f(m37Var);
                dq6 dq6Var = appMeasurementDynamiteService.w;
                if (dq6Var.A != null && dq6Var.A.booleanValue()) {
                    z = true;
                }
                m37Var.w(zzcfVar, z);
                break;
        }
    }
}
