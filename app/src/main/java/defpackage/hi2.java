package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class hi2 implements l03 {
    public final String a;
    public final Context b;
    public final Activity c;
    public final kz2 d = ps0.R(c());
    public B8C e;

    public hi2(String str, Context context, Activity activity) {
        this.a = str;
        this.b = context;
        this.c = activity;
    }

    @Override // defpackage.l03
    public final o03 a() {
        return (o03) this.d.getValue();
    }

    @Override // defpackage.l03
    public final void b() {
        sd5 sd5Var;
        B8C b8c = this.e;
        if (b8c != null) {
            b8c.H0(this.a);
            sd5Var = sd5.a;
        } else {
            sd5Var = null;
        }
        if (sd5Var == null) {
            throw new IllegalStateException("ActivityResultLauncher cannot be null");
        }
    }

    public final o03 c() {
        Context context = this.b;
        String str = this.a;
        boolean zC = false;
        if (r80.a(context, str) == 0) {
            return o03.CQf.a;
        }
        int i = q2H0.b;
        if ((zh.b() || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) && Build.VERSION.SDK_INT >= 23) {
            zC = q2H0.CQf.c(this.c, str);
        }
        return new o03.QnHx(zC);
    }
}
