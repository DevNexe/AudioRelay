package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2", f = "TextFieldPressGestureFilter.kt", l = {55}, m = "invokeSuspend")
public final class c45 extends px4 implements x81<l93, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ ua0 C;
    public final /* synthetic */ ri2<qd3> D;
    public final /* synthetic */ ci2 E;
    public final /* synthetic */ is4<j81<kt2, sd5>> F;

    public static final class CQf extends cx1 implements j81<kt2, sd5> {
        public final /* synthetic */ is4<j81<kt2, sd5>> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CQf(is4<? extends j81<? super kt2, sd5>> is4Var) {
            super(1);
            this.w = is4Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(kt2 kt2Var) {
            this.w.getValue().invoke(new kt2(kt2Var.a));
            return sd5.a;
        }
    }

    @if0(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1", f = "TextFieldPressGestureFilter.kt", l = {68}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements y81<nd3, kt2, z80<? super sd5>, Object> {
        public int A;
        public /* synthetic */ nd3 B;
        public /* synthetic */ long C;
        public final /* synthetic */ ua0 D;
        public final /* synthetic */ ri2<qd3> E;
        public final /* synthetic */ ci2 F;

        @if0(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$2", f = "TextFieldPressGestureFilter.kt", l = {77}, m = "invokeSuspend")
        public static final class CQf extends px4 implements x81<ua0, z80<? super sd5>, Object> {
            public ri2 A;
            public int B;
            public final /* synthetic */ ri2<qd3> C;
            public final /* synthetic */ boolean D;
            public final /* synthetic */ ci2 E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CQf(ci2 ci2Var, ri2 ri2Var, z80 z80Var, boolean z) {
                super(2, z80Var);
                this.C = ri2Var;
                this.D = z;
                this.E = ci2Var;
            }

            @Override // defpackage.m8
            public final z80<sd5> a(Object obj, z80<?> z80Var) {
                return new CQf(this.E, this.C, z80Var, this.D);
            }

            @Override // defpackage.m8
            public final Object i(Object obj) throws Throwable {
                ri2<qd3> ri2Var;
                ri2<qd3> ri2Var2;
                va0 va0Var = va0.COROUTINE_SUSPENDED;
                int i = this.B;
                if (i == 0) {
                    C0239D.H(obj);
                    ri2Var = this.C;
                    qd3 value = ri2Var.getValue();
                    if (value != null) {
                        vp1 rd3Var = this.D ? new rd3(value) : new pd3(value);
                        ci2 ci2Var = this.E;
                        if (ci2Var != null) {
                            this.A = ri2Var;
                            this.B = 1;
                            if (ci2Var.c(rd3Var, this) == va0Var) {
                                return va0Var;
                            }
                            ri2Var2 = ri2Var;
                        }
                        ri2Var.setValue(null);
                    }
                    return sd5.a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ri2Var2 = this.A;
                C0239D.H(obj);
                ri2Var = ri2Var2;
                ri2Var.setValue(null);
                return sd5.a;
            }

            @Override // defpackage.x81
            public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
                return ((CQf) a(ua0Var, z80Var)).i(sd5.a);
            }
        }

        /* JADX INFO: renamed from: c45$QnHx$QnHx, reason: collision with other inner class name */
        @if0(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", f = "TextFieldPressGestureFilter.kt", l = {61, 65}, m = "invokeSuspend")
        public static final class C0062QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
            public Object A;
            public int B;
            public final /* synthetic */ ri2<qd3> C;
            public final /* synthetic */ long D;
            public final /* synthetic */ ci2 E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0062QnHx(ri2<qd3> ri2Var, long j, ci2 ci2Var, z80<? super C0062QnHx> z80Var) {
                super(2, z80Var);
                this.C = ri2Var;
                this.D = j;
                this.E = ci2Var;
            }

            @Override // defpackage.m8
            public final z80<sd5> a(Object obj, z80<?> z80Var) {
                return new C0062QnHx(this.C, this.D, this.E, z80Var);
            }

            /* JADX WARN: Code duplicated, block: B:21:0x0053  */
            /* JADX WARN: Code duplicated, block: B:23:0x005d A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:24:0x005e  */
            @Override // defpackage.m8
            public final Object i(Object obj) throws Throwable {
                ri2<qd3> ri2Var;
                qd3 qd3Var;
                qd3 qd3Var2;
                va0 va0Var = va0.COROUTINE_SUSPENDED;
                int i = this.B;
                ci2 ci2Var = this.E;
                ri2<qd3> ri2Var2 = this.C;
                if (i != 0) {
                    if (i == 1) {
                        ri2Var = (ri2) this.A;
                        C0239D.H(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        qd3Var2 = (qd3) this.A;
                        C0239D.H(obj);
                    }
                    qd3Var = qd3Var2;
                    ri2Var2.setValue(qd3Var);
                    return sd5.a;
                }
                C0239D.H(obj);
                qd3 value = ri2Var2.getValue();
                if (value != null) {
                    pd3 pd3Var = new pd3(value);
                    if (ci2Var != null) {
                        this.A = ri2Var2;
                        this.B = 1;
                        if (ci2Var.c(pd3Var, this) == va0Var) {
                            return va0Var;
                        }
                    }
                    ri2Var = ri2Var2;
                } else {
                    qd3Var = new qd3(this.D);
                    if (ci2Var != null) {
                        this.A = qd3Var;
                        this.B = 2;
                        if (ci2Var.c(qd3Var, this) == va0Var) {
                            return va0Var;
                        }
                        qd3Var2 = qd3Var;
                        qd3Var = qd3Var2;
                    }
                }
                ri2Var2.setValue(qd3Var);
                return sd5.a;
                ri2Var.setValue(null);
                qd3Var = new qd3(this.D);
                if (ci2Var != null) {
                    this.A = qd3Var;
                    this.B = 2;
                    if (ci2Var.c(qd3Var, this) == va0Var) {
                        return va0Var;
                    }
                    qd3Var2 = qd3Var;
                    qd3Var = qd3Var2;
                }
                ri2Var2.setValue(qd3Var);
                return sd5.a;
            }

            @Override // defpackage.x81
            public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
                return ((C0062QnHx) a(ua0Var, z80Var)).i(sd5.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(ci2 ci2Var, ri2 ri2Var, z80 z80Var, ua0 ua0Var) {
            super(3, z80Var);
            this.D = ua0Var;
            this.E = ri2Var;
            this.F = ci2Var;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            ua0 ua0Var = this.D;
            if (i == 0) {
                C0239D.H(obj);
                nd3 nd3Var = this.B;
                fp1.k0(ua0Var, null, 0, new C0062QnHx(this.E, this.C, this.F, null), 3);
                this.A = 1;
                obj = nd3Var.R(this);
                if (obj == va0Var) {
                    return va0Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            fp1.k0(ua0Var, null, 0, new CQf(this.F, this.E, null, ((Boolean) obj).booleanValue()), 3);
            return sd5.a;
        }

        @Override // defpackage.y81
        public final Object invoke(nd3 nd3Var, kt2 kt2Var, z80<? super sd5> z80Var) {
            long j = kt2Var.a;
            ua0 ua0Var = this.D;
            ri2<qd3> ri2Var = this.E;
            QnHx qnHx = new QnHx(this.F, ri2Var, z80Var, ua0Var);
            qnHx.B = nd3Var;
            qnHx.C = j;
            return qnHx.i(sd5.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c45(ua0 ua0Var, ri2<qd3> ri2Var, ci2 ci2Var, is4<? extends j81<? super kt2, sd5>> is4Var, z80<? super c45> z80Var) {
        super(2, z80Var);
        this.C = ua0Var;
        this.D = ri2Var;
        this.E = ci2Var;
        this.F = is4Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        c45 c45Var = new c45(this.C, this.D, this.E, this.F, z80Var);
        c45Var.B = obj;
        return c45Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            l93 l93Var = (l93) this.B;
            QnHx qnHx = new QnHx(this.E, this.D, null, this.C);
            CQf cQf = new CQf(this.F);
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
        return ((c45) a(l93Var, z80Var)).i(sd5.a);
    }
}
