package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class do4 implements sn4 {
    public final ua0 a;
    public final co4 b;
    public final nj4 c = OW8.c(0, 0, null, 7);

    public static final class CQf {
        public final String a;
        public final un4 b;

        public CQf(String str, un4 un4Var) {
            this.a = str;
            this.b = un4Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CQf)) {
                return false;
            }
            CQf cQf = (CQf) obj;
            return ur1.a(this.a, cQf.a) && this.b == cQf.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "SnackbarMessage(message=" + this.a + ", duration=" + this.b + ")";
        }
    }

    @if0(c = "com.azefsw.audioconnect.ui.snackbars.SnackbarHostWrapper$1", f = "SnackbarDisplayer.kt", l = {42}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public int A;

        /* JADX INFO: renamed from: do4$QnHx$QnHx, reason: collision with other inner class name */
        @if0(c = "com.azefsw.audioconnect.ui.snackbars.SnackbarHostWrapper$1$1", f = "SnackbarDisplayer.kt", l = {44}, m = "invokeSuspend")
        public static final class C0117QnHx extends px4 implements x81<CQf, z80<? super sd5>, Object> {
            public int A;
            public /* synthetic */ Object B;
            public final /* synthetic */ do4 C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0117QnHx(do4 do4Var, z80<? super C0117QnHx> z80Var) {
                super(2, z80Var);
                this.C = do4Var;
            }

            @Override // defpackage.m8
            public final z80<sd5> a(Object obj, z80<?> z80Var) {
                C0117QnHx c0117QnHx = new C0117QnHx(this.C, z80Var);
                c0117QnHx.B = obj;
                return c0117QnHx;
            }

            @Override // defpackage.m8
            public final Object i(Object obj) throws Throwable {
                va0 va0Var = va0.COROUTINE_SUSPENDED;
                int i = this.A;
                if (i == 0) {
                    C0239D.H(obj);
                    CQf cQf = (CQf) this.B;
                    co4 co4Var = this.C.b;
                    String str = cQf.a;
                    this.A = 1;
                    if (co4Var.a(str, null, cQf.b, this) == va0Var) {
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
            public final Object invoke(CQf cQf, z80<? super sd5> z80Var) {
                return ((C0117QnHx) a(cQf, z80Var)).i(sd5.a);
            }
        }

        public QnHx(z80<? super QnHx> z80Var) {
            super(2, z80Var);
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return do4.this.new QnHx(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                do4 do4Var = do4.this;
                nj4 nj4Var = do4Var.c;
                C0117QnHx c0117QnHx = new C0117QnHx(do4Var, null);
                this.A = 1;
                if (kd.e(nj4Var, c0117QnHx, this) == va0Var) {
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

    public do4(ua0 ua0Var, co4 co4Var) {
        this.a = ua0Var;
        this.b = co4Var;
        fp1.k0(ua0Var, null, 0, new QnHx(null), 3);
    }

    @Override // defpackage.sn4
    public final Object a(String str, un4 un4Var, z80<? super sd5> z80Var) {
        Object objF = this.c.f(new CQf(str, un4Var), z80Var);
        return objF == va0.COROUTINE_SUSPENDED ? objF : sd5.a;
    }
}
