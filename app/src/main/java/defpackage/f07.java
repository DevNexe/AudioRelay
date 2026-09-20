package defpackage;

import com.google.android.gms.measurement.internal.zzee;

/* JADX INFO: loaded from: classes3.dex */
public final class f07 implements Runnable {
    public final /* synthetic */ p97 w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ ft5 y;
    public final /* synthetic */ u07 z;

    public f07(u07 u07Var, p97 p97Var, boolean z, ft5 ft5Var) {
        this.z = u07Var;
        this.w = p97Var;
        this.x = z;
        this.y = ft5Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        u07 u07Var = this.z;
        zzee zzeeVar = u07Var.d;
        if (zzeeVar == null) {
            bi6 bi6Var = u07Var.a.i;
            dq6.h(bi6Var);
            bi6Var.f.b("Discarding data. Failed to send conditional user property to service");
        } else {
            p97 p97Var = this.w;
            oa3.h(p97Var);
            u07Var.i(zzeeVar, this.x ? null : this.y, p97Var);
            u07Var.p();
        }
    }
}
