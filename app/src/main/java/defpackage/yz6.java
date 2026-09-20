package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class yz6 extends fz5 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yz6(Object obj, xv6 xv6Var, int i) {
        super(xv6Var);
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.fz5
    public final void b() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                u07 u07Var = (u07) obj;
                u07Var.e();
                if (u07Var.k()) {
                    bi6 bi6Var = u07Var.a.i;
                    dq6.h(bi6Var);
                    bi6Var.n.b("Inactivity, disconnecting from the service");
                    u07Var.u();
                    break;
                }
                break;
            default:
                t17 t17Var = (t17) obj;
                t17Var.d.e();
                w17 w17Var = t17Var.d;
                w17Var.a.n.getClass();
                t17Var.a(SystemClock.elapsedRealtime(), false, false);
                dq6 dq6Var = w17Var.a;
                id6 id6VarJ = dq6Var.j();
                dq6Var.n.getClass();
                id6VarJ.h(SystemClock.elapsedRealtime());
                break;
        }
    }
}
