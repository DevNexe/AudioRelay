package j$.time.temporal;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n implements m {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ n(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // j$.time.temporal.m
    public final k p(k kVar) {
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                int iJ = kVar.j(a.DAY_OF_WEEK);
                if (iJ == i2) {
                    return kVar;
                }
                int i3 = iJ - i2;
                return kVar.d(i3 >= 0 ? 7 - i3 : -i3, b.DAYS);
            default:
                int iJ2 = kVar.j(a.DAY_OF_WEEK);
                if (iJ2 == i2) {
                    return kVar;
                }
                int i4 = i2 - iJ2;
                return kVar.z(i4 >= 0 ? 7 - i4 : -i4, b.DAYS);
        }
    }
}
