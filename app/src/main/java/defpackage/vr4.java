package defpackage;

import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes3.dex */
public final class vr4 implements vj4 {

    @if0(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", l = {155}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<nz0<? super tj4>, z80<? super sd5>, Object> {
        public int A;
        public /* synthetic */ Object B;
        public final /* synthetic */ js4<Integer> C;

        /* JADX INFO: renamed from: vr4$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0215QnHx<T> implements nz0 {
            public final /* synthetic */ fl3 w;
            public final /* synthetic */ nz0<tj4> x;

            /* JADX INFO: renamed from: vr4$QnHx$QnHx$QnHx, reason: collision with other inner class name */
            @if0(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", l = {158}, m = "emit")
            public static final class C0216QnHx extends b90 {
                public final /* synthetic */ C0215QnHx<T> A;
                public int B;
                public /* synthetic */ Object z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0216QnHx(C0215QnHx<? super T> c0215QnHx, z80<? super C0216QnHx> z80Var) {
                    super(z80Var);
                    this.A = c0215QnHx;
                }

                @Override // defpackage.m8
                public final Object i(Object obj) {
                    this.z = obj;
                    this.B |= Integer.MIN_VALUE;
                    return this.A.a(0, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0215QnHx(fl3 fl3Var, nz0<? super tj4> nz0Var) {
                this.w = fl3Var;
                this.x = nz0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            public final Object a(int i, z80<? super sd5> z80Var) throws Throwable {
                C0216QnHx c0216QnHx;
                if (z80Var instanceof C0216QnHx) {
                    c0216QnHx = (C0216QnHx) z80Var;
                    int i2 = c0216QnHx.B;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0216QnHx.B = i2 - Integer.MIN_VALUE;
                    } else {
                        c0216QnHx = new C0216QnHx(this, z80Var);
                    }
                } else {
                    c0216QnHx = new C0216QnHx(this, z80Var);
                }
                Object obj = c0216QnHx.z;
                va0 va0Var = va0.COROUTINE_SUSPENDED;
                int i3 = c0216QnHx.B;
                if (i3 == 0) {
                    C0239D.H(obj);
                    if (i > 0) {
                        fl3 fl3Var = this.w;
                        if (!fl3Var.w) {
                            fl3Var.w = true;
                            tj4 tj4Var = tj4.START;
                            c0216QnHx.B = 1;
                            if (this.x.f(tj4Var, c0216QnHx) == va0Var) {
                                return va0Var;
                            }
                        }
                    }
                    return sd5.a;
                }
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
                return sd5.a;
            }

            @Override // defpackage.nz0
            public final /* bridge */ /* synthetic */ Object f(Object obj, z80 z80Var) {
                return a(((Number) obj).intValue(), z80Var);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(js4<Integer> js4Var, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.C = js4Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            QnHx qnHx = new QnHx(this.C, z80Var);
            qnHx.B = obj;
            return qnHx;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                C0215QnHx c0215QnHx = new C0215QnHx(new fl3(), (nz0) this.B);
                this.A = 1;
                if (this.C.a(c0215QnHx, this) == va0Var) {
                    return va0Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // defpackage.x81
        public final Object invoke(nz0<? super tj4> nz0Var, z80<? super sd5> z80Var) throws Throwable {
            ((QnHx) a(nz0Var, z80Var)).i(sd5.a);
            return va0.COROUTINE_SUSPENDED;
        }
    }

    @Override // defpackage.vj4
    public final mz0<tj4> a(js4<Integer> js4Var) {
        return new d24(new QnHx(js4Var, null));
    }

    public final String toString() {
        return "SharingStarted.Lazily";
    }
}
