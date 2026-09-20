package defpackage;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzbcb;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbcl;
import defpackage.q36;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class q36 implements Runnable {
    public final zzbci w;
    public final /* synthetic */ WebView x;
    public final /* synthetic */ zzbcl y;

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.zzbci] */
    public q36(zzbcl zzbclVar, final zzbcb zzbcbVar, final WebView webView, final boolean z) {
        this.y = zzbclVar;
        this.x = webView;
        this.w = new ValueCallback() { // from class: com.google.android.gms.internal.ads.zzbci
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                q36 q36Var = this.zza;
                zzbcb zzbcbVar2 = zzbcbVar;
                WebView webView2 = webView;
                boolean z2 = z;
                String str = (String) obj;
                zzbcl zzbclVar2 = q36Var.y;
                zzbclVar2.getClass();
                zzbcbVar2.zzg();
                try {
                    if (!TextUtils.isEmpty(str)) {
                        String strOptString = new JSONObject(str).optString("text");
                        if (zzbclVar2.J || TextUtils.isEmpty(webView2.getTitle())) {
                            zzbcbVar2.zzl(strOptString, z2, webView2.getX(), webView2.getY(), webView2.getWidth(), webView2.getHeight());
                        } else {
                            zzbcbVar2.zzl(webView2.getTitle() + "\n" + strOptString, z2, webView2.getX(), webView2.getY(), webView2.getWidth(), webView2.getHeight());
                        }
                    }
                    if (zzbcbVar2.zzo()) {
                        zzbclVar2.z.zzc(zzbcbVar2);
                    }
                } catch (JSONException unused) {
                    zzcgn.zze("Json string may be malformed.");
                } catch (Throwable th) {
                    zzcgn.zzf("Failed to get webview content.", th);
                    com.google.android.gms.ads.internal.zzt.zzp().zzt(th, "ContentFetchTask.processWebViewContent");
                }
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbci zzbciVar = this.w;
        WebView webView = this.x;
        if (webView.getSettings().getJavaScriptEnabled()) {
            try {
                webView.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", zzbciVar);
            } catch (Throwable unused) {
                zzbciVar.onReceiveValue("");
            }
        }
    }
}
