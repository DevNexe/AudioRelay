package defpackage;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzbpq;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzdno;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class sa6 implements zzbpq {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public sa6(ta6 ta6Var) {
        this.b = ta6Var;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zza(Object obj, Map map) {
        switch (this.a) {
            case 0:
                if (map != null) {
                    String str = (String) map.get("height");
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            int i = Integer.parseInt(str);
                            synchronized (((ta6) this.b)) {
                                try {
                                    Object obj2 = this.b;
                                    ta6 ta6Var = (ta6) obj2;
                                    if (ta6Var.e0 != i) {
                                        ta6Var.e0 = i;
                                        ((ta6) obj2).requestLayout();
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        } catch (Exception e) {
                            zzcgn.zzk("Exception occurred while getting webview content height", e);
                        }
                    }
                }
                break;
            default:
                zzdno zzdnoVar = (zzdno) ((WeakReference) this.b).get();
                if (zzdnoVar != null && "_ac".equals((String) map.get("eventName"))) {
                    zzdnoVar.h.onAdClicked();
                    if (((Boolean) zzay.zzc().zzb(zzbiy.zziq)).booleanValue()) {
                        zzdnoVar.i.zzq();
                    }
                }
                break;
        }
    }

    public /* synthetic */ sa6(zzdno zzdnoVar) {
        this.b = new WeakReference(zzdnoVar);
    }
}
