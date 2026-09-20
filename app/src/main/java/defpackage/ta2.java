package defpackage;

import android.database.Cursor;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.internal.ads.zzake;
import com.google.android.gms.internal.ads.zzakj;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzchf;
import com.google.android.gms.internal.ads.zzfyk;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ta2 implements zzake, zzfyk, a90, k37, b2J {
    public final /* synthetic */ int w;
    public Object x;

    public /* synthetic */ ta2(Object obj, int i) {
        this.w = i;
        this.x = obj;
    }

    @Override // defpackage.k37
    public final void a(Bundle bundle, String str) {
        if (!TextUtils.isEmpty(str)) {
            ((dy6) this.x).getClass();
            throw new IllegalStateException("Unexpected call on client side");
        }
        dy6 dy6Var = (dy6) this.x;
        dy6Var.a.n.getClass();
        dy6Var.k("auto", "_err", bundle, true, true, System.currentTimeMillis());
    }

    @Override // defpackage.b2J
    public final void b(Bundle bundle) {
        ((CSv) this.x).b(bundle, "clx", "_ae");
    }

    public final void c(byte b) {
        ((Parcel) this.x).writeByte(b);
    }

    public final void d(float f) {
        ((Parcel) this.x).writeFloat(f);
    }

    public final void e(long j) {
        long jB = z55.b(j);
        byte b = 0;
        if (!a65.a(jB, 0L)) {
            if (a65.a(jB, 4294967296L)) {
                b = 1;
            } else if (a65.a(jB, 8589934592L)) {
                b = 2;
            }
        }
        c(b);
        if (a65.a(z55.b(j), 0L)) {
            return;
        }
        d(z55.c(j));
    }

    public final float f(int i, int i2) {
        return ((Float[]) ((tp1[]) this.x)[i].b)[i2].floatValue();
    }

    public final tp1 g(int i) {
        return ((tp1[]) this.x)[i];
    }

    public final qg4 h(JSONObject jSONObject) throws JSONException {
        qh4 th4Var;
        int i = jSONObject.getInt("settings_version");
        if (i != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.", null);
            th4Var = new uh0();
        } else {
            th4Var = new th4();
        }
        return th4Var.a((m57) this.x, jSONObject);
    }

    public final void i(float f, int i, int i2) {
        ((Float[]) ((tp1[]) this.x)[i].b)[i2] = Float.valueOf(f);
    }

    public final Object j() {
        xw6 xw6Var = (xw6) this.x;
        Cursor cursorQuery = xw6Var.a.query(xw6Var.b, xw6.i, null, null, null);
        if (cursorQuery == null) {
            return Collections.emptyMap();
        }
        try {
            int count = cursorQuery.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            Map bt7j = count <= 256 ? new Bt7j(count) : new HashMap(count, 1.0f);
            while (cursorQuery.moveToNext()) {
                bt7j.put(cursorQuery.getString(0), cursorQuery.getString(1));
            }
            return bt7j;
        } finally {
            cursorQuery.close();
        }
    }

    @Override // defpackage.a90
    public final Object then(w05 w05Var) {
        switch (this.w) {
            case 10:
                da7 da7Var = (da7) this.x;
                if (w05Var.n() || w05Var.l()) {
                    return w05Var;
                }
                Exception excJ = w05Var.j();
                if (!(excJ instanceof ApiException)) {
                    return w05Var;
                }
                int i = ((ApiException) excJ).w.x;
                if (i == 43001 || i == 43002 || i == 43003 || i == 17) {
                    return da7Var.b.a();
                }
                if (i == 43000) {
                    return k15.d(new Exception("Failed to get app set ID due to an internal error. Please try again later."));
                }
                return i != 15 ? w05Var : k15.d(new Exception("The operation to get app set ID timed out. Please try again later."));
            default:
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((Collection) this.x);
                return k15.e(arrayList);
        }
    }

    public final String toString() {
        switch (this.w) {
            case 20:
                return i5.b(new StringBuilder("Phase('"), (String) this.x, "')");
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzake
    public final void zza(zzakj zzakjVar) {
        ((zzchf) this.x).zze(zzakjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    /* JADX INFO: renamed from: zzb */
    public final /* synthetic */ void mo32zzb(Object obj) {
        zzcgn.zze("Initialized webview successfully for SDKCore.");
    }

    public /* synthetic */ ta2(ix5 ix5Var) {
        this.w = 11;
        this.x = ix5Var;
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final void zza(Throwable th) {
        zzt.zzp().zzt(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        zzaa zzaaVar = (zzaa) this.x;
        zzf.zzc(zzaaVar.I, zzaaVar.A, "sgf", new Pair("sgf_reason", th.getMessage()));
        zzcgn.zzh("Failed to initialize webview for loading SDKCore. ", th);
    }

    public ta2(ze4 ze4Var) {
        this.w = 7;
        this.x = ze4Var;
    }

    public ta2(op2 op2Var) {
        this.w = 5;
        this.x = op2Var;
    }

    public ta2(String str) {
        this.w = 20;
        this.x = str;
    }

    public ta2(iu1 iu1Var) {
        this.w = 6;
        this.x = iu1Var;
    }

    public ta2(zv2 zv2Var) {
        this.w = 4;
        this.x = zv2Var;
    }

    public ta2(int i) {
        this.w = i;
        if (i == 18) {
            this.x = new ConcurrentHashMap();
        } else if (i != 19) {
            this.x = Parcel.obtain();
        }
    }

    public ta2(int i, int i2) {
        this.w = 0;
        tp1[] tp1VarArr = new tp1[i];
        for (int i3 = 0; i3 < i; i3++) {
            tp1VarArr[i3] = new tp1(i2, 1);
        }
        this.x = tp1VarArr;
    }
}
