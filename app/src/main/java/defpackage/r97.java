package defpackage;

import android.net.Uri;
import android.os.AsyncTask;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.zzs;
import com.google.android.gms.internal.ads.zzapb;
import com.google.android.gms.internal.ads.zzapc;
import com.google.android.gms.internal.ads.zzbkc;
import com.google.android.gms.internal.ads.zzcgn;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class r97 extends AsyncTask {
    public final /* synthetic */ zzs a;

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        zzs zzsVar = this.a;
        try {
            zzsVar.D = (zzapb) zzsVar.y.get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e = e;
            zzcgn.zzk("", e);
        } catch (ExecutionException e2) {
            e = e2;
            zzcgn.zzk("", e);
        } catch (TimeoutException e3) {
            zzcgn.zzk("", e3);
        }
        zzsVar.getClass();
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) zzbkc.zzd.zze());
        ha7 ha7Var = zzsVar.A;
        builder.appendQueryParameter("query", ha7Var.d);
        builder.appendQueryParameter("pubId", ha7Var.b);
        builder.appendQueryParameter("mappver", ha7Var.f);
        TreeMap treeMap = ha7Var.c;
        for (String str : treeMap.keySet()) {
            builder.appendQueryParameter(str, (String) treeMap.get(str));
        }
        Uri uriBuild = builder.build();
        zzapb zzapbVar = zzsVar.D;
        if (zzapbVar != null) {
            try {
                uriBuild = zzapbVar.zzb(uriBuild, zzsVar.z);
            } catch (zzapc e4) {
                zzcgn.zzk("Unable to process ad data", e4);
            }
        }
        return LPt6Fixed.a(zzsVar.zzq(), "#", uriBuild.getEncodedQuery());
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        WebView webView = this.a.B;
        if (webView == null || str == null) {
            return;
        }
        webView.loadUrl(str);
    }
}
