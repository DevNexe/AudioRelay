package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class dx6 implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ kj6 B;
    public final /* synthetic */ int w;
    public final /* synthetic */ long x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ dx6(kj6 kj6Var, Object obj, Object obj2, Object obj3, long j, int i) {
        this.w = i;
        this.B = kj6Var;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
        this.x = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.w;
        Object obj = this.z;
        Object obj2 = this.y;
        kj6 kj6Var = this.B;
        switch (i) {
            case 0:
                Object obj3 = this.A;
                ((dy6) kj6Var).u(this.x, obj3, (String) obj2, (String) obj);
                break;
            default:
                dz6 dz6Var = (dz6) kj6Var;
                Bundle bundle = (Bundle) obj2;
                qy6 qy6Var = (qy6) this.A;
                long j = this.x;
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                m37 m37Var = dz6Var.a.l;
                dq6.f(m37Var);
                dz6Var.i((qy6) obj, qy6Var, j, true, m37Var.j0("screen_view", bundle, null, false));
                break;
        }
    }
}
