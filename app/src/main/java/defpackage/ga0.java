package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ga0 implements dj4 {
    public final ja0 a;
    public final ja0 b;
    public final ja0 c;
    public final ja0 d;

    public ga0(ja0 ja0Var, ja0 ja0Var2, ja0 ja0Var3, ja0 ja0Var4) {
        this.a = ja0Var;
        this.b = ja0Var2;
        this.c = ja0Var3;
        this.d = ja0Var4;
    }

    @Override // defpackage.dj4
    public final ew2 a(long j, jy1 jy1Var, ij0 ij0Var) {
        float fA = this.a.a(j, ij0Var);
        float fA2 = this.b.a(j, ij0Var);
        float fA3 = this.c.a(j, ij0Var);
        float fA4 = this.d.a(j, ij0Var);
        float fD = cm4.d(j);
        float f = fA + fA4;
        if (f > fD) {
            float f2 = fD / f;
            fA *= f2;
            fA4 *= f2;
        }
        float f3 = fA4;
        float f4 = fA2 + fA3;
        if (f4 > fD) {
            float f5 = fD / f4;
            fA2 *= f5;
            fA3 *= f5;
        }
        if (fA >= 0.0f && fA2 >= 0.0f && fA3 >= 0.0f && f3 >= 0.0f) {
            return c(j, fA, fA2, fA3, f3, jy1Var);
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + f3 + ")!").toString());
    }

    public abstract lu3 b(ja0 ja0Var, ja0 ja0Var2, ja0 ja0Var3, ja0 ja0Var4);

    public abstract ew2 c(long j, float f, float f2, float f3, float f4, jy1 jy1Var);
}
