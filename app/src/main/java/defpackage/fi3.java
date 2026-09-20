package defpackage;

import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.utils.io.jvm.javaio.ReadingKt$toByteReadChannel$2", f = "Reading.kt", l = {89}, m = "invokeSuspend")
public final class fi3 extends px4 implements x81<uo5, z80<? super sd5>, Object> {
    public byte[] A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ nq2<byte[]> D;
    public final /* synthetic */ InputStream E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi3(nq2<byte[]> nq2Var, InputStream inputStream, z80<? super fi3> z80Var) {
        super(2, z80Var);
        this.D = nq2Var;
        this.E = inputStream;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        fi3 fi3Var = new fi3(this.D, this.E, z80Var);
        fi3Var.C = obj;
        return fi3Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        byte[] bArrB;
        uo5 uo5Var;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.B;
        InputStream inputStream = this.E;
        nq2<byte[]> nq2Var = this.D;
        if (i == 0) {
            C0239D.H(obj);
            uo5 uo5Var2 = (uo5) this.C;
            bArrB = nq2Var.B();
            uo5Var = uo5Var2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bArrB = this.A;
            uo5Var = (uo5) this.C;
            try {
                C0239D.H(obj);
            } catch (Throwable th) {
                try {
                    uo5Var.l0().a(th);
                    nq2Var.p0(bArrB);
                } finally {
                    nq2Var.p0(bArrB);
                    inputStream.close();
                }
            }
        }
        while (true) {
            int i2 = inputStream.read(bArrB, 0, bArrB.length);
            if (i2 < 0) {
                nq2Var.p0(bArrB);
                return sd5.a;
            }
            if (i2 != 0) {
                oj ojVarL0 = uo5Var.l0();
                this.C = uo5Var;
                this.A = bArrB;
                this.B = 1;
                if (ojVarL0.d(bArrB, i2, this) == va0Var) {
                    return va0Var;
                }
            }
        }
    }

    @Override // defpackage.x81
    public final Object invoke(uo5 uo5Var, z80<? super sd5> z80Var) {
        return ((fi3) a(uo5Var, z80Var)).i(sd5.a);
    }
}
