package defpackage;

import io.ktor.client.plugins.HttpRequestTimeoutException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.client.plugins.HttpTimeout$Plugin$install$1", f = "HttpTimeout.kt", l = {}, m = "invokeSuspend")
public final class bh1 extends px4 implements y81<k33<Object, ig1>, Object, z80<? super sd5>, Object> {
    public /* synthetic */ k33 A;
    public final /* synthetic */ ah1 B;
    public final /* synthetic */ ue1 C;

    @if0(c = "io.ktor.client.plugins.HttpTimeout$Plugin$install$1$1$killer$1", f = "HttpTimeout.kt", l = {162}, m = "invokeSuspend")
    public static final class CQf extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public int A;
        public final /* synthetic */ Long B;
        public final /* synthetic */ ig1 C;
        public final /* synthetic */ ms1 D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(Long l, ig1 ig1Var, ms1 ms1Var, z80<? super CQf> z80Var) {
            super(2, z80Var);
            this.B = l;
            this.C = ig1Var;
            this.D = ms1Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return new CQf(this.B, this.C, this.D, z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                long jLongValue = this.B.longValue();
                this.A = 1;
                if (S12N.e(jLongValue, this) == va0Var) {
                    return va0Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            HttpRequestTimeoutException httpRequestTimeoutException = new HttpRequestTimeoutException(this.C);
            this.D.m(ps0.b(httpRequestTimeoutException.getMessage(), httpRequestTimeoutException));
            return sd5.a;
        }

        @Override // defpackage.x81
        public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
            return ((CQf) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    public static final class QnHx extends cx1 implements j81<Throwable, sd5> {
        public final /* synthetic */ ms1 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(qr4 qr4Var) {
            super(1);
            this.w = qr4Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(Throwable th) {
            this.w.m(null);
            return sd5.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh1(ah1 ah1Var, ue1 ue1Var, z80<? super bh1> z80Var) {
        super(3, z80Var);
        this.B = ah1Var;
        this.C = ue1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        k33 k33Var = this.A;
        String str = ((ig1) k33Var.w).a.a.a;
        boolean z = true;
        if (!(ur1.a(str, "ws") || ur1.a(str, "wss"))) {
            ig1 ig1Var = (ig1) k33Var.w;
            if (!(ig1Var.d instanceof rs)) {
                ah1.CQf cQf = ah1.d;
                ig1Var.getClass();
                Dt<Map<ff1<?>, Object>> dt = gf1.a;
                Map map = (Map) ig1Var.f.d(dt);
                ah1.QnHx qnHx = (ah1.QnHx) (map != null ? map.get(cQf) : null);
                ah1 ah1Var = this.B;
                if (qnHx == null) {
                    if (ah1Var.a == null && ah1Var.b == null && ah1Var.c == null) {
                        z = false;
                    }
                    if (z) {
                        qnHx = new ah1.QnHx();
                        ig1Var.getClass();
                        ((Map) ig1Var.f.f(dt, hg1.w)).put(cQf, qnHx);
                    }
                }
                if (qnHx != null) {
                    Long l = qnHx.b;
                    if (l == null) {
                        l = ah1Var.b;
                    }
                    ah1.QnHx.a(l);
                    qnHx.b = l;
                    Long l2 = qnHx.c;
                    if (l2 == null) {
                        l2 = ah1Var.c;
                    }
                    ah1.QnHx.a(l2);
                    qnHx.c = l2;
                    Long l3 = qnHx.a;
                    if (l3 == null) {
                        l3 = ah1Var.a;
                    }
                    ah1.QnHx.a(l3);
                    qnHx.a = l3;
                    if (l3 == null) {
                        l3 = ah1Var.a;
                    }
                    if (l3 != null && l3.longValue() != Long.MAX_VALUE) {
                        ig1Var.e.r0(new QnHx(fp1.k0(this.C, null, 0, new CQf(l3, ig1Var, ig1Var.e, null), 3)));
                    }
                }
                return sd5.a;
            }
        }
        return sd5.a;
    }

    @Override // defpackage.y81
    public final Object invoke(k33<Object, ig1> k33Var, Object obj, z80<? super sd5> z80Var) {
        bh1 bh1Var = new bh1(this.B, this.C, z80Var);
        bh1Var.A = k33Var;
        return bh1Var.i(sd5.a);
    }
}
