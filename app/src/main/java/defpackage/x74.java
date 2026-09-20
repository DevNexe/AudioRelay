package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x74 extends cx1 implements h81<kt2> {
    public final /* synthetic */ is4<kt2> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x74(AOdm aOdm) {
        super(0);
        this.w = aOdm;
    }

    @Override // defpackage.h81
    public final kt2 invoke() {
        return new kt2(this.w.getValue().a);
    }
}
