package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fw4<T> implements nz0<T> {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, z14] */
    public final sd5 a(z80 z80Var) throws Throwable {
        ew4 ew4Var;
        if (z80Var instanceof ew4) {
            ew4Var = (ew4) z80Var;
            int i = ew4Var.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                ew4Var.D = i - Integer.MIN_VALUE;
            } else {
                ew4Var = new ew4(this, z80Var);
            }
        } else {
            ew4Var = new ew4(this, z80Var);
        }
        Object obj = ew4Var.B;
        ?? r1 = ew4Var.D;
        try {
            if (r1 == 0) {
                C0239D.H(obj);
                z14 z14Var = new z14(null, ew4Var.x);
                ew4Var.z = this;
                ew4Var.A = z14Var;
                ew4Var.D = 1;
                throw null;
            }
            if (r1 == 1) {
                z14 z14Var2 = ew4Var.A;
                fw4 fw4Var = ew4Var.z;
                C0239D.H(obj);
                z14Var2.j();
                fw4Var.getClass();
            } else {
                if (r1 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            return sd5.a;
        } catch (Throwable th) {
            r1.j();
            throw th;
        }
    }

    @Override // defpackage.nz0
    public final Object f(T t, z80<? super sd5> z80Var) {
        throw null;
    }
}
