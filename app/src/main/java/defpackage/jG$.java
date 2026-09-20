package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jG$ implements m70 {
    public final /* synthetic */ int w;

    public /* synthetic */ jG$(int i) {
        this.w = i;
    }

    @Override // defpackage.m70
    public final void accept(Object obj) {
        switch (this.w) {
            case 0:
                if (((Vb5) obj).b != 1) {
                    throw new IllegalStateException("Expected an AdMob config".toString());
                }
                return;
            case 1:
                a62 a62Var = a62.a;
                a62.a.d((Throwable) obj, true);
                return;
            case 2:
                a62.a.b("Can't print the device id", (Throwable) obj);
                return;
            case 3:
                a62.a.c("Network addresses: " + ((hn2) obj));
                return;
            case 4:
                a62 a62Var2 = a62.a;
                a62.a.d((Throwable) obj, true);
                return;
            case 5:
                a62 a62Var3 = a62.a;
                return;
            case 6:
                a62.a.a("Write message error: " + ((Throwable) obj).getMessage());
                return;
            case 7:
                a62 a62Var4 = a62.a;
                return;
            case 8:
                a62.a.h("premium", "failed_to_check_if_premium", ((Throwable) obj).getMessage());
                return;
            case 9:
                a62 a62Var5 = a62.a;
                return;
            case 10:
                a62 a62Var6 = a62.a;
                return;
            case 11:
                a62 a62Var7 = a62.a;
                return;
            default:
                a62.a.h("drawer", "store_navigation_failed", ((Throwable) obj).getMessage());
                return;
        }
    }
}
