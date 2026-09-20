package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qh2 extends cx1 implements h81<sd5> {
    public final /* synthetic */ String w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh2(String str) {
        super(0);
        this.w = str;
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        a62.a.f("payload_parsing_failure", new ph2(this.w));
        return sd5.a;
    }
}
