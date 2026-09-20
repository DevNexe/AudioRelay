package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zm3 extends cx1 implements h81<Boolean> {
    public final /* synthetic */ lKy3 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm3(lKy3 lky3) {
        super(0);
        this.w = lky3;
    }

    @Override // defpackage.h81
    public final Boolean invoke() {
        return Boolean.valueOf(this.w.n());
    }
}
