package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s12 extends cx1 implements h81<q12> {
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s12(int i, int i2) {
        super(0);
        this.w = i;
        this.x = i2;
    }

    @Override // defpackage.h81
    public final q12 invoke() {
        return new q12(this.w, this.x);
    }
}
