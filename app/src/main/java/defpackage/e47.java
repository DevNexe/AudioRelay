package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzbf;
import com.google.android.gms.ads.internal.zzs;
import com.google.android.gms.internal.ads.zzapc;
import com.google.android.gms.internal.ads.zzcgg;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzfem;

/* JADX INFO: loaded from: classes.dex */
public final class e47 extends WebViewClient {
    public final /* synthetic */ zzs a;

    public e47(zzs zzsVar) {
        this.a = zzsVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        zzs zzsVar = this.a;
        zzbf zzbfVar = zzsVar.C;
        if (zzbfVar != null) {
            try {
                zzbfVar.zzf(zzfem.zzd(1, null, null));
            } catch (RemoteException e) {
                zzcgn.zzl("#007 Could not call remote method.", e);
            }
        }
        zzbf zzbfVar2 = zzsVar.C;
        if (zzbfVar2 != null) {
            try {
                zzbfVar2.zze(0);
            } catch (RemoteException e2) {
                zzcgn.zzl("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zzs zzsVar = this.a;
        int iZzw = 0;
        if (str.startsWith(zzsVar.zzq())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            zzbf zzbfVar = zzsVar.C;
            if (zzbfVar != null) {
                try {
                    zzbfVar.zzf(zzfem.zzd(3, null, null));
                } catch (RemoteException e) {
                    zzcgn.zzl("#007 Could not call remote method.", e);
                }
            }
            zzbf zzbfVar2 = zzsVar.C;
            if (zzbfVar2 != null) {
                try {
                    zzbfVar2.zze(3);
                } catch (RemoteException e2) {
                    zzcgn.zzl("#007 Could not call remote method.", e2);
                }
            }
            zzsVar.L0(0);
            return true;
        }
        if (str.startsWith("gmsg://scriptLoadFailed")) {
            zzbf zzbfVar3 = zzsVar.C;
            if (zzbfVar3 != null) {
                try {
                    zzbfVar3.zzf(zzfem.zzd(1, null, null));
                } catch (RemoteException e3) {
                    zzcgn.zzl("#007 Could not call remote method.", e3);
                }
            }
            zzbf zzbfVar4 = zzsVar.C;
            if (zzbfVar4 != null) {
                try {
                    zzbfVar4.zze(0);
                } catch (RemoteException e4) {
                    zzcgn.zzl("#007 Could not call remote method.", e4);
                }
            }
            zzsVar.L0(0);
            return true;
        }
        if (str.startsWith("gmsg://adResized")) {
            zzbf zzbfVar5 = zzsVar.C;
            if (zzbfVar5 != null) {
                try {
                    zzbfVar5.zzi();
                } catch (RemoteException e5) {
                    zzcgn.zzl("#007 Could not call remote method.", e5);
                }
            }
            zzsVar.getClass();
            String queryParameter = Uri.parse(str).getQueryParameter("height");
            if (!TextUtils.isEmpty(queryParameter)) {
                try {
                    zzaw.zzb();
                    iZzw = zzcgg.zzw(zzsVar.z, Integer.parseInt(queryParameter));
                } catch (NumberFormatException unused) {
                }
            }
            zzsVar.L0(iZzw);
            return true;
        }
        if (str.startsWith("gmsg://")) {
            return true;
        }
        zzbf zzbfVar6 = zzsVar.C;
        if (zzbfVar6 != null) {
            try {
                zzbfVar6.zzc();
                zzsVar.C.zzh();
            } catch (RemoteException e6) {
                zzcgn.zzl("#007 Could not call remote method.", e6);
            }
        }
        if (zzsVar.D != null) {
            Uri uriZza = Uri.parse(str);
            try {
                uriZza = zzsVar.D.zza(uriZza, zzsVar.z, null, null);
            } catch (zzapc e7) {
                zzcgn.zzk("Unable to process ad data", e7);
            }
            str = uriZza.toString();
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        zzsVar.z.startActivity(intent);
        return true;
    }
}
