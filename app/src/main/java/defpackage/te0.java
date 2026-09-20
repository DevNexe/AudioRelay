package defpackage;

import com.google.firebase.remoteconfig.internal.CQf;
import j$.util.concurrent.ConcurrentMap$EL;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class te0 implements Callable {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ te0(int i, Object obj, Object obj2) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.w) {
            case 0:
                af0 af0Var = (af0) this.x;
                s50 s50Var = (s50) this.y;
                af0Var.f.k();
                return af0Var.g.j("Player:PacketReceiver", -16, new ze0(af0Var, s50Var));
            case 1:
                re4 re4Var = (re4) this.x;
                ps psVar = (ps) this.y;
                Long l = re4Var.f.a.get(psVar.d);
                if (!(l != null && zs.QnHx.a.c() - l.longValue() < 1000)) {
                    return vq2.s(psVar);
                }
                a62 a62Var = a62.a;
                re4Var.j.a(qe4.w);
                return new cs2(vq2.D(1000L, TimeUnit.MILLISECONDS), new Ot0r(psVar, 21));
            case 2:
                String str = (String) this.x;
                return new rz4(str, (vz4) ConcurrentMap$EL.getOrDefault(((uz4) this.y).a, new fz4(str), vz4.F1.a));
            default:
                cy0 cy0Var = (cy0) this.x;
                hy0 hy0Var = (hy0) this.y;
                CQf cQf = cy0Var.g;
                synchronized (cQf.b) {
                    cQf.a.edit().putLong("fetch_timeout_in_seconds", hy0Var.a).putLong("minimum_fetch_interval_in_seconds", hy0Var.b).commit();
                    break;
                }
                return null;
        }
    }
}
