package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class co4 {
    public final kotlinx.coroutines.sync.QnHx a = new kotlinx.coroutines.sync.QnHx(false);
    public final kz2 b = ps0.R(null);

    @if0(c = "androidx.compose.material.SnackbarHostState", f = "SnackbarHost.kt", l = {379, 382}, m = "showSnackbar")
    public static final class CQf extends b90 {
        public String A;
        public String B;
        public un4 C;
        public bj2 D;
        public /* synthetic */ Object E;
        public int G;
        public co4 z;

        public CQf(z80<? super CQf> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.E = obj;
            this.G |= Integer.MIN_VALUE;
            return co4.this.a(null, null, null, this);
        }
    }

    public static final class QnHx implements rn4 {
        public final String a;
        public final String b;
        public final un4 c;
        public final wm<qo4> d;

        public QnHx(String str, String str2, un4 un4Var, xm xmVar) {
            this.a = str;
            this.b = str2;
            this.c = un4Var;
            this.d = xmVar;
        }

        @Override // defpackage.rn4
        public final void a() {
            wm<qo4> wmVar = this.d;
            if (wmVar.c()) {
                wmVar.x(qo4.ActionPerformed);
            }
        }

        @Override // defpackage.rn4
        public final String b() {
            return this.b;
        }

        @Override // defpackage.rn4
        public final void dismiss() {
            wm<qo4> wmVar = this.d;
            if (wmVar.c()) {
                wmVar.x(qo4.Dismissed);
            }
        }

        @Override // defpackage.rn4
        public final un4 getDuration() {
            return this.c;
        }

        @Override // defpackage.rn4
        public final String getMessage() {
            return this.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(String str, String str2, un4 un4Var, z80<? super qo4> z80Var) throws Throwable {
        CQf cQf;
        bj2 bj2Var;
        un4 un4Var2;
        String str3;
        co4 co4Var;
        String str4;
        Throwable th;
        bj2 bj2Var2;
        if (z80Var instanceof CQf) {
            cQf = (CQf) z80Var;
            int i = cQf.G;
            if ((i & Integer.MIN_VALUE) != 0) {
                cQf.G = i - Integer.MIN_VALUE;
            } else {
                cQf = new CQf(z80Var);
            }
        } else {
            cQf = new CQf(z80Var);
        }
        Object obj = cQf.E;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = cQf.G;
        try {
            try {
                if (i2 == 0) {
                    C0239D.H(obj);
                    cQf.z = this;
                    cQf.A = str;
                    cQf.B = str2;
                    cQf.C = un4Var;
                    bj2Var = this.a;
                    cQf.D = bj2Var;
                    cQf.G = 1;
                    if (bj2Var.b(null, cQf) == va0Var) {
                        return va0Var;
                    }
                    un4Var2 = un4Var;
                    str3 = str2;
                    co4Var = this;
                    str4 = str;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bj2Var2 = cQf.D;
                        co4Var = cQf.z;
                        try {
                            C0239D.H(obj);
                            co4Var.b.setValue(null);
                            bj2Var2.a(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            co4Var.b.setValue(null);
                            throw th;
                        }
                    }
                    bj2 bj2Var3 = cQf.D;
                    un4 un4Var3 = cQf.C;
                    String str5 = cQf.B;
                    String str6 = cQf.A;
                    co4 co4Var2 = cQf.z;
                    C0239D.H(obj);
                    bj2Var = bj2Var3;
                    str4 = str6;
                    un4Var2 = un4Var3;
                    str3 = str5;
                    co4Var = co4Var2;
                }
                cQf.z = co4Var;
                cQf.A = str4;
                cQf.B = str3;
                cQf.C = un4Var2;
                cQf.D = bj2Var;
                cQf.getClass();
                cQf.G = 2;
                xm xmVar = new xm(1, ps0.L(cQf));
                xmVar.r();
                co4Var.b.setValue(new QnHx(str4, str3, un4Var2, xmVar));
                Object objP = xmVar.p();
                if (objP == va0Var) {
                    return va0Var;
                }
                bj2 bj2Var4 = bj2Var;
                obj = objP;
                bj2Var2 = bj2Var4;
                co4Var.b.setValue(null);
                bj2Var2.a(null);
                return obj;
            } catch (Throwable th3) {
                th = th3;
                co4Var.b.setValue(null);
                throw th;
            }
        } catch (Throwable th4) {
            str.a(null);
            throw th4;
        }
    }
}
