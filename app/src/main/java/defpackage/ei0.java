package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.client.plugins.DefaultTransformersJvmKt$platformResponseDefaultTransformers$1", f = "DefaultTransformersJvm.kt", l = {36}, m = "invokeSuspend")
public final class ei0 extends px4 implements y81<k33<rg1, ve1>, rg1, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ k33 B;
    public /* synthetic */ rg1 C;

    public static final class QnHx extends InputStream {
        public final /* synthetic */ InputStream w;
        public final /* synthetic */ k33<rg1, ve1> x;

        public QnHx(rn1 rn1Var, k33 k33Var) {
            this.w = rn1Var;
            this.x = k33Var;
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.w.available();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            super.close();
            this.w.close();
            tg1.b(this.x.w.e());
        }

        @Override // java.io.InputStream
        public final int read() {
            return this.w.read();
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) {
            return this.w.read(bArr, i, i2);
        }
    }

    public ei0(z80<? super ei0> z80Var) {
        super(3, z80Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            k33 k33Var = this.B;
            rg1 rg1Var = this.C;
            rb5 rb5Var = rg1Var.a;
            Object obj2 = rg1Var.b;
            if (!(obj2 instanceof fk)) {
                return sd5.a;
            }
            if (ur1.a(rb5Var.a, nl3.a(InputStream.class))) {
                ms1 ms1Var = (ms1) ((ve1) k33Var.w).g().j(ms1.CQf.w);
                ry4 ry4Var = ib.a;
                rg1 rg1Var2 = new rg1(rb5Var, new QnHx(new rn1((fk) obj2, ms1Var), k33Var));
                this.B = null;
                this.A = 1;
                if (k33Var.e(rg1Var2, this) == va0Var) {
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
    public final Object invoke(k33<rg1, ve1> k33Var, rg1 rg1Var, z80<? super sd5> z80Var) {
        ei0 ei0Var = new ei0(z80Var);
        ei0Var.B = k33Var;
        ei0Var.C = rg1Var;
        return ei0Var.i(sd5.a);
    }
}
