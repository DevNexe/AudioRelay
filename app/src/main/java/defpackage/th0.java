package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class th0 implements w64 {
    public final j81<Float, Float> a;
    public final CQf b = new CQf();
    public final zi2 c = new zi2();
    public final kz2 d = ps0.R(Boolean.FALSE);

    public static final class CQf implements l64 {
        public CQf() {
        }

        @Override // defpackage.l64
        public final float a(float f) {
            return th0.this.a.invoke(Float.valueOf(f)).floatValue();
        }
    }

    @if0(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", f = "ScrollableState.kt", l = {147}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public int A;
        public final /* synthetic */ vi2 C;
        public final /* synthetic */ x81<l64, z80<? super sd5>, Object> D;

        /* JADX INFO: renamed from: th0$QnHx$QnHx, reason: collision with other inner class name */
        @if0(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", f = "ScrollableState.kt", l = {150}, m = "invokeSuspend")
        public static final class C0205QnHx extends px4 implements x81<l64, z80<? super sd5>, Object> {
            public int A;
            public /* synthetic */ Object B;
            public final /* synthetic */ th0 C;
            public final /* synthetic */ x81<l64, z80<? super sd5>, Object> D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0205QnHx(th0 th0Var, x81<? super l64, ? super z80<? super sd5>, ? extends Object> x81Var, z80<? super C0205QnHx> z80Var) {
                super(2, z80Var);
                this.C = th0Var;
                this.D = x81Var;
            }

            @Override // defpackage.m8
            public final z80<sd5> a(Object obj, z80<?> z80Var) {
                C0205QnHx c0205QnHx = new C0205QnHx(this.C, this.D, z80Var);
                c0205QnHx.B = obj;
                return c0205QnHx;
            }

            @Override // defpackage.m8
            public final Object i(Object obj) throws Throwable {
                va0 va0Var = va0.COROUTINE_SUSPENDED;
                int i = this.A;
                th0 th0Var = this.C;
                try {
                    if (i == 0) {
                        C0239D.H(obj);
                        l64 l64Var = (l64) this.B;
                        th0Var.d.setValue(Boolean.TRUE);
                        x81<l64, z80<? super sd5>, Object> x81Var = this.D;
                        this.A = 1;
                        if (x81Var.invoke(l64Var, this) == va0Var) {
                            return va0Var;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C0239D.H(obj);
                    }
                    th0Var.d.setValue(Boolean.FALSE);
                    return sd5.a;
                } catch (Throwable th) {
                    th0Var.d.setValue(Boolean.FALSE);
                    throw th;
                }
            }

            @Override // defpackage.x81
            public final Object invoke(l64 l64Var, z80<? super sd5> z80Var) {
                return ((C0205QnHx) a(l64Var, z80Var)).i(sd5.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(vi2 vi2Var, x81<? super l64, ? super z80<? super sd5>, ? extends Object> x81Var, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.C = vi2Var;
            this.D = x81Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return th0.this.new QnHx(this.C, this.D, z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                th0 th0Var = th0.this;
                zi2 zi2Var = th0Var.c;
                CQf cQf = th0Var.b;
                C0205QnHx c0205QnHx = new C0205QnHx(th0Var, this.D, null);
                this.A = 1;
                vi2 vi2Var = this.C;
                zi2Var.getClass();
                if (fp1.R(new yi2(vi2Var, zi2Var, c0205QnHx, cQf, null), this) == va0Var) {
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
        public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
            return ((QnHx) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public th0(j81<? super Float, Float> j81Var) {
        this.a = j81Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w64
    public final boolean a() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    @Override // defpackage.w64
    public final Object b(vi2 vi2Var, x81<? super l64, ? super z80<? super sd5>, ? extends Object> x81Var, z80<? super sd5> z80Var) {
        Object objR = fp1.R(new QnHx(vi2Var, x81Var, null), z80Var);
        return objR == va0.COROUTINE_SUSPENDED ? objR : sd5.a;
    }

    @Override // defpackage.w64
    public final float c(float f) {
        return this.a.invoke(Float.valueOf(f)).floatValue();
    }
}
