package defpackage;

import com.google.android.gms.measurement.internal.zzee;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class mx6 implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ kj6 B;
    public final /* synthetic */ int w = 0;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ String y;
    public final /* synthetic */ Object z;

    public mx6(dy6 dy6Var, AtomicReference atomicReference, String str, String str2, boolean z) {
        this.B = dy6Var;
        this.z = atomicReference;
        this.y = str;
        this.A = str2;
        this.x = z;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.w;
        Object obj = this.A;
        Object obj2 = this.z;
        kj6 kj6Var = this.B;
        switch (i) {
            case 0:
                u07 u07VarQ = ((dy6) kj6Var).a.q();
                boolean z = this.x;
                u07VarQ.e();
                u07VarQ.f();
                u07VarQ.q(new fz6(u07VarQ, (AtomicReference) obj2, this.y, (String) obj, u07VarQ.n(false), z));
                break;
            default:
                u07 u07Var = (u07) kj6Var;
                zzee zzeeVar = u07Var.d;
                if (zzeeVar != null) {
                    p97 p97Var = (p97) obj2;
                    oa3.h(p97Var);
                    u07Var.i(zzeeVar, this.x ? null : (m16) obj, p97Var);
                    u07Var.p();
                } else {
                    bi6 bi6Var = u07Var.a.i;
                    dq6.h(bi6Var);
                    bi6Var.f.b("Discarding data. Failed to send event to service");
                }
                break;
        }
    }

    public mx6(u07 u07Var, p97 p97Var, boolean z, m16 m16Var, String str) {
        this.B = u07Var;
        this.z = p97Var;
        this.x = z;
        this.A = m16Var;
        this.y = str;
    }
}
