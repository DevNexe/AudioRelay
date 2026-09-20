package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vn4 extends cx1 implements h81<Boolean> {
    public final /* synthetic */ rn4 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn4(rn4 rn4Var) {
        super(0);
        this.w = rn4Var;
    }

    @Override // defpackage.h81
    public final Boolean invoke() {
        this.w.dismiss();
        return Boolean.TRUE;
    }
}
