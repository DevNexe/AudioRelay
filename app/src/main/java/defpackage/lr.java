package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.foundation.ClickableKt$clickable$4$gesture$1", f = "Clickable.kt", l = {142}, m = "invokeSuspend")
public final class lr extends px4 implements x81<l93, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ ci2 D;
    public final /* synthetic */ ri2<qd3> E;
    public final /* synthetic */ is4<h81<Boolean>> F;
    public final /* synthetic */ is4<h81<sd5>> G;

    public static final class CQf extends cx1 implements j81<kt2, sd5> {
        public final /* synthetic */ boolean w;
        public final /* synthetic */ is4<h81<sd5>> x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(is4 is4Var, boolean z) {
            super(1);
            this.w = z;
            this.x = is4Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(kt2 kt2Var) {
            long j = kt2Var.a;
            if (this.w) {
                this.x.getValue().invoke();
            }
            return sd5.a;
        }
    }

    @if0(c = "androidx.compose.foundation.ClickableKt$clickable$4$gesture$1$1", f = "Clickable.kt", l = {145}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements y81<nd3, kt2, z80<? super sd5>, Object> {
        public int A;
        public /* synthetic */ nd3 B;
        public /* synthetic */ long C;
        public final /* synthetic */ boolean D;
        public final /* synthetic */ ci2 E;
        public final /* synthetic */ ri2<qd3> F;
        public final /* synthetic */ is4<h81<Boolean>> G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(boolean z, ci2 ci2Var, ri2<qd3> ri2Var, is4<? extends h81<Boolean>> is4Var, z80<? super QnHx> z80Var) {
            super(3, z80Var);
            this.D = z;
            this.E = ci2Var;
            this.F = ri2Var;
            this.G = is4Var;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            Object obj2 = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                nd3 nd3Var = this.B;
                long j = this.C;
                if (this.D) {
                    ci2 ci2Var = this.E;
                    ri2<qd3> ri2Var = this.F;
                    is4<h81<Boolean>> is4Var = this.G;
                    this.A = 1;
                    Object objR = fp1.R(new wr(nd3Var, j, ci2Var, ri2Var, is4Var, null), this);
                    if (objR != obj2) {
                        objR = sd5.a;
                    }
                    if (objR == obj2) {
                        return obj2;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            return sd5.a;
        }

        @Override // defpackage.y81
        public final Object invoke(nd3 nd3Var, kt2 kt2Var, z80<? super sd5> z80Var) {
            long j = kt2Var.a;
            QnHx qnHx = new QnHx(this.D, this.E, this.F, this.G, z80Var);
            qnHx.B = nd3Var;
            qnHx.C = j;
            return qnHx.i(sd5.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lr(boolean z, ci2 ci2Var, ri2<qd3> ri2Var, is4<? extends h81<Boolean>> is4Var, is4<? extends h81<sd5>> is4Var2, z80<? super lr> z80Var) {
        super(2, z80Var);
        this.C = z;
        this.D = ci2Var;
        this.E = ri2Var;
        this.F = is4Var;
        this.G = is4Var2;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        lr lrVar = new lr(this.C, this.D, this.E, this.F, this.G, z80Var);
        lrVar.B = obj;
        return lrVar;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            l93 l93Var = (l93) this.B;
            QnHx qnHx = new QnHx(this.C, this.D, this.E, this.F, null);
            CQf cQf = new CQf(this.G, this.C);
            this.A = 1;
            if (p05.c(l93Var, qnHx, cQf, this) == va0Var) {
                return va0Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(obj);
        }
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(l93 l93Var, z80<? super sd5> z80Var) {
        return ((lr) a(l93Var, z80Var)).i(sd5.a);
    }
}
