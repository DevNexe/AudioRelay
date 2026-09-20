package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fe1 extends v05 {
    public final /* synthetic */ xd1 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe1(String str, xd1 xd1Var, int i, rt0 rt0Var) {
        super(str, true);
        this.e = xd1Var;
        this.f = i;
    }

    @Override // defpackage.v05
    public final long a() {
        this.e.H.getClass();
        synchronized (this.e) {
            this.e.W.remove(Integer.valueOf(this.f));
            sd5 sd5Var = sd5.a;
        }
        return -1L;
    }
}
