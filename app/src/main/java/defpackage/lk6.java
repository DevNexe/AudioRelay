package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lk6 {
    public final dq6 a;

    public lk6(r27 r27Var) {
        this.a = r27Var.l;
    }

    public final boolean a() {
        dq6 dq6Var = this.a;
        try {
            nx2 nx2VarA = so5.a(dq6Var.a);
            if (nx2VarA != null) {
                return nx2VarA.b(128, "com.android.vending").versionCode >= 80837300;
            }
            bi6 bi6Var = dq6Var.i;
            dq6.h(bi6Var);
            bi6Var.n.b("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            bi6 bi6Var2 = dq6Var.i;
            dq6.h(bi6Var2);
            bi6Var2.n.c(e, "Failed to retrieve Play Store version for Install Referrer");
            return false;
        }
    }
}
