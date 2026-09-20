package defpackage;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbxx;

/* JADX INFO: loaded from: classes3.dex */
public final class u66 implements DialogInterface.OnClickListener {
    public final /* synthetic */ String w;
    public final /* synthetic */ String x;
    public final /* synthetic */ zzbxx y;

    public u66(zzbxx zzbxxVar, String str, String str2) {
        this.y = zzbxxVar;
        this.w = str;
        this.x = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        zzbxx zzbxxVar = this.y;
        DownloadManager downloadManager = (DownloadManager) zzbxxVar.d.getSystemService("download");
        try {
            String str = this.w;
            String str2 = this.x;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            zzt.zzq();
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            zzbxxVar.zzg("Could not store picture.");
        }
    }
}
