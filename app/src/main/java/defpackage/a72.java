package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a72 extends cx1 implements h81<Boolean> {
    public final /* synthetic */ is4<kt2> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a72(is4<kt2> is4Var) {
        super(0);
        this.w = is4Var;
    }

    @Override // defpackage.h81
    public final Boolean invoke() {
        return Boolean.valueOf(X.w(this.w.getValue().a));
    }
}
