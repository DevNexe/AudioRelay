package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kr extends cx1 implements h81<Boolean> {
    public final /* synthetic */ ri2<Boolean> w;
    public final /* synthetic */ h81<Boolean> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kr(ri2 ri2Var, yr yrVar) {
        super(0);
        this.w = ri2Var;
        this.x = yrVar;
    }

    @Override // defpackage.h81
    public final Boolean invoke() {
        return Boolean.valueOf(this.w.getValue().booleanValue() || this.x.invoke().booleanValue());
    }
}
