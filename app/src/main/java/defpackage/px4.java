package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class px4 extends b90 implements j91<Object> {
    public final int z;

    public px4(int i, z80<Object> z80Var) {
        super(z80Var);
        this.z = i;
    }

    @Override // defpackage.j91
    public final int getArity() {
        return this.z;
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
