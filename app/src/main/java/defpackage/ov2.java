package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ov2 extends cx1 implements h81<mv2> {
    public final /* synthetic */ String w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov2(String str) {
        super(0);
        this.w = str;
    }

    @Override // defpackage.h81
    public final mv2 invoke() {
        return v84.a(this.w, "0.20.0") ^ true ? mv2.WINDOWS : mv2.UNKNOWN;
    }
}
