package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h64 extends cx1 implements h81<Float> {
    public final /* synthetic */ m64 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h64(m64 m64Var) {
        super(0);
        this.w = m64Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.h81
    public final Float invoke() {
        return Float.valueOf(((Number) this.w.c.getValue()).intValue());
    }
}
