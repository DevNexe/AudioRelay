package defpackage;

import com.google.android.gms.internal.ads.zzaka;

/* JADX INFO: loaded from: classes3.dex */
public final class qx5 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ long y;
    public final /* synthetic */ Object z;

    public /* synthetic */ qx5(Object obj, Object obj2, long j, int i) {
        this.w = i;
        this.z = obj;
        this.x = obj2;
        this.y = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.w;
        Object obj = null;
        long j = this.y;
        Object obj2 = this.x;
        Object obj3 = this.z;
        switch (i) {
            case 0:
                zzaka zzakaVar = (zzaka) obj3;
                zzakaVar.w.a((String) obj2, j);
                zzakaVar.w.b(zzakaVar.toString());
                break;
            case 1:
                id6 id6Var = (id6) obj3;
                String str = (String) obj2;
                id6Var.e();
                oa3.e(str);
                Bt7j bt7j = id6Var.c;
                Integer num = (Integer) bt7j.getOrDefault(str, null);
                dq6 dq6Var = id6Var.a;
                if (num == null) {
                    bi6 bi6Var = dq6Var.i;
                    dq6.h(bi6Var);
                    bi6Var.f.c(str, "Call to endAdUnitExposure for unknown ad unit id");
                } else {
                    dz6 dz6Var = dq6Var.o;
                    dq6.g(dz6Var);
                    qy6 qy6VarK = dz6Var.k(false);
                    int iIntValue = num.intValue() - 1;
                    if (iIntValue != 0) {
                        bt7j.put(str, Integer.valueOf(iIntValue));
                    } else {
                        bt7j.remove(str);
                        Bt7j bt7j2 = id6Var.b;
                        Long l = (Long) bt7j2.getOrDefault(str, null);
                        bi6 bi6Var2 = dq6Var.i;
                        if (l == null) {
                            dq6.h(bi6Var2);
                            bi6Var2.f.b("First ad unit exposure time was never set");
                        } else {
                            long jLongValue = l.longValue();
                            bt7j2.remove(str);
                            id6Var.j(str, j - jLongValue, qy6VarK);
                        }
                        if (bt7j.isEmpty()) {
                            long j2 = id6Var.d;
                            if (j2 != 0) {
                                id6Var.i(j - j2, qy6VarK);
                                id6Var.d = 0L;
                            } else {
                                dq6.h(bi6Var2);
                                bi6Var2.f.b("First ad exposure time was never set");
                            }
                        }
                    }
                }
                break;
            default:
                dz6 dz6Var2 = (dz6) obj3;
                dz6Var2.j((qy6) obj2, false, j);
                dz6Var2.e = null;
                u07 u07VarQ = dz6Var2.a.q();
                u07VarQ.e();
                u07VarQ.f();
                u07VarQ.q(new ta7(u07VarQ, obj, 13));
                break;
        }
    }
}
