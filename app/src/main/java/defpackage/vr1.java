package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vr1 extends dq3 {
    public int x;
    public final /* synthetic */ x81 y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr1(Object obj, z80 z80Var, x81 x81Var) {
        super(z80Var);
        this.y = x81Var;
        this.z = obj;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        int i = this.x;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.x = 2;
            C0239D.H(obj);
            return obj;
        }
        this.x = 1;
        C0239D.H(obj);
        x81 x81Var = this.y;
        sb5.d(2, x81Var);
        return x81Var.invoke(this.z, this);
    }
}
