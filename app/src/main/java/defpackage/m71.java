package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m71 implements pa3 {
    public final /* synthetic */ int w;

    public /* synthetic */ m71(int i) {
        this.w = i;
    }

    @Override // defpackage.pa3
    public final boolean test(Object obj) {
        switch (this.w) {
            case 0:
                return ((y73) obj) instanceof y73.NUlFixed;
            case 1:
                return !XTd3.p((y73) obj);
            case 2:
                return ((dd3) obj).a();
            default:
                return ((dd3) obj).b == null;
        }
    }
}
