package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ca3 extends cx1 implements h81<Boolean> {
    public final /* synthetic */ ba3 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca3(ba3 ba3Var) {
        super(0);
        this.w = ba3Var;
    }

    @Override // defpackage.h81
    public final Boolean invoke() {
        ba3 ba3Var = this.w;
        return Boolean.valueOf((ba3Var.getParentLayoutCoordinates() == null || ba3Var.m0getPopupContentSizebOM6tXw() == null) ? false : true);
    }
}
