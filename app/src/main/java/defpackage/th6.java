package defpackage;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class th6 implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ bi6 B;
    public final /* synthetic */ int w;
    public final /* synthetic */ String x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public th6(bi6 bi6Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.B = bi6Var;
        this.w = i;
        this.x = str;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xj6 xj6Var = this.B.a.h;
        dq6.f(xj6Var);
        if (!xj6Var.b) {
            Log.println(6, this.B.q(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        bi6 bi6Var = this.B;
        if (bi6Var.c == 0) {
            vv5 vv5Var = bi6Var.a.g;
            if (vv5Var.d == null) {
                synchronized (vv5Var) {
                    if (vv5Var.d == null) {
                        ApplicationInfo applicationInfo = vv5Var.a.a.getApplicationInfo();
                        String strA = me3.a();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            vv5Var.d = Boolean.valueOf(str != null && str.equals(strA));
                        }
                        if (vv5Var.d == null) {
                            vv5Var.d = Boolean.TRUE;
                            bi6 bi6Var2 = vv5Var.a.i;
                            dq6.h(bi6Var2);
                            bi6Var2.f.b("My process not in the list of running processes");
                        }
                    }
                }
            }
            if (vv5Var.d.booleanValue()) {
                bi6 bi6Var3 = this.B;
                bi6Var3.a.getClass();
                bi6Var3.c = 'C';
            } else {
                bi6 bi6Var4 = this.B;
                bi6Var4.a.getClass();
                bi6Var4.c = 'c';
            }
        }
        bi6 bi6Var5 = this.B;
        if (bi6Var5.d < 0) {
            bi6Var5.a.g.j();
            bi6Var5.d = 73000L;
        }
        char cCharAt = "01VDIWEA?".charAt(this.w);
        bi6 bi6Var6 = this.B;
        char c = bi6Var6.c;
        long j = bi6Var6.d;
        String strO = bi6.o(true, this.x, this.y, this.z, this.A);
        StringBuilder sb = new StringBuilder("2");
        sb.append(cCharAt);
        sb.append(c);
        sb.append(j);
        String strB = i5.b(sb, ":", strO);
        if (strB.length() > 1024) {
            strB = this.x.substring(0, 1024);
        }
        rj6 rj6Var = xj6Var.d;
        if (rj6Var != null) {
            xj6 xj6Var2 = rj6Var.e;
            xj6Var2.e();
            if (rj6Var.e.i().getLong(rj6Var.a, 0L) == 0) {
                rj6Var.a();
            }
            if (strB == null) {
                strB = "";
            }
            SharedPreferences sharedPreferencesI = xj6Var2.i();
            String str2 = rj6Var.b;
            long j2 = sharedPreferencesI.getLong(str2, 0L);
            String str3 = rj6Var.c;
            if (j2 <= 0) {
                SharedPreferences.Editor editorEdit = xj6Var2.i().edit();
                editorEdit.putString(str3, strB);
                editorEdit.putLong(str2, 1L);
                editorEdit.apply();
                return;
            }
            m37 m37Var = xj6Var2.a.l;
            dq6.f(m37Var);
            long jNextLong = m37Var.n().nextLong();
            long j3 = j2 + 1;
            long j4 = Long.MAX_VALUE / j3;
            SharedPreferences.Editor editorEdit2 = xj6Var2.i().edit();
            if ((jNextLong & Long.MAX_VALUE) < j4) {
                editorEdit2.putString(str3, strB);
            }
            editorEdit2.putLong(str2, j3);
            editorEdit2.apply();
        }
    }
}
