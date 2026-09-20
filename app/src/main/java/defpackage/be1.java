package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class be1 extends v05 {
    public final /* synthetic */ xd1.F1 e;
    public final /* synthetic */ boolean f = false;
    public final /* synthetic */ rg4 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be1(String str, xd1.F1 f1, rg4 rg4Var) {
        super(str, true);
        this.e = f1;
        this.g = rg4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, rg4] */
    /* JADX WARN: Type inference failed for: r2v3 */
    @Override // defpackage.v05
    public final long a() {
        int i;
        ?? r2;
        long jA;
        ke1[] ke1VarArr;
        xd1.F1 f1 = this.e;
        boolean z = this.f;
        rg4 rg4Var = this.g;
        f1.getClass();
        jl3 jl3Var = new jl3();
        xd1 xd1Var = xd1.this;
        synchronized (xd1Var.U) {
            synchronized (xd1Var) {
                try {
                    rg4 rg4Var2 = xd1Var.O;
                    i = 0;
                    if (z) {
                        r2 = rg4Var;
                    } else {
                        rg4 rg4Var3 = new rg4();
                        int i2 = 0;
                        while (true) {
                            boolean z2 = true;
                            if (i2 >= 10) {
                                break;
                            }
                            int i3 = i2 + 1;
                            if (((1 << i2) & rg4Var2.a) == 0) {
                                z2 = false;
                            }
                            if (z2) {
                                rg4Var3.b(i2, rg4Var2.b[i2]);
                            }
                            i2 = i3;
                        }
                        int i4 = 0;
                        while (i4 < 10) {
                            int i5 = i4 + 1;
                            if (((1 << i4) & rg4Var.a) != 0) {
                                rg4Var3.b(i4, rg4Var.b[i4]);
                            }
                            i4 = i5;
                        }
                        r2 = rg4Var3;
                    }
                    jl3Var.w = r2;
                    jA = ((long) r2.a()) - ((long) rg4Var2.a());
                    if (jA == 0 || xd1Var.y.isEmpty()) {
                        ke1VarArr = null;
                    } else {
                        Object[] array = xd1Var.y.values().toArray(new ke1[0]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        }
                        ke1VarArr = (ke1[]) array;
                    }
                    xd1Var.O = (rg4) jl3Var.w;
                    xd1Var.G.c(new yd1(ur1.d(" onSettings", xd1Var.z), xd1Var, jl3Var), 0L);
                    sd5 sd5Var = sd5.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                xd1Var.U.b((rg4) jl3Var.w);
            } catch (IOException e) {
                xd1Var.c(e);
            }
            sd5 sd5Var2 = sd5.a;
        }
        if (ke1VarArr == null) {
            return -1L;
        }
        int length = ke1VarArr.length;
        while (i < length) {
            ke1 ke1Var = ke1VarArr[i];
            i++;
            synchronized (ke1Var) {
                ke1Var.f += jA;
                if (jA > 0) {
                    ke1Var.notifyAll();
                }
                sd5 sd5Var3 = sd5.a;
            }
        }
        return -1L;
    }
}
