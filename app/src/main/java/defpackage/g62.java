package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g62 {

    public static final class CQf extends cx1 implements j81<kt2, sd5> {
        public final /* synthetic */ g25 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(g25 g25Var) {
            super(1);
            this.w = g25Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(kt2 kt2Var) {
            this.w.a(kt2Var.a);
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements h81<sd5> {
        public final /* synthetic */ g25 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(g25 g25Var) {
            super(0);
            this.w = g25Var;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            this.w.onStop();
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements h81<sd5> {
        public final /* synthetic */ g25 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt8Fixed(g25 g25Var) {
            super(0);
            this.w = g25Var;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            this.w.onCancel();
            return sd5.a;
        }
    }

    public static final class NUlFixed extends cx1 implements x81<d93, kt2, sd5> {
        public final /* synthetic */ g25 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NUlFixed(g25 g25Var) {
            super(2);
            this.w = g25Var;
        }

        @Override // defpackage.x81
        public final sd5 invoke(d93 d93Var, kt2 kt2Var) {
            this.w.d(kt2Var.a);
            return sd5.a;
        }
    }

    @if0(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<ua0, z80<? super ms1>, Object> {
        public /* synthetic */ Object A;
        public final /* synthetic */ l93 B;
        public final /* synthetic */ g25 C;

        @if0(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2", f = "LongPressTextDragObserver.kt", l = {85}, m = "invokeSuspend")
        public static final class CQf extends px4 implements x81<ua0, z80<? super sd5>, Object> {
            public int A;
            public final /* synthetic */ l93 B;
            public final /* synthetic */ g25 C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CQf(l93 l93Var, g25 g25Var, z80<? super CQf> z80Var) {
                super(2, z80Var);
                this.B = l93Var;
                this.C = g25Var;
            }

            @Override // defpackage.m8
            public final z80<sd5> a(Object obj, z80<?> z80Var) {
                return new CQf(this.B, this.C, z80Var);
            }

            @Override // defpackage.m8
            public final Object i(Object obj) throws Throwable {
                Object obj2 = va0.COROUTINE_SUSPENDED;
                int i = this.A;
                if (i == 0) {
                    C0239D.H(obj);
                    this.A = 1;
                    g25 g25Var = this.C;
                    h62 h62Var = new h62(g25Var);
                    i62 i62Var = new i62(g25Var);
                    j62 j62Var = new j62(g25Var);
                    k62 k62Var = new k62(g25Var);
                    float f = bn0.a;
                    Object objB = b51.b(this.B, new hn0(null, j62Var, i62Var, h62Var, k62Var), this);
                    if (objB != obj2) {
                        objB = sd5.a;
                    }
                    if (objB != obj2) {
                        objB = sd5.a;
                    }
                    if (objB == obj2) {
                        return obj2;
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
            public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
                return ((CQf) a(ua0Var, z80Var)).i(sd5.a);
            }
        }

        /* JADX INFO: renamed from: g62$QnHx$QnHx, reason: collision with other inner class name */
        @if0(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1", f = "LongPressTextDragObserver.kt", l = {82}, m = "invokeSuspend")
        public static final class C0133QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
            public int A;
            public final /* synthetic */ l93 B;
            public final /* synthetic */ g25 C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0133QnHx(l93 l93Var, g25 g25Var, z80<? super C0133QnHx> z80Var) {
                super(2, z80Var);
                this.B = l93Var;
                this.C = g25Var;
            }

            @Override // defpackage.m8
            public final z80<sd5> a(Object obj, z80<?> z80Var) {
                return new C0133QnHx(this.B, this.C, z80Var);
            }

            @Override // defpackage.m8
            public final Object i(Object obj) throws Throwable {
                Object obj2 = va0.COROUTINE_SUSPENDED;
                int i = this.A;
                if (i == 0) {
                    C0239D.H(obj);
                    this.A = 1;
                    Object objB = b51.b(this.B, new l62(this.C, null), this);
                    if (objB != obj2) {
                        objB = sd5.a;
                    }
                    if (objB == obj2) {
                        return obj2;
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
            public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
                return ((C0133QnHx) a(ua0Var, z80Var)).i(sd5.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(l93 l93Var, g25 g25Var, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.B = l93Var;
            this.C = g25Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            QnHx qnHx = new QnHx(this.B, this.C, z80Var);
            qnHx.A = obj;
            return qnHx;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            C0239D.H(obj);
            ua0 ua0Var = (ua0) this.A;
            l93 l93Var = this.B;
            g25 g25Var = this.C;
            fp1.k0(ua0Var, null, 0, new C0133QnHx(l93Var, g25Var, null), 3);
            return fp1.k0(ua0Var, null, 0, new CQf(l93Var, g25Var, null), 3);
        }

        @Override // defpackage.x81
        public final Object invoke(ua0 ua0Var, z80<? super ms1> z80Var) {
            return ((QnHx) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    public static final Object a(l93 l93Var, g25 g25Var, z80<? super sd5> z80Var) {
        Object objR = fp1.R(new QnHx(l93Var, g25Var, null), z80Var);
        return objR == va0.COROUTINE_SUSPENDED ? objR : sd5.a;
    }

    public static final Object b(l93 l93Var, g25 g25Var, z80<? super sd5> z80Var) throws Throwable {
        CQf cQf = new CQf(g25Var);
        F1 f1 = new F1(g25Var);
        LPt8Fixed lPt8 = new LPt8Fixed(g25Var);
        NUlFixed nUl = new NUlFixed(g25Var);
        float f = bn0.a;
        Object objB = b51.b(l93Var, new jn0(null, lPt8, f1, cQf, nUl), z80Var);
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        if (objB != va0Var) {
            objB = sd5.a;
        }
        return objB == va0Var ? objB : sd5.a;
    }
}
