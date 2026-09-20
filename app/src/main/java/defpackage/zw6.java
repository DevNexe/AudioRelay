package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class zw6 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ zw6(Object obj, int i) {
        this.w = i;
        this.x = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case 0:
                sa7 sa7Var = ((dy6) obj).n;
                dq6 dq6Var = sa7Var.a;
                ro6 ro6Var = dq6Var.j;
                dq6.h(ro6Var);
                ro6Var.e();
                if (sa7Var.b()) {
                    boolean zC = sa7Var.c();
                    dy6 dy6Var = dq6Var.p;
                    xj6 xj6Var = dq6Var.h;
                    if (zC) {
                        dq6.f(xj6Var);
                        xj6Var.t.b(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        dq6.g(dy6Var);
                        dy6Var.l(bundle, "auto", "_cmpx");
                    } else {
                        dq6.f(xj6Var);
                        tj6 tj6Var = xj6Var.t;
                        String strA = tj6Var.a();
                        if (TextUtils.isEmpty(strA)) {
                            bi6 bi6Var = dq6Var.i;
                            dq6.h(bi6Var);
                            bi6Var.g.b("Cache still valid but referrer not found");
                        } else {
                            long jA = ((xj6Var.u.a() / 3600000) - 1) * 3600000;
                            Uri uri = Uri.parse(strA);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(uri.getPath(), bundle2);
                            for (String str : uri.getQueryParameterNames()) {
                                bundle2.putString(str, uri.getQueryParameter(str));
                            }
                            ((Bundle) pair.second).putLong("_cc", jA);
                            Object obj2 = pair.first;
                            String str2 = obj2 == null ? "app" : (String) obj2;
                            dq6.g(dy6Var);
                            dy6Var.l((Bundle) pair.second, str2, "_cmp");
                        }
                        tj6Var.b(null);
                    }
                    dq6.f(xj6Var);
                    xj6Var.u.b(0L);
                    break;
                }
                break;
            default:
                u07 u07Var = ((s07) obj).c;
                u07Var.d = null;
                u07Var.o();
                break;
        }
    }
}
