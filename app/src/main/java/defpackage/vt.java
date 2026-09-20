package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vt extends cx1 implements j81<Byte, sd5> {
    public final /* synthetic */ StringBuilder w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt(StringBuilder sb) {
        super(1);
        this.w = sb;
    }

    @Override // defpackage.j81
    public final sd5 invoke(Byte b) {
        this.w.append(tt.a(b.byteValue()));
        return sd5.a;
    }
}
