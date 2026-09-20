package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzaka;
import com.google.android.gms.internal.ads.zzakg;
import com.google.android.gms.internal.ads.zzcia;
import com.google.android.gms.internal.ads.zzcib;
import com.google.android.gms.internal.measurement.LPt9Fixed;
import com.google.android.gms.internal.measurement.Xn1;
import com.google.android.gms.measurement.internal.zzee;
import com.google.android.gms.measurement.internal.zzgq;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class px5 implements Runnable {
    public final /* synthetic */ int w;
    public final Object x;
    public final Object y;
    public final Object z;

    public /* synthetic */ px5(Object obj, Object obj2, Object obj3, int i) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        o06 o06Var;
        int i = this.w;
        Object obj = this.z;
        Object obj2 = this.y;
        Object obj3 = this.x;
        switch (i) {
            case 0:
                zzaka zzakaVar = (zzaka) obj3;
                zzakaVar.zzw();
                zzakg zzakgVar = (zzakg) obj2;
                if (zzakgVar.zzc()) {
                    zzakaVar.c(zzakgVar.zza);
                } else {
                    zzakaVar.zzn(zzakgVar.zzc);
                }
                if (zzakgVar.zzd) {
                    zzakaVar.zzm("intermediate-response");
                } else {
                    zzakaVar.d("done");
                }
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                }
                break;
            case 1:
                zzcib zzcibVar = ((zzcia) obj).L;
                if (zzcibVar != null) {
                    zzcibVar.zzb((String) obj3, (String) obj2);
                }
                break;
            case 2:
                String str = (String) obj2;
                Bundle bundle = (Bundle) obj;
                iy5 iy5Var = ((zzgq) obj3).w.c;
                r27.E(iy5Var);
                iy5Var.e();
                iy5Var.f();
                oa3.e(str);
                oa3.e("dep");
                TextUtils.isEmpty("");
                dq6 dq6Var = iy5Var.a;
                if (bundle == null || bundle.isEmpty()) {
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
                b37 b37Var = iy5Var.b.g;
                r27.E(b37Var);
                km6 km6VarV = Xn1.v();
                if (km6VarV.y) {
                    km6VarV.p();
                    km6VarV.y = false;
                }
                Xn1.H(0L, (Xn1) km6VarV.x);
                Bundle bundle3 = o06Var.w;
                for (String str2 : bundle3.keySet()) {
                    so6 so6VarV = LPt9Fixed.v();
                    so6VarV.r(str2);
                    Object obj4 = bundle3.get(str2);
                    oa3.h(obj4);
                    b37Var.C(so6VarV, obj4);
                    km6VarV.t(so6VarV);
                }
                byte[] bArrG = ((Xn1) km6VarV.n()).g();
                bi6 bi6Var3 = dq6Var.i;
                dq6.h(bi6Var3);
                wh6 wh6Var = bi6Var3.f;
                bi6Var3.n.d(dq6Var.m.d(str), "Saving default event parameters, appId, data size", Integer.valueOf(bArrG.length));
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("parameters", bArrG);
                try {
                    if (iy5Var.x().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                        dq6.h(bi6Var3);
                        wh6Var.c(bi6.n(str), "Failed to insert default event parameters (got -1). appId");
                    }
                } catch (SQLiteException e) {
                    dq6.h(bi6Var3);
                    wh6Var.d(bi6.n(str), "Error storing default event parameters. appId", e);
                    return;
                }
                break;
            case 3:
                zzgq zzgqVar = (zzgq) obj;
                zzgqVar.w.a();
                zzgqVar.w.g((m16) obj3, (String) obj2);
                break;
            default:
                u07 u07Var = (u07) obj;
                zzee zzeeVar = u07Var.d;
                dq6 dq6Var2 = u07Var.a;
                if (zzeeVar == null) {
                    bi6 bi6Var4 = dq6Var2.i;
                    dq6.h(bi6Var4);
                    bi6Var4.f.b("Failed to send default event parameters to service");
                } else {
                    try {
                        oa3.h((p97) obj3);
                        zzeeVar.s((Bundle) obj2, (p97) obj3);
                    } catch (RemoteException e2) {
                        bi6 bi6Var5 = dq6Var2.i;
                        dq6.h(bi6Var5);
                        bi6Var5.f.c(e2, "Failed to send default event parameters to service");
                        return;
                    }
                }
                break;
        }
    }

    public /* synthetic */ px5(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.w = i;
        this.z = obj;
        this.x = obj2;
        this.y = obj3;
    }
}
