package defpackage;

import defpackage.hf1;
import java.util.LinkedHashMap;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class k6<T extends hf1> {
    public final ua0 a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final ue1 f;
    public final NUlFixed g;
    public final nj4 h;
    public xw<sd5> i;
    public p5 j;
    public final LinkedHashMap k;

    public static final class CQf {
    }

    public static final class QnHx {
    }

    static {
        new CQf();
    }

    public k6(w80 w80Var, jc0 jc0Var) {
        String string = UUID.randomUUID().toString();
        this.a = w80Var;
        this.b = "127.0.0.1";
        this.c = 9684;
        this.d = "2.0.1";
        this.e = string;
        r6 r6Var = new r6(jc0Var);
        we1<hf1> we1Var = new we1<>();
        r6Var.invoke(we1Var);
        st2 st2Var = new st2();
        we1Var.d.getClass();
        sd5 sd5Var = sd5.a;
        tt2 tt2Var = new tt2(st2Var);
        ue1 ue1Var = new ue1(tt2Var, we1Var);
        ((ms1) ue1Var.z.j(ms1.CQf.w)).r0(new jf1(tt2Var));
        this.f = ue1Var;
        this.g = AY.a(Integer.MAX_VALUE, lg.SUSPEND, 4);
        this.h = OW8.c(0, 0, null, 7);
        this.i = ddf.c();
        this.j = new p5(0);
        this.k = new LinkedHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static final Object a(k6 k6Var, long j, s6.QnHx.C0192QnHx c0192QnHx, z80 z80Var) throws Throwable {
        l6 l6Var;
        h81 h81Var;
        k6 k6Var2 = k6Var;
        k6Var.getClass();
        if (z80Var instanceof l6) {
            l6Var = (l6) z80Var;
            int i = l6Var.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                l6Var.D = i - Integer.MIN_VALUE;
            } else {
                l6Var = new l6(k6Var, z80Var);
            }
        } else {
            l6Var = new l6(k6Var, z80Var);
        }
        Object obj = l6Var.B;
        Object obj2 = va0.COROUTINE_SUSPENDED;
        int i2 = l6Var.D;
        if (i2 != 0) {
            if (i2 == 1) {
                h81 h81Var2 = l6Var.A;
                k6 k6Var3 = l6Var.z;
                C0239D.H(obj);
                h81Var = h81Var2;
                k6Var2 = k6Var3;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            return sd5.a;
        }
        C0239D.H(obj);
        m6 m6Var = new m6(k6Var, null);
        l6Var.z = k6Var2;
        h81Var = c0192QnHx;
        l6Var.A = h81Var;
        l6Var.D = 1;
        long jG = 0;
        if (gq0.d(j, 0L) > 0) {
            jG = gq0.g(j);
            if (jG < 1) {
                jG = 1;
            }
        }
        if (b85.b(jG, m6Var, l6Var) == obj2) {
            return obj2;
        }
        ue1 ue1Var = k6Var2.f;
        uf1 uf1Var = uf1.b;
        o6 o6Var = new o6(k6Var2);
        p6 p6Var = new p6(h81Var, k6Var2, null);
        l6Var.z = null;
        l6Var.A = null;
        l6Var.D = 2;
        Object objL = S12N.l(ue1Var, new gi(uf1Var, null, null, null, o6Var), p6Var, l6Var);
        if (objL != obj2) {
            objL = sd5.a;
        }
        if (objL == obj2) {
            return obj2;
        }
        return sd5.a;
    }
}
