package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class tz5 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final o06 f;

    public tz5(dq6 dq6Var, String str, String str2, String str3, long j, Bundle bundle) {
        o06 o06Var;
        oa3.e(str2);
        oa3.e(str3);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = 0L;
        if (bundle.isEmpty()) {
            o06Var = new o06(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    bi6 bi6Var = dq6Var.i;
                    dq6.h(bi6Var);
                    bi6Var.f.b("Param name can't be null");
                    it.remove();
                } else {
                    m37 m37Var = dq6Var.l;
                    dq6.f(m37Var);
                    Object objI = m37Var.i(bundle2.get(next), next);
                    if (objI == null) {
                        bi6 bi6Var2 = dq6Var.i;
                        dq6.h(bi6Var2);
                        bi6Var2.i.c(dq6Var.m.e(next), "Param value can't be null");
                        it.remove();
                    } else {
                        m37 m37Var2 = dq6Var.l;
                        dq6.f(m37Var2);
                        m37Var2.v(bundle2, next, objI);
                    }
                }
            }
            o06Var = new o06(bundle2);
        }
        this.f = o06Var;
    }

    public final tz5 a(dq6 dq6Var, long j) {
        return new tz5(dq6Var, this.c, this.a, this.b, this.d, j, this.f);
    }

    public final String toString() {
        return "Event{appId='" + this.a + "', name='" + this.b + "', params=" + this.f.toString() + "}";
    }

    public tz5(dq6 dq6Var, String str, String str2, String str3, long j, long j2, o06 o06Var) {
        oa3.e(str2);
        oa3.e(str3);
        oa3.h(o06Var);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            bi6 bi6Var = dq6Var.i;
            dq6.h(bi6Var);
            bi6Var.i.d(bi6.n(str2), "Event created with reverse previous/current timestamps. appId, name", bi6.n(str3));
        }
        this.f = o06Var;
    }
}
