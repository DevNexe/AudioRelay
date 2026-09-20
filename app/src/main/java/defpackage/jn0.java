package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", f = "DragGestureDetector.kt", l = {276, 280, 284}, m = "invokeSuspend")
public final class jn0 extends px4 implements x81<l93, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ j81<kt2, sd5> C;
    public final /* synthetic */ h81<sd5> D;
    public final /* synthetic */ h81<sd5> E;
    public final /* synthetic */ x81<d93, kt2, sd5> F;

    @if0(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1", f = "DragGestureDetector.kt", l = {277}, m = "invokeSuspend")
    public static final class CQf extends eq3 implements x81<a5, z80<? super d93>, Object> {
        public int y;
        public /* synthetic */ Object z;

        public CQf(z80<? super CQf> z80Var) {
            super(2, z80Var);
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            CQf cQf = new CQf(z80Var);
            cQf.z = obj;
            return cQf;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.y;
            if (i == 0) {
                C0239D.H(obj);
                a5 a5Var = (a5) this.z;
                this.y = 1;
                obj = p05.b(a5Var, z83.Main, false, this);
                if (obj == va0Var) {
                    return va0Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            return obj;
        }

        @Override // defpackage.x81
        public final Object invoke(a5 a5Var, z80<? super d93> z80Var) {
            return ((CQf) a(a5Var, z80Var)).i(sd5.a);
        }
    }

    @if0(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$1", f = "DragGestureDetector.kt", l = {286}, m = "invokeSuspend")
    public static final class QnHx extends eq3 implements x81<a5, z80<? super sd5>, Object> {
        public final /* synthetic */ d93 A;
        public final /* synthetic */ h81<sd5> B;
        public final /* synthetic */ h81<sd5> C;
        public final /* synthetic */ x81<d93, kt2, sd5> D;
        public int y;
        public /* synthetic */ Object z;

        /* JADX INFO: renamed from: jn0$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0151QnHx extends cx1 implements j81<d93, sd5> {
            public final /* synthetic */ x81<d93, kt2, sd5> w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0151QnHx(x81<? super d93, ? super kt2, sd5> x81Var) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(d93 d93Var, h81<sd5> h81Var, h81<sd5> h81Var2, x81<? super d93, ? super kt2, sd5> x81Var, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.A = d93Var;
            this.B = h81Var;
            this.C = h81Var2;
            this.D = x81Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            QnHx qnHx = new QnHx(this.A, this.B, this.C, this.D, z80Var);
            qnHx.z = obj;
            return qnHx;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            a5 a5Var;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.y;
            if (i == 0) {
                C0239D.H(obj);
                a5 a5Var2 = (a5) this.z;
                long j = this.A.a;
                C0151QnHx c0151QnHx = new C0151QnHx(this.D);
                this.z = a5Var2;
                this.y = 1;
                Object objF = bn0.f(a5Var2, j, c0151QnHx, this);
                if (objF == va0Var) {
                    return va0Var;
                }
                a5Var = a5Var2;
                obj = objF;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a5Var = (a5) this.z;
                C0239D.H(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                List<d93> list = a5Var.s().a;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    d93 d93Var = list.get(i2);
                    if ((d93Var.b() || !d93Var.g || d93Var.d) ? false : true) {
                        d93Var.a();
                    }
                }
                this.B.invoke();
            } else {
                this.C.invoke();
            }
            return sd5.a;
        }

        @Override // defpackage.x81
        public final Object invoke(a5 a5Var, z80<? super sd5> z80Var) {
            return ((QnHx) a(a5Var, z80Var)).i(sd5.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn0(z80 z80Var, h81 h81Var, h81 h81Var2, j81 j81Var, x81 x81Var) {
        super(2, z80Var);
        this.C = j81Var;
        this.D = h81Var;
        this.E = h81Var2;
        this.F = x81Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        jn0 jn0Var = new jn0(z80Var, this.D, this.E, this.C, this.F);
        jn0Var.B = obj;
        return jn0Var;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005a A[Catch: CancellationException -> 0x0014, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0014, blocks: (B:7:0x0010, B:14:0x0022, B:25:0x0055, B:27:0x005a, B:22:0x004a), top: B:34:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x007d A[RETURN] */
    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        l93 l93Var;
        d93 d93Var;
        QnHx qnHx;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        try {
            if (i != 0) {
                if (i == 1) {
                    l93Var = (l93) this.B;
                    C0239D.H(obj);
                } else if (i == 2) {
                    l93Var = (l93) this.B;
                    C0239D.H(obj);
                    d93Var = (d93) obj;
                    if (d93Var != null) {
                        this.C.invoke(new kt2(d93Var.c));
                        qnHx = new QnHx(d93Var, this.E, this.D, this.F, null);
                        this.B = null;
                        this.A = 3;
                        if (l93Var.i0(qnHx, this) == va0Var) {
                            return va0Var;
                        }
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C0239D.H(obj);
                }
                return sd5.a;
            }
            C0239D.H(obj);
            l93 l93Var2 = (l93) this.B;
            CQf cQf = new CQf(null);
            this.B = l93Var2;
            this.A = 1;
            Object objI0 = l93Var2.i0(cQf, this);
            if (objI0 == va0Var) {
                return va0Var;
            }
            l93Var = l93Var2;
            obj = objI0;
            d93 d93Var2 = (d93) obj;
            this.B = l93Var;
            this.A = 2;
            obj = bn0.a(l93Var, d93Var2, this);
            if (obj == va0Var) {
                return va0Var;
            }
            d93Var = (d93) obj;
            if (d93Var != null) {
                this.C.invoke(new kt2(d93Var.c));
                qnHx = new QnHx(d93Var, this.E, this.D, this.F, null);
                this.B = null;
                this.A = 3;
                if (l93Var.i0(qnHx, this) == va0Var) {
                    return va0Var;
                }
            }
            return sd5.a;
        } catch (CancellationException e) {
            this.D.invoke();
            throw e;
        }
    }

    @Override // defpackage.x81
    public final Object invoke(l93 l93Var, z80<? super sd5> z80Var) {
        return ((jn0) a(l93Var, z80Var)).i(sd5.a);
    }
}
