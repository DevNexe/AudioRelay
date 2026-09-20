package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tz4 implements pa3 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ tz4(Object obj, int i) {
        this.w = i;
        this.x = obj;
    }

    @Override // defpackage.pa3
    public final boolean test(Object obj) {
        switch (this.w) {
            case 0:
                return ur1.a((String) this.x, ((rz4) obj).a);
            case 1:
                return ur1.a((String) obj, (String) this.x);
            default:
                return ((rn2) this.x).a.a;
        }
    }
}
