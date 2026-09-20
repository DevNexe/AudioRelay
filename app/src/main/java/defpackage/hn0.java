package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5", f = "DragGestureDetector.kt", l = {224}, m = "invokeSuspend")
public final class hn0 extends px4 implements x81<l93, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ j81<kt2, sd5> C;
    public final /* synthetic */ x81<d93, kt2, sd5> D;
    public final /* synthetic */ h81<sd5> E;
    public final /* synthetic */ h81<sd5> F;

    @if0(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5$1", f = "DragGestureDetector.kt", l = {225, 229, 241}, m = "invokeSuspend")
    public static final class QnHx extends eq3 implements x81<a5, z80<? super sd5>, Object> {
        public int A;
        public /* synthetic */ Object B;
        public final /* synthetic */ j81<kt2, sd5> C;
        public final /* synthetic */ x81<d93, kt2, sd5> D;
        public final /* synthetic */ h81<sd5> E;
        public final /* synthetic */ h81<sd5> F;
        public d93 y;
        public il3 z;

        public static final class CQf extends cx1 implements j81<d93, sd5> {
            public final /* synthetic */ x81<d93, kt2, sd5> w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public CQf(x81<? super d93, ? super kt2, sd5> x81Var) {
                super(1);
                this.w = x81Var;
            }

            @Override // defpackage.j81
            public final sd5 invoke(d93 d93Var) {
                d93 d93Var2 = d93Var;
                this.w.invoke(d93Var2, new kt2(Cz.A(d93Var2, false)));
                d93Var2.a();
                return sd5.a;
            }
        }

        /* JADX INFO: renamed from: hn0$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0140QnHx extends cx1 implements x81<d93, kt2, sd5> {
            public final /* synthetic */ il3 w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0140QnHx(il3 il3Var) {
                super(2);
                this.w = il3Var;
            }

            @Override // defpackage.x81
            public final sd5 invoke(d93 d93Var, kt2 kt2Var) {
                long j = kt2Var.a;
                d93Var.a();
                this.w.w = j;
                return sd5.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(z80 z80Var, h81 h81Var, h81 h81Var2, j81 j81Var, x81 x81Var) {
            super(2, z80Var);
            this.C = j81Var;
            this.D = x81Var;
            this.E = h81Var;
            this.F = h81Var2;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            QnHx qnHx = new QnHx(z80Var, this.E, this.F, this.C, this.D);
            qnHx.B = obj;
            return qnHx;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0071 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:19:0x0072  */
        /* JADX WARN: Code duplicated, block: B:22:0x0079  */
        /* JADX WARN: Code duplicated, block: B:27:0x0084  */
        /* JADX WARN: Code duplicated, block: B:29:0x00b2 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:32:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:33:0x00c1  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0072 -> B:20:0x0075). Please report as a decompilation issue!!! */
        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            a5 a5Var;
            QnHx qnHx;
            d93 d93Var;
            a5 a5Var2;
            il3 il3Var;
            Object objD;
            a5 a5Var3;
            d93 d93Var2;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i != 0) {
                if (i == 1) {
                    a5Var = (a5) this.B;
                    C0239D.H(obj);
                } else {
                    if (i == 2) {
                        il3Var = this.z;
                        d93Var = this.y;
                        a5Var3 = (a5) this.B;
                        C0239D.H(obj);
                        qnHx = this;
                        d93Var2 = (d93) obj;
                        if (d93Var2 == null && !d93Var2.b()) {
                            a5Var2 = a5Var3;
                            long j = d93Var.a;
                            int i2 = d93Var.h;
                            C0140QnHx c0140QnHx = new C0140QnHx(il3Var);
                            qnHx.B = a5Var2;
                            qnHx.y = d93Var;
                            qnHx.z = il3Var;
                            qnHx.A = 2;
                            objD = bn0.d(a5Var2, j, i2, c0140QnHx, qnHx);
                            if (objD == va0Var) {
                                return va0Var;
                            }
                            a5Var3 = a5Var2;
                            obj = objD;
                            d93Var2 = (d93) obj;
                            if (d93Var2 == null) {
                            }
                            if (d93Var2 != null) {
                                qnHx.C.invoke(new kt2(d93Var2.c));
                                kt2 kt2Var = new kt2(il3Var.w);
                                x81<d93, kt2, sd5> x81Var = qnHx.D;
                                x81Var.invoke(d93Var2, kt2Var);
                                CQf cQf = new CQf(x81Var);
                                qnHx.B = null;
                                qnHx.y = null;
                                qnHx.z = null;
                                qnHx.A = 3;
                                obj = bn0.f(a5Var3, d93Var2.a, cQf, qnHx);
                                if (obj == va0Var) {
                                    return va0Var;
                                }
                            }
                        } else if (d93Var2 != null) {
                            qnHx.C.invoke(new kt2(d93Var2.c));
                            kt2 kt2Var2 = new kt2(il3Var.w);
                            x81<d93, kt2, sd5> x81Var2 = qnHx.D;
                            x81Var2.invoke(d93Var2, kt2Var2);
                            CQf cQf2 = new CQf(x81Var2);
                            qnHx.B = null;
                            qnHx.y = null;
                            qnHx.z = null;
                            qnHx.A = 3;
                            obj = bn0.f(a5Var3, d93Var2.a, cQf2, qnHx);
                            if (obj == va0Var) {
                                return va0Var;
                            }
                        }
                        return sd5.a;
                    }
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C0239D.H(obj);
                    qnHx = this;
                }
                if (((Boolean) obj).booleanValue()) {
                    qnHx.F.invoke();
                } else {
                    qnHx.E.invoke();
                }
                return sd5.a;
            }
            C0239D.H(obj);
            a5Var = (a5) this.B;
            this.B = a5Var;
            this.A = 1;
            obj = p05.b(a5Var, z83.Main, false, this);
            if (obj == va0Var) {
                return va0Var;
            }
            il3 il3Var2 = new il3();
            il3Var2.w = kt2.b;
            qnHx = this;
            d93Var = (d93) obj;
            a5Var2 = a5Var;
            il3Var = il3Var2;
            long j2 = d93Var.a;
            int i3 = d93Var.h;
            C0140QnHx c0140QnHx2 = new C0140QnHx(il3Var);
            qnHx.B = a5Var2;
            qnHx.y = d93Var;
            qnHx.z = il3Var;
            qnHx.A = 2;
            objD = bn0.d(a5Var2, j2, i3, c0140QnHx2, qnHx);
            if (objD == va0Var) {
                return va0Var;
            }
            a5Var3 = a5Var2;
            obj = objD;
            d93Var2 = (d93) obj;
            if (d93Var2 == null) {
            }
            if (d93Var2 != null) {
                qnHx.C.invoke(new kt2(d93Var2.c));
                kt2 kt2Var3 = new kt2(il3Var.w);
                x81<d93, kt2, sd5> x81Var3 = qnHx.D;
                x81Var3.invoke(d93Var2, kt2Var3);
                CQf cQf3 = new CQf(x81Var3);
                qnHx.B = null;
                qnHx.y = null;
                qnHx.z = null;
                qnHx.A = 3;
                obj = bn0.f(a5Var3, d93Var2.a, cQf3, qnHx);
                if (obj == va0Var) {
                    return va0Var;
                }
                if (((Boolean) obj).booleanValue()) {
                    qnHx.E.invoke();
                } else {
                    qnHx.F.invoke();
                }
            }
            return sd5.a;
        }

        @Override // defpackage.x81
        public final Object invoke(a5 a5Var, z80<? super sd5> z80Var) {
            return ((QnHx) a(a5Var, z80Var)).i(sd5.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn0(z80 z80Var, h81 h81Var, h81 h81Var2, j81 j81Var, x81 x81Var) {
        super(2, z80Var);
        this.C = j81Var;
        this.D = x81Var;
        this.E = h81Var;
        this.F = h81Var2;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        hn0 hn0Var = new hn0(z80Var, this.E, this.F, this.C, this.D);
        hn0Var.B = obj;
        return hn0Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            l93 l93Var = (l93) this.B;
            QnHx qnHx = new QnHx(null, this.E, this.F, this.C, this.D);
            this.A = 1;
            if (l93Var.i0(qnHx, this) == va0Var) {
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
        return ((hn0) a(l93Var, z80Var)).i(sd5.a);
    }
}
