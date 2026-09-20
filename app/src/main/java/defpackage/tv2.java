package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tv2 extends cx1 implements h81<sd5> {
    public final /* synthetic */ String w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv2(String str) {
        super(0);
        this.w = str;
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        a62.a.h("player", "opus_decoding_failed", this.w);
        return sd5.a;
    }
}
