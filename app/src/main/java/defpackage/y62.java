package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y62 extends cx1 implements h81<kt2> {
    public final /* synthetic */ is4<kt2> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y62(is4<kt2> is4Var) {
        super(0);
        this.w = is4Var;
    }

    @Override // defpackage.h81
    public final kt2 invoke() {
        return new kt2(this.w.getValue().a);
    }
}
