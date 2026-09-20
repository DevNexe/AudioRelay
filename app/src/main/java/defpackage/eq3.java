package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class eq3 extends dq3 implements j91<Object> {
    public final int x;

    public eq3(int i, z80<Object> z80Var) {
        super(z80Var);
        this.x = i;
    }

    @Override // defpackage.j91
    public final int getArity() {
        return this.x;
    }

    @Override // defpackage.m8
    public final String toString() {
        if (this.w != null) {
            return super.toString();
        }
        nl3.a.getClass();
        return ol3.a(this);
    }
}
