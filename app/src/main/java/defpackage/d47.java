package defpackage;

import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes3.dex */
public final class d47 implements Runnable {
    public final /* synthetic */ zzcf w;
    public final /* synthetic */ String x;
    public final /* synthetic */ String y;
    public final /* synthetic */ AppMeasurementDynamiteService z;

    public d47(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcfVar, String str, String str2) {
        this.z = appMeasurementDynamiteService;
        this.w = zzcfVar;
        this.x = str;
        this.y = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u07 u07VarQ = this.z.w.q();
        zzcf zzcfVar = this.w;
        String str = this.x;
        String str2 = this.y;
        u07VarQ.e();
        u07VarQ.f();
        u07VarQ.q(new n97(u07VarQ, str, str2, u07VarQ.n(false), zzcfVar));
    }
}
