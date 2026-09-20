package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class v1 implements if4 {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;
    public final v04 d;
    public final Object e;

    public v1(lKy3 lky3, ef4 ef4Var, kc kcVar, zb zbVar) {
        this.b = lky3;
        this.c = ef4Var;
        this.d = kcVar;
        this.e = zbVar;
    }

    @Override // defpackage.if4
    public final qw a(dc4 dc4Var) {
        switch (this.a) {
            case 0:
                return new xs2(((ef4) this.c).b(j54.b), new u1(this, 0));
            default:
                Set<hc4> set = (Set) this.e;
                ArrayList arrayList = new ArrayList(mu.w0(set, 10));
                for (hc4 hc4Var : set) {
                    arrayList.add(hc4Var.a(j54.b).B(new HqGb(5, hc4Var, this)));
                }
                int i = 23;
                return new xs2(new jr2(new cs2(vq2.l(arrayList, new k71(i)), new NFo7(this, i)), new rq1(this, 13), m91.d, m91.c), new Ot0r(this, 15));
        }
    }

    public v1(cq4 cq4Var, B8C b8c, ic4 ic4Var, Set set) {
        this.b = cq4Var;
        this.c = b8c;
        this.d = ic4Var;
        this.e = set;
    }
}
