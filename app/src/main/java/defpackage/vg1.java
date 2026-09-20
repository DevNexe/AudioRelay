package defpackage;

import io.ktor.client.plugins.SendCountExceedException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class vg1 {
    public static final LPt8Fixed c = new LPt8Fixed();
    public static final Dt<vg1> d = new Dt<>("HttpSend");
    public final int a = 20;
    public final ArrayList b = new ArrayList();

    public static final class CQf implements u94 {
        public final int a;
        public final ue1 b;
        public int c;
        public ve1 d;

        @if0(c = "io.ktor.client.plugins.HttpSend$DefaultSender", f = "HttpSend.kt", l = {138}, m = "execute")
        public static final class QnHx extends b90 {
            public /* synthetic */ Object A;
            public int C;
            public CQf z;

            public QnHx(z80<? super QnHx> z80Var) {
                super(z80Var);
            }

            @Override // defpackage.m8
            public final Object i(Object obj) {
                this.A = obj;
                this.C |= Integer.MIN_VALUE;
                return CQf.this.a(null, this);
            }
        }

        public CQf(int i, ue1 ue1Var) {
            this.a = i;
            this.b = ue1Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.u94
        public final Object a(ig1 ig1Var, z80<? super ve1> z80Var) throws Throwable {
            QnHx qnHx;
            CQf cQf;
            if (z80Var instanceof QnHx) {
                qnHx = (QnHx) z80Var;
                int i = qnHx.C;
                if ((i & Integer.MIN_VALUE) != 0) {
                    qnHx.C = i - Integer.MIN_VALUE;
                } else {
                    qnHx = new QnHx(z80Var);
                }
            } else {
                qnHx = new QnHx(z80Var);
            }
            Object objA = qnHx.A;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i2 = qnHx.C;
            if (i2 == 0) {
                C0239D.H(objA);
                ve1 ve1Var = this.d;
                if (ve1Var != null) {
                    fp1.H(ve1Var, null);
                }
                int i3 = this.c;
                int i4 = this.a;
                if (i3 >= i4) {
                    throw new SendCountExceedException(ex0.b("Max send count ", i4, " exceeded. Consider increasing the property maxSendCount if more is required."));
                }
                this.c = i3 + 1;
                xg1 xg1Var = this.b.C;
                Object obj = ig1Var.d;
                qnHx.z = this;
                qnHx.C = 1;
                objA = xg1Var.a(ig1Var, obj, qnHx);
                if (objA == va0Var) {
                    return va0Var;
                }
                cQf = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cQf = qnHx.z;
                C0239D.H(objA);
            }
            ve1 ve1Var2 = objA instanceof ve1 ? (ve1) objA : null;
            if (ve1Var2 != null) {
                cQf.d = ve1Var2;
                return ve1Var2;
            }
            throw new IllegalStateException(("Failed to execute send pipeline. Expected [HttpClientCall], but received " + objA).toString());
        }
    }

    public static final class F1 implements u94 {
        public final y81<u94, ig1, z80<? super ve1>, Object> a;
        public final u94 b;

        /* JADX WARN: Multi-variable type inference failed */
        public F1(y81<? super u94, ? super ig1, ? super z80<? super ve1>, ? extends Object> y81Var, u94 u94Var) {
            this.a = y81Var;
            this.b = u94Var;
        }

        @Override // defpackage.u94
        public final Object a(ig1 ig1Var, z80<? super ve1> z80Var) {
            return this.a.invoke(this.b, ig1Var, z80Var);
        }
    }

    public static final class LPt8Fixed implements kf1<QnHx, vg1> {
        @Override // defpackage.kf1
        public final void a(vg1 vg1Var, ue1 ue1Var) {
            ue1Var.A.f(pg1.j, new wg1(vg1Var, ue1Var, null));
        }

        @Override // defpackage.kf1
        public final vg1 b(j81<? super QnHx, sd5> j81Var) {
            j81Var.invoke(new QnHx());
            return new vg1();
        }

        @Override // defpackage.kf1
        public final Dt<vg1> getKey() {
            return vg1.d;
        }
    }

    public static final class QnHx {
    }
}
