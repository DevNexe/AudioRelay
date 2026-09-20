package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1", f = "Magnifier.kt", l = {365}, m = "invokeSuspend")
public final class v62 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ h53 C;
    public final /* synthetic */ e72 D;
    public final /* synthetic */ View E;
    public final /* synthetic */ ij0 F;
    public final /* synthetic */ float G;
    public final /* synthetic */ pi2<sd5> H;
    public final /* synthetic */ is4<j81<zm0, sd5>> I;
    public final /* synthetic */ is4<Boolean> J;
    public final /* synthetic */ is4<kt2> K;
    public final /* synthetic */ is4<j81<ij0, kt2>> L;
    public final /* synthetic */ ri2<kt2> M;
    public final /* synthetic */ is4<Float> N;

    public static final class CQf extends cx1 implements h81<sd5> {
        public final /* synthetic */ is4<j81<ij0, kt2>> A;
        public final /* synthetic */ ri2<kt2> B;
        public final /* synthetic */ is4<Float> C;
        public final /* synthetic */ il3 D;
        public final /* synthetic */ is4<j81<zm0, sd5>> E;
        public final /* synthetic */ g53 w;
        public final /* synthetic */ ij0 x;
        public final /* synthetic */ is4<Boolean> y;
        public final /* synthetic */ is4<kt2> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CQf(g53 g53Var, ij0 ij0Var, is4<Boolean> is4Var, is4<kt2> is4Var2, is4<? extends j81<? super ij0, kt2>> is4Var3, ri2<kt2> ri2Var, is4<Float> is4Var4, il3 il3Var, is4<? extends j81<? super zm0, sd5>> is4Var5) {
            super(0);
            this.w = g53Var;
            this.x = ij0Var;
            this.y = is4Var;
            this.z = is4Var2;
            this.A = is4Var3;
            this.B = ri2Var;
            this.C = is4Var4;
            this.D = il3Var;
            this.E = is4Var5;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            boolean zBooleanValue = this.y.getValue().booleanValue();
            g53 g53Var = this.w;
            if (zBooleanValue) {
                long j = this.z.getValue().a;
                j81<ij0, kt2> value = this.A.getValue();
                ij0 ij0Var = this.x;
                long j2 = value.invoke(ij0Var).a;
                g53Var.b(j, X.w(j2) ? kt2.g(this.B.getValue().a, j2) : kt2.d, this.C.getValue().floatValue());
                long jA = g53Var.a();
                il3 il3Var = this.D;
                if (!sp1.a(jA, il3Var.w)) {
                    il3Var.w = jA;
                    j81<zm0, sd5> value2 = this.E.getValue();
                    if (value2 != null) {
                        value2.invoke(new zm0(ij0Var.v(C0239D.J(jA))));
                    }
                }
            } else {
                g53Var.dismiss();
            }
            return sd5.a;
        }
    }

    @if0(c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1$1", f = "Magnifier.kt", l = {}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<sd5, z80<? super sd5>, Object> {
        public final /* synthetic */ g53 A;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(g53 g53Var, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.A = g53Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return new QnHx(this.A, z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            C0239D.H(obj);
            this.A.c();
            return sd5.a;
        }

        @Override // defpackage.x81
        public final Object invoke(sd5 sd5Var, z80<? super sd5> z80Var) {
            return ((QnHx) a(sd5Var, z80Var)).i(sd5.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v62(h53 h53Var, e72 e72Var, View view, ij0 ij0Var, float f, pi2<sd5> pi2Var, is4<? extends j81<? super zm0, sd5>> is4Var, is4<Boolean> is4Var2, is4<kt2> is4Var3, is4<? extends j81<? super ij0, kt2>> is4Var4, ri2<kt2> ri2Var, is4<Float> is4Var5, z80<? super v62> z80Var) {
        super(2, z80Var);
        this.C = h53Var;
        this.D = e72Var;
        this.E = view;
        this.F = ij0Var;
        this.G = f;
        this.H = pi2Var;
        this.I = is4Var;
        this.J = is4Var2;
        this.K = is4Var3;
        this.L = is4Var4;
        this.M = ri2Var;
        this.N = is4Var5;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        v62 v62Var = new v62(this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, z80Var);
        v62Var.B = obj;
        return v62Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        g53 g53Var;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g53Var = (g53) this.B;
            try {
                C0239D.H(obj);
                g53Var.dismiss();
                return sd5.a;
            } catch (Throwable th) {
                th = th;
                g53Var.dismiss();
                throw th;
            }
        }
        C0239D.H(obj);
        ua0 ua0Var = (ua0) this.B;
        h53 h53Var = this.C;
        e72 e72Var = this.D;
        View view = this.E;
        ij0 ij0Var = this.F;
        g53 g53VarB = h53Var.b(e72Var, view, ij0Var, this.G);
        il3 il3Var = new il3();
        long jA = g53VarB.a();
        j81<zm0, sd5> value = this.I.getValue();
        if (value != null) {
            value.invoke(new zm0(ij0Var.v(C0239D.J(jA))));
        }
        il3Var.w = jA;
        kd.r(new r01(new QnHx(g53VarB, null), this.H), ua0Var);
        try {
            d24 d24VarH0 = ps0.h0(new CQf(g53VarB, this.F, this.J, this.K, this.L, this.M, this.N, il3Var, this.I));
            this.B = g53VarB;
            this.A = 1;
            Object objA = d24VarH0.a(hp2.w, this);
            if (objA != va0Var) {
                objA = sd5.a;
            }
            if (objA == va0Var) {
                return va0Var;
            }
            g53Var = g53VarB;
            g53Var.dismiss();
            return sd5.a;
        } catch (Throwable th2) {
            th = th2;
            g53Var = g53VarB;
            g53Var.dismiss();
            throw th;
        }
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((v62) a(ua0Var, z80Var)).i(sd5.a);
    }
}
