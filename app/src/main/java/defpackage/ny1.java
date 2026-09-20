package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.ads.internal.zzi;
import com.google.android.gms.common.api.QnHx;
import com.google.android.gms.common.internal.service.zai;
import com.google.android.gms.internal.ads.zzfni;
import com.unity3d.ads.metadata.MediationMetaData;
import j$.util.concurrent.ConcurrentHashMap;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ny1 implements zzfni, em3, yu2, nu2, ju2, G0q, ze {
    public Object w;

    public /* synthetic */ ny1(Object obj) {
        this.w = obj;
    }

    public static String j(Bundle bundle, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put(MediationMetaData.KEY_NAME, str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.em3
    public final void a(QnHx.NUlFixed nUl, z05 z05Var) {
        n15 n15Var = (n15) this.w;
        QnHx<o15> qnHx = ir5.i;
        zai zaiVar = (zai) ((kr5) nUl).getService();
        zaiVar.getClass();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(zaiVar.x);
        int i = bq5.a;
        if (n15Var == null) {
            parcelObtain.writeInt(0);
        } else {
            parcelObtain.writeInt(1);
            n15Var.writeToParcel(parcelObtain, 0);
        }
        try {
            zaiVar.w.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            z05Var.a(null);
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // defpackage.ze
    public final void b(xe xeVar) {
        this.w = xeVar;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", null);
        }
    }

    @Override // defpackage.ju2
    public final void c() {
        ((CountDownLatch) this.w).countDown();
    }

    @Override // defpackage.G0q
    public final void d(Bundle bundle, String str) {
        xe xeVar = (xe) this.w;
        if (xeVar != null) {
            try {
                xeVar.a("$A$:" + j(bundle, str));
            } catch (JSONException unused) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
    }

    public final int e() {
        return ((Parcel) this.w).dataAvail();
    }

    public final float f() {
        return ((Parcel) this.w).readFloat();
    }

    public final long g() {
        long j;
        byte b = ((Parcel) this.w).readByte();
        if (b == 1) {
            j = 4294967296L;
        } else {
            j = b == 2 ? 8589934592L : 0L;
        }
        return a65.a(j, 0L) ? z55.c : FWT.G(j, f());
    }

    public final void h() {
        Socket socket;
        jj3 jj3Var = (jj3) this.w;
        Iterator<ej3> it = jj3Var.e.iterator();
        while (it.hasNext()) {
            ej3 next = it.next();
            synchronized (next) {
                if (next.p.isEmpty()) {
                    it.remove();
                    next.j = true;
                    socket = next.d;
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                qf5.e(socket);
            }
        }
        if (jj3Var.e.isEmpty()) {
            jj3Var.c.a();
        }
    }

    public final hr2 i(c54 c54Var) {
        vq2 vq2VarK = vq2.k(((ln2) this.w).f(c54Var), ((ln2) this.w).g(c54Var), new oy3(this));
        vq2VarK.getClass();
        return new hr2(vq2VarK);
    }

    public final void k() {
        boolean z;
        do {
            z = false;
            if (((AtomicInteger) this.w).compareAndSet(0, -1)) {
                return;
            }
            if (((AtomicInteger) this.w).get() == -1) {
                z = true;
            }
        } while (!z);
    }

    @Override // defpackage.nu2
    public final void onFailure(Exception exc) {
        ((CountDownLatch) this.w).countDown();
    }

    @Override // defpackage.yu2
    public final void onSuccess(Object obj) {
        ((CountDownLatch) this.w).countDown();
    }

    @Override // com.google.android.gms.internal.ads.zzfni
    public final void zza(int i, long j) {
        ((zzi) this.w).D.zzd(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfni
    public final void zzb(int i, long j, String str) {
        ((zzi) this.w).D.zze(i, System.currentTimeMillis() - j, str);
    }

    public /* synthetic */ ny1() {
        this.w = new CountDownLatch(1);
    }

    public /* synthetic */ ny1(sd2 sd2Var) {
        this.w = sd2Var;
    }

    public /* synthetic */ ny1(ln2 ln2Var) {
        this.w = ln2Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ny1(int i) {
        Object x;
        this(TimeUnit.MINUTES);
        if (i == 2) {
            if (Build.VERSION.SDK_INT >= 28) {
                x = new fp1();
            } else {
                x = new X();
            }
            this.w = x;
            return;
        }
        if (i != 5) {
            switch (i) {
                case 10:
                    this.w = new Bundle();
                    break;
                case 11:
                    break;
                case 12:
                    this.w = new ConcurrentHashMap();
                    break;
                case 13:
                    break;
                case 14:
                    this.w = new LinkedHashSet();
                    break;
                default:
                    this.w = new ArrayDeque();
                    break;
            }
            return;
        }
        this.w = new AtomicInteger();
    }

    public /* synthetic */ ny1(TimeUnit timeUnit) {
        this.w = new jj3(h15.i, timeUnit);
    }

    public /* synthetic */ ny1(String str) {
        this.w = Parcel.obtain();
        byte[] bArrDecode = Base64.decode(str, 0);
        ((Parcel) this.w).unmarshall(bArrDecode, 0, bArrDecode.length);
        ((Parcel) this.w).setDataPosition(0);
    }
}
