package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class sa7 {
    public final dq6 a;

    public sa7(dq6 dq6Var) {
        this.a = dq6Var;
    }

    public final void a(String str, Bundle bundle) {
        String string;
        dq6 dq6Var = this.a;
        ro6 ro6Var = dq6Var.j;
        dq6.h(ro6Var);
        ro6Var.e();
        if (dq6Var.d()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        xj6 xj6Var = dq6Var.h;
        dq6.f(xj6Var);
        xj6Var.t.b(string);
        dq6.f(xj6Var);
        dq6Var.n.getClass();
        xj6Var.u.b(System.currentTimeMillis());
    }

    public final boolean b() {
        xj6 xj6Var = this.a.h;
        dq6.f(xj6Var);
        return xj6Var.u.a() > 0;
    }

    public final boolean c() {
        if (!b()) {
            return false;
        }
        dq6 dq6Var = this.a;
        dq6Var.n.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        xj6 xj6Var = dq6Var.h;
        dq6.f(xj6Var);
        return jCurrentTimeMillis - xj6Var.u.a() > dq6Var.g.k(null, lg6.S);
    }
}
