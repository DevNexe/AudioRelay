package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2", f = "Clickable.kt", l = {412, 414, 421, 422, 431}, m = "invokeSuspend")
public final class wr extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public boolean A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ nd3 D;
    public final /* synthetic */ long E;
    public final /* synthetic */ ci2 F;
    public final /* synthetic */ ri2<qd3> G;
    public final /* synthetic */ is4<h81<Boolean>> H;

    @if0(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1", f = "Clickable.kt", l = {406, 409}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public qd3 A;
        public int B;
        public final /* synthetic */ is4<h81<Boolean>> C;
        public final /* synthetic */ long D;
        public final /* synthetic */ ci2 E;
        public final /* synthetic */ ri2<qd3> F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(is4<? extends h81<Boolean>> is4Var, long j, ci2 ci2Var, ri2<qd3> ri2Var, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.C = is4Var;
            this.D = j;
            this.E = ci2Var;
            this.F = ri2Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return new QnHx(this.C, this.D, this.E, this.F, z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            qd3 qd3Var;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.B;
            if (i != 0) {
                if (i == 1) {
                    C0239D.H(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    qd3Var = this.A;
                    C0239D.H(obj);
                }
                this.F.setValue(qd3Var);
                return sd5.a;
            }
            C0239D.H(obj);
            if (this.C.getValue().invoke().booleanValue()) {
                long j = zr.a;
                this.B = 1;
                if (S12N.e(j, this) == va0Var) {
                    return va0Var;
                }
            }
            qd3 qd3Var2 = new qd3(this.D);
            this.A = qd3Var2;
            this.B = 2;
            if (this.E.c(qd3Var2, this) == va0Var) {
                return va0Var;
            }
            qd3Var = qd3Var2;
            this.F.setValue(qd3Var);
            return sd5.a;
        }

        @Override // defpackage.x81
        public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
            return ((QnHx) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public wr(nd3 nd3Var, long j, ci2 ci2Var, ri2<qd3> ri2Var, is4<? extends h81<Boolean>> is4Var, z80<? super wr> z80Var) {
        super(2, z80Var);
        this.D = nd3Var;
        this.E = j;
        this.F = ci2Var;
        this.G = ri2Var;
        this.H = is4Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        wr wrVar = new wr(this.D, this.E, this.F, this.G, this.H, z80Var);
        wrVar.C = obj;
        return wrVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0097  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ad A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ba A[RETURN] */
    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        ms1 ms1VarK0;
        Object objR;
        boolean z;
        qd3 qd3Var;
        rd3 rd3Var;
        rd3 rd3Var2;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.B;
        ri2<qd3> ri2Var = this.G;
        ci2 ci2Var = this.F;
        if (i != 0) {
            if (i == 1) {
                ms1VarK0 = (ms1) this.C;
                C0239D.H(obj);
                objR = obj;
            } else if (i == 2) {
                z = this.A;
                C0239D.H(obj);
                if (z) {
                    qd3Var = new qd3(this.E);
                    rd3Var = new rd3(qd3Var);
                    this.C = rd3Var;
                    this.B = 3;
                    if (ci2Var.c(qd3Var, this) == va0Var) {
                        return va0Var;
                    }
                    rd3Var2 = rd3Var;
                    this.C = null;
                    this.B = 4;
                    if (ci2Var.c(rd3Var2, this) == va0Var) {
                        return va0Var;
                    }
                }
            } else if (i == 3) {
                rd3Var2 = (rd3) this.C;
                C0239D.H(obj);
                this.C = null;
                this.B = 4;
                if (ci2Var.c(rd3Var2, this) == va0Var) {
                    return va0Var;
                }
            } else {
                if (i != 4 && i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            ri2Var.setValue(null);
            return sd5.a;
        }
        C0239D.H(obj);
        ms1VarK0 = fp1.k0((ua0) this.C, null, 0, new QnHx(this.H, this.E, this.F, this.G, null), 3);
        this.C = ms1VarK0;
        this.B = 1;
        objR = this.D.R(this);
        if (objR == va0Var) {
            return va0Var;
        }
        boolean zBooleanValue = ((Boolean) objR).booleanValue();
        if (ms1VarK0.c()) {
            this.C = null;
            this.A = zBooleanValue;
            this.B = 2;
            ms1VarK0.m(null);
            Object objK = ms1VarK0.K(this);
            if (objK != va0Var) {
                objK = sd5.a;
            }
            if (objK == va0Var) {
                return va0Var;
            }
            z = zBooleanValue;
            if (z) {
                qd3Var = new qd3(this.E);
                rd3Var = new rd3(qd3Var);
                this.C = rd3Var;
                this.B = 3;
                if (ci2Var.c(qd3Var, this) == va0Var) {
                    return va0Var;
                }
                rd3Var2 = rd3Var;
                this.C = null;
                this.B = 4;
                if (ci2Var.c(rd3Var2, this) == va0Var) {
                    return va0Var;
                }
            }
        } else {
            qd3 value = ri2Var.getValue();
            if (value != null) {
                vp1 rd3Var3 = zBooleanValue ? new rd3(value) : new pd3(value);
                this.C = null;
                this.B = 5;
                if (ci2Var.c(rd3Var3, this) == va0Var) {
                    return va0Var;
                }
            }
        }
        ri2Var.setValue(null);
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((wr) a(ua0Var, z80Var)).i(sd5.a);
    }
}
