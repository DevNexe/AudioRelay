package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g64 extends cx1 implements h81<Float> {
    public final /* synthetic */ m64 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g64(m64 m64Var) {
        super(0);
        this.w = m64Var;
    }

    @Override // defpackage.h81
    public final Float invoke() {
        return Float.valueOf(this.w.d());
    }
}
