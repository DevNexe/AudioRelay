package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wr1 extends b90 {
    public final /* synthetic */ x81 A;
    public final /* synthetic */ Object B;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr1(z80 z80Var, la0 la0Var, x81 x81Var, Object obj) {
        super(z80Var, la0Var);
        this.A = x81Var;
        this.B = obj;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        int i = this.z;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.z = 2;
            C0239D.H(obj);
            return obj;
        }
        this.z = 1;
        C0239D.H(obj);
        x81 x81Var = this.A;
        sb5.d(2, x81Var);
        return x81Var.invoke(this.B, this);
    }
}
