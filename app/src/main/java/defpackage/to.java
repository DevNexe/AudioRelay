package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class to extends cx1 implements h81<String> {
    public final /* synthetic */ I8O w;
    public final /* synthetic */ String x;
    public final /* synthetic */ String y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public to(I8O i8o, String str, String str2) {
        super(0);
        this.w = i8o;
        this.x = str;
        this.y = str2;
    }

    @Override // defpackage.h81
    public final String invoke() {
        String strF = this.w.a.f(this.x);
        return strF == null ? this.y : strF;
    }
}
