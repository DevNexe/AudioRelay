package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzci;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes3.dex */
public final class o87 implements kw6 {
    public final zzci a;
    public final /* synthetic */ AppMeasurementDynamiteService b;

    public o87(AppMeasurementDynamiteService appMeasurementDynamiteService, zzci zzciVar) {
        this.b = appMeasurementDynamiteService;
        this.a = zzciVar;
    }

    @Override // defpackage.kw6
    public final void a(long j, Bundle bundle, String str, String str2) {
        try {
            this.a.y(j, bundle, str, str2);
        } catch (RemoteException e) {
            dq6 dq6Var = this.b.w;
            if (dq6Var != null) {
                bi6 bi6Var = dq6Var.i;
                dq6.h(bi6Var);
                bi6Var.i.c(e, "Event listener threw exception");
            }
        }
    }
}
