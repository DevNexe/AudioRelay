package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.R;
import defpackage.u66;
import defpackage.v66;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbxx extends zzbya {
    public final Map c;
    public final Activity d;

    public zzbxx(zzcmn zzcmnVar, Map map) {
        super(zzcmnVar, "storePicture");
        this.c = map;
        this.d = zzcmnVar.zzk();
    }

    public final void zzb() {
        Activity activity = this.d;
        if (activity == null) {
            zzg("Activity context is not available");
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzq();
        if (!new zzbii(activity).zzc()) {
            zzg("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.c.get("iurl");
        if (TextUtils.isEmpty(str)) {
            zzg("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(str)) {
            zzg("Invalid image url: ".concat(String.valueOf(str)));
            return;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        com.google.android.gms.ads.internal.zzt.zzq();
        if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
            zzg("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
            return;
        }
        Resources resourcesZzd = com.google.android.gms.ads.internal.zzt.zzp().zzd();
        com.google.android.gms.ads.internal.zzt.zzq();
        AlertDialog.Builder builderZzG = com.google.android.gms.ads.internal.util.zzs.zzG(activity);
        builderZzG.setTitle(resourcesZzd != null ? resourcesZzd.getString(R.string.s1) : "Save image");
        builderZzG.setMessage(resourcesZzd != null ? resourcesZzd.getString(R.string.s2) : "Allow Ad to store image in Picture gallery?");
        builderZzG.setPositiveButton(resourcesZzd != null ? resourcesZzd.getString(R.string.s3) : "Accept", new u66(this, str, lastPathSegment));
        builderZzG.setNegativeButton(resourcesZzd != null ? resourcesZzd.getString(R.string.s4) : "Decline", new v66(this));
        builderZzG.create().show();
    }
}
