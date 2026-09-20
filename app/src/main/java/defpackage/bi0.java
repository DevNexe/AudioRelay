package defpackage;

import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$1", f = "DefaultTransform.kt", l = {53}, m = "invokeSuspend")
public final class bi0 extends px4 implements y81<k33<Object, ig1>, Object, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ k33 B;
    public /* synthetic */ Object C;

    public static final class CQf extends dw2.F1 {
        public final Long a;
        public final n80 b;
        public final /* synthetic */ Object c;

        public CQf(k33<Object, ig1> k33Var, n80 n80Var, Object obj) {
            this.c = obj;
            oc1 oc1Var = k33Var.w.c;
            List<String> list = rf1.a;
            String strG = oc1Var.g("Content-Length");
            this.a = strG != null ? Long.valueOf(Long.parseLong(strG)) : null;
            this.b = n80Var == null ? n80.QnHx.b : n80Var;
        }

        @Override // defpackage.dw2
        public final Long a() {
            return this.a;
        }

        @Override // defpackage.dw2
        public final n80 b() {
            return this.b;
        }

        @Override // dw2.F1
        public final fk d() {
            return (fk) this.c;
        }
    }

    public static final class QnHx extends dw2.QnHx {
        public final n80 a;
        public final long b;
        public final /* synthetic */ Object c;

        public QnHx(n80 n80Var, Object obj) {
            this.c = obj;
            if (n80Var == null) {
                n80 n80Var2 = n80.QnHx.a;
                n80Var = n80.QnHx.b;
            }
            this.a = n80Var;
            this.b = ((byte[]) obj).length;
        }

        @Override // defpackage.dw2
        public final Long a() {
            return Long.valueOf(this.b);
        }

        @Override // defpackage.dw2
        public final n80 b() {
            return this.a;
        }

        @Override // dw2.QnHx
        public final byte[] d() {
            return (byte[]) this.c;
        }
    }

    public bi0(z80<? super bi0> z80Var) {
        super(3, z80Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        dw2 di0Var;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            k33 k33Var = this.B;
            Object obj2 = this.C;
            oc1 oc1Var = ((ig1) k33Var.w).c;
            List<String> list = rf1.a;
            String strG = oc1Var.g("Accept");
            TContext tcontext = k33Var.w;
            if (strG == null) {
                ((ig1) tcontext).c.e("Accept", "*/*");
            }
            n80 n80VarB = ac.b((tf1) tcontext);
            if (obj2 instanceof String) {
                String str = (String) obj2;
                if (n80VarB == null) {
                    n80VarB = n80.F1.a;
                }
                di0Var = new v15(str, n80VarB);
            } else if (obj2 instanceof byte[]) {
                di0Var = new QnHx(n80VarB, obj2);
            } else if (obj2 instanceof fk) {
                di0Var = new CQf(k33Var, n80VarB, obj2);
            } else if (obj2 instanceof dw2) {
                di0Var = (dw2) obj2;
            } else {
                di0Var = obj2 instanceof InputStream ? new di0((ig1) tcontext, n80VarB, obj2) : null;
            }
            if ((di0Var != null ? di0Var.b() : null) != null) {
                ((ig1) tcontext).c.b.remove("Content-Type");
                this.B = null;
                this.A = 1;
                if (k33Var.e(di0Var, this) == va0Var) {
                    return va0Var;
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
    public final Object invoke(k33<Object, ig1> k33Var, Object obj, z80<? super sd5> z80Var) {
        bi0 bi0Var = new bi0(z80Var);
        bi0Var.B = k33Var;
        bi0Var.C = obj;
        return bi0Var.i(sd5.a);
    }
}
