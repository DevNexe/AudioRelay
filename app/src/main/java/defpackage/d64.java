package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d64 extends cx1 implements h81<m64> {
    public final /* synthetic */ int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d64(int i) {
        super(0);
        this.w = i;
    }

    @Override // defpackage.h81
    public final m64 invoke() {
        return new m64(this.w);
    }
}
