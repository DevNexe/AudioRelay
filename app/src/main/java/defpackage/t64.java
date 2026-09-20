package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t64 extends cx1 implements h81<Boolean> {
    public final /* synthetic */ is4<z64> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t64(ri2 ri2Var) {
        super(0);
        this.w = ri2Var;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    @Override // defpackage.h81
    public final Boolean invoke() {
        boolean z;
        z64 value = this.w.getValue();
        if (!value.d.a()) {
            tw2 tw2Var = value.f;
            z = tw2Var != null ? tw2Var.e() : false;
        }
        return Boolean.valueOf(z);
    }
}
